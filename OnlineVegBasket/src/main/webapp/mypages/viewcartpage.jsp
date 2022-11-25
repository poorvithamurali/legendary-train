<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="eng">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Cart</title>
<style type="text/css">
	.container
	{
		margin-left:130px;
		margin-top: 30px;
	}
	body{
		background-repeat: no-repeat;
		background-size: cover;
		 background-image:url("https://t3.ftcdn.net/jpg/01/18/17/52/360_F_118175297_GZcJbKj0f4Jemq8EDIXIYbUFuTpoMwLT.jpg");
	}
</style>
</head>
<body>
<br>
<div class="container">
<div class="card " style="height: 60px">
  <div class="card-header" style="height: 60px">
   <h3 style="text-align: center;"> CART INFO</h3>
  </div>
  <br>
 </div>
	<table class="table table-success table-striped">
  <thead>
    <tr>
      <th scope="col" style="text-align: center">ID</th>
      <th scope="col" style="text-align: center">VEG NAME</th>
      <th scope="col" style="text-align: center">QUANTITY (in Kgs)</th>
      <th scope="col" style="text-align: center">VEG PRICE</th>
      <th scope="col" style="text-align: center">ACTIONS</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${cartlist}" var="cart">
 		<tr>
 			<td class="table-success" style="text-align: center;color: black;">${cart.id}</td>
 			<td class="table-success" style="text-align: center;color: black;">${cart.vegname}</td>
 			<td class="table-success" style="text-align: center;color: black;">${cart.quantity}</td>
 			<td class="table-success" style="text-align: center;color: black;">${cart.originalprice}</td>
 			<td class="table-success" style="text-align: center;color: black;"><a href="/deletecartbyid/${cart.id}" role="button" class="btn btn-danger">Remove</a>
 		</tr>
 		</c:forEach>
 </tbody>
 </table>
 <h2 style="color: black; text-align: center;">TOTAL : ${finalprice}</h2>
 <br>
 <div style="text-align: center;">
 <a href="/placeorder" role="button" class="btn btn-success"><strong>PLACE ORDER</strong></a>
 </div>
 </div>	
</body>
</html>