<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <link rel="stylesheet" href="static/css/style.css"> 
</head>
<body>
    <h1>Registration Form</h1>
    <form action="/registrations" method="POST">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required /><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required /><br><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required /><br><br>

        <button type="submit">Register</button>
    </form>

    <h2>Registrations List</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Date of Birth</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="registration" items="${registrations}">
            <tr>
                <td>${registration.name}</td>
                <td>${registration.email}</td>
                <td>${registration.dateOfBirth}</td>
                <td>
                    <form action="/${registration.id}/edit" method="POST" style="display:inline;">
                        <button type="submit">Edit</button>
                    </form>
                    <form action="/${registration.id}/delete" method="POST" style="display:inline;" onsubmit="return confirm('Are you sure you want to delete this registration?')">
                        <input type="hidden" name="_method" value="DELETE" />
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
