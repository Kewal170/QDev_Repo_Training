package com.kewal.customers.service;

import com.kewal.customers.model.Customer;
import com.kewal.customers.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class to handle Customer-related business logic.
 */
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    /**
     * Constructor for CustomerService.
     *
     * @param customerRepository the repository to be used
     */
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Retrieves all customers.
     *
     * @return list of all customers
     */
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    /**
     * Retrieves a customer by ID.
     *
     * @param id the ID of the customer
     * @return the customer if found, otherwise null
     */
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    /**
     * Saves a customer.
     *
     * @param customer the customer to save
     * @return the saved customer
     */
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Deletes a customer by ID.
     *
     * @param id the ID of the customer to delete
     */
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
