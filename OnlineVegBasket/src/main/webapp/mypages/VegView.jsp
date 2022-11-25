<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
	.container
	{
		margin-left:10px;
		margin-top: 10px;
		
	}
	
	body{
		background-image: url("https://t3.ftcdn.net/jpg/01/18/17/52/360_F_118175297_GZcJbKj0f4Jemq8EDIXIYbUFuTpoMwLT.jpg");
		background-size: 100%;
	}
	.c1
	{
	width:60%;
	font-size: 20px;
  border: 4px solid black;
	border-radius:3px;
	}
	
	
</style>
 <script>
	function getLink(id,vegname,offerprice)
	{
		alert("Item has been added!");
		var q = document.getElementById("quantity"+id).value;
		window.location.href="/addtocart?vegname="+vegname+"&vegquantity="+q+"&offerprice="+offerprice;			
	} 

</script> 
</head>
<body>
<div class="container">
<div class="card ">
  
   <h1 style="text-align: center;"><strong><u>WELCOME TO ONLINE VEG BASKET</u></strong></h1>
  
 </div>
 		<br>
 <br>
 <br>
  <div class="c1">
    <c:forEach items="${vegetables}" var="vegetable" varStatus="status">
    	<div class="card text-center">
  		<div class="card-header">
    		${vegetable.vegname}
  		</div>
  		<div class="card-body">
    		<h5 class="card-title"><label>Veg Description </label>
			<input type="text" value="${vegetable.vegdesc}" name="desc" readonly>
    		</h5>
    		<h5 class="card-title"><label>Offer Percent </label>
			<input type="text" value="${vegetable.offerpercent}" name="offer" readonly>
    		</h5>
    		<h5 class="card-title"><label>Enter the quantity : </label>
			<input type="text" id="quantity${status.index}" name="quantity">
    		</h5>
    		<button onclick="getLink(${status.index},'${vegetable.vegname}','${vegetable.offerprice}')" class="btn btn-primary">Add to Cart</button>
  		</div>
  		<div class="card-footer text-muted">
    		Rs.${vegetable.offerprice}
  		</div>
		</div>
			<br>
 		</c:forEach>
 			</div>
 			<br>
 			<br>
 		</div>
</body>
</html>