package com.kewal.customers.controller;

import com.kewal.customers.model.Customer;
import com.kewal.customers.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class to manage customer-related operations.
 */
@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    /**
     * Constructor for CustomerController.
     *
     * @param customerService the customer service to be used
     */
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Displays the list of all customers.
     *
     * @param model the model to add attributes to
     * @return the customer list view
     */
    @GetMapping
    public String getAllCustomers(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }

    /**
     * Shows the form to create a new customer.
     *
     * @param model the model to add attributes to
     * @return the customer form view
     */
    @GetMapping("/new")
    public String showCreateCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer_form";
    }

    /**
     * Saves a new customer.
     *
     * @param customer the customer to save
     * @return redirect to the customer list view
     */
    @PostMapping
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customers";
    }

    /**
     * Shows the form to edit an existing customer.
     *
     * @param id    the ID of the customer to edit
     * @param model the model to add attributes to
     * @return the customer form view
     */
    @GetMapping("/edit/{id}")
    public String showEditCustomerForm(@PathVariable Long id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customer_form";
    }

    /**
     * Deletes a customer by ID.
     *
     * @param id the ID of the customer to delete
     * @return redirect to the customer list view
     */
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }
}
