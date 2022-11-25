<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="eng">

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>View Customers</title>
    <style>
        .container {
            margin-left: 2px;
            margin-top: 15x;
        }

        body {
            background-image: url("https://i.pinimg.com/originals/23/fc/b0/23fcb0c67bab5179efeaf1cfcc8eafc9.png");
            background-size: 100% 100%;
            background-atachment:fixed;
        }
    </style>
</head>

<body>
    <br>
    <div class="container">
        <div class="card " style="height: 60px">
            <div class="card-header" style="height: 60px">
                <h3 style="text-align: center;"> VIEW CUSTOMERS</h3>
            </div>
        </div>
        <br>
        <br>
        <table class="table table-dark table-striped">
            <thead>
                <tr>
                    <th scope="col" style="text-align: center">Id</th>
                    <th scope="col" style="text-align: center">Name</th>
                    <th scope="col" style="text-align: center">Age</th>
                    <th scope="col" style="text-align: center">Mobile</th>
                    <th scope="col" style="text-align: center">Email</th>
                    <th scope="col" style="text-align: center">Address</th>
                    <th scope="col" style="text-align: center">ACTIONS</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${customers}" var="customer">
                    <tr>
                        <td class="table-dark" style="text-align: center">${customer.id}</td>
                        <td class="table-dark" style="text-align: center">${customer.name}</td>
                        <td class="table-dark" style="text-align: center">${customer.age}</td>
                        <td class="table-dark" style="text-align: center">${customer.mobile}</td>
                        <td class="table-dark" style="text-align: center">${customer.email}</td>
                        <td class="table-dark" style="text-align: center">${customer.address}</td>
                        <td class="table-dark" style="text-align: center"><a href="/deletecustomer/${customer.id}" role="button" class="btn btn-success">DELETE</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>

</html>