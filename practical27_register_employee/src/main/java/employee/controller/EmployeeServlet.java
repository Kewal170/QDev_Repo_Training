package employee.controller;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import employee.dao.EmployeeDao;
import employee.model.Employee;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmployeeDao employeeDao = new EmployeeDao();

    public EmployeeServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward to employeeDetails.jsp if needed
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeDetails.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String contact = request.getParameter("contact");

            Employee employee = new Employee();
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setUsername(username);
            employee.setPassword(password);
            employee.setAddress(address);
            employee.setContact(contact);

            employeeDao.registerEmployee(employee);

            // Save employee in request to show on success page
            request.setAttribute("employee", employee);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Forward to index.jsp after registration
        // Forward to employeeDetails.jsp after registration
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeDetails.jsp");
        dispatcher.forward(request, response);

    }
}
