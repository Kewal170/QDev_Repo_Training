<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
    <h2>Employee Registration Form</h2>
    <form action="<%= request.getContextPath() %>/register" method="post">
        <table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" required></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName" required></td>
            </tr>
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username" required></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><textarea name="address" rows="3" cols="30" required></textarea></td>
            </tr>
            <tr>
                <td>Contact No:</td>
                <td><input type="text" name="contact" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Register"></td>
            </tr>
        </table>
    </form>
</body>
</html>
