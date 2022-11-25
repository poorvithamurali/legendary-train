<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="eng">

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Veg view</title>
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
                <h3 style="text-align: center;"> VIEW VEG DETAILS</h3>
            </div>
        </div>
        <br>
        <br>
        <table class="table table-dark table-striped">
            <thead>
                <tr>
                    <th scope="col" style="text-align: center">Veg Id</th>
                    <th scope="col" style="text-align: center">Veg Name</th>
                    <th scope="col" style="text-align: center">Available Quantity(Kg)</th>
                    <th scope="col" style="text-align: center">Offer Price(Per kg)</th>
                    <th scope="col" style="text-align: center">Original Price(Per kg)</th>
                    <th scope="col" style="text-align: center">Offer Percent</th>
                    <th scope="col" style="text-align: center">Veg Description</th>
                    <th scope="col" style="text-align: center">ACTIONS</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${vegetables}" var="vegetable">
                    <tr>
                        <td class="table-dark" style="text-align: center">${vegetable.vegid}</td>
                        <td class="table-dark" style="text-align: center">${vegetable.vegname}</td>
                        <td class="table-dark" style="text-align: center">${vegetable.available}</td>
                        <td class="table-dark" style="text-align: center">${vegetable.offerprice}</td>
                        <td class="table-dark" style="text-align: center">${vegetable.originalprice}</td>
                        <td class="table-dark" style="text-align: center">${vegetable.offerpercent}</td>
                        <td class="table-dark" style="text-align: center">${vegetable.vegdesc}</td>
                        <td class="table-dark" style="text-align: center"><a href="/deleteveg/${vegetable.vegid}" role="button" class="btn btn-success">DELETE</a>
                            <a href="/editvegbyid/${vegetable.vegid}" role="button" class="btn btn-primary">UPDATE</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>

</html>