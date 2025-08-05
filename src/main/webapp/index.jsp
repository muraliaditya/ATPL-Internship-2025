<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Complaint Tracking</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        header {
            background-color: #2c3e50;
            color: white;
            padding: 20px 0;
        }

        h1 {
            margin: 0;
            font-size: 28px;
            letter-spacing: 1px;
        }

        nav {
            margin: 20px 0;
        }

        nav a {
            text-decoration: none;
            color: #2c3e50;
            margin: 0 15px;
            font-size: 18px;
            font-weight: bold;
        }

        nav a:hover {
            color: #e74c3c;
        }

        hr {
            width: 60%;
            margin: 10px auto;
            border: 1px solid #ccc;
        }
    </style>
</head>
<body>

    <header>
        <h1>Online Complaint Tracking</h1>
    </header>

    <nav>
        <a href="register.jsp">Register Complaint</a> |
        <a href="view.jsp">View Complaints</a> |
        <a href="update.jsp">Update Status</a> |
        <a href="deleted.jsp">Delete Resolved</a>
    </nav>

    <hr>

</body>
</html>
