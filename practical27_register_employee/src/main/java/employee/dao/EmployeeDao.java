package employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import employee.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String insertUserSqlQuery = " INSERT INTO employee_register " +
				" (first_name, last_name, username, password, address, contact_no) VALUES " +
				" (?, ?, ? ,? ,? ,?); ";
		int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kewal?useSSL=false&serverTimezone=UTC","root","root");
				PreparedStatement preparedStatement = connection.prepareStatement(insertUserSqlQuery)){
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUsername());
			preparedStatement.setString(4, employee.getPassword());
			preparedStatement.setString(5, employee.getAddress());
			preparedStatement.setString(6, employee.getContact());
			
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
}
