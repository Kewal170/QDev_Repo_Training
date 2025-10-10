<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
    <h2>Employee Registration Successful!</h2>
    <p>Here are the details you submitted:</p>
    <table border="1" cellpadding="5">
        <tr>
            <td>First Name:</td>
            <td><%= request.getParameter("firstName") %></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><%= request.getParameter("lastName") %></td>
        </tr>
        <tr>
            <td>Username:</td>
            <td><%= request.getParameter("username") %></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><%= request.getParameter("password") %></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><%= request.getParameter("address") %></td>
        </tr>
        <tr>
            <td>Contact No:</td>
            <td><%= request.getParameter("contact") %></td>
        </tr>
    </table>
</body>
</html>
