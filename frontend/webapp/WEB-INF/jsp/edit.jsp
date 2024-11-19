<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Registration</title>
    <link rel="stylesheet" href="static/css/style.css"> 
</head>
<body>
    <h1>Edit Registration</h1>
    <form action="/${registration.id}/update" method="POST">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${registration.name}" required /><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="${registration.email}" required /><br><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" value="${registration.dateOfBirth}" required /><br><br>

        <button type="submit">Update Registration</button>
    </form>

    <br>
    <a href="/">Back to Registrations List</a>
</body>
</html>
