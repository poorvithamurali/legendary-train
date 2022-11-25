<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Online Veg Basket</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<style>
	.container{
	margin-top: 180px;
	}
	.btn{
	min-width: 50px;
	}
	body
	{	
		background-image: url("");
		background-size: 100%;
	}
	.title{
		background-color: white;
  		width: 300px;
  		border: 15px solid green;
  		padding: 50px;
  		margin: 20px;
	}
	.logo{
		margin-left: 250px;
		margin-top: 30px;
	}
	.header{
		margin-left: 220px;
	}
	
</style>
</head>
<body>
	
	<div class="container">
		<div class="header">
		<div class="card text-center" style="width:40em;">
  <div class="card-header">
  <h4> <strong> Welcome to Online Veg Basket</strong></h4>
  </div>
  </div>
  </div>
  	<div class="logo">
		<div class="row">
			<div class="col-4 d-flex justify-content-center text-center">
				<img src=" https://t3.ftcdn.net/jpg/00/07/32/48/360_F_7324855_mx4CEBWTr81XLOrlQccCROtP2uNR7xbk.jpg" width="190px" height="190px">
				<br>
				
			</div>
			<br>
				<div class="col-4 d-flex justify-content-center text-center">
				<img src="https://thecustomer.ie/wp-content/uploads/2018/01/500px-logo.png" width="190px" height=190px style="text-align: center;">
				
			</div>
		</div>
		<div class="row">
			<div class="col-4 d-flex justify-content-center text-center">
				<br><br>
				<div class="btn">
				<a role="button" class="btn btn-dark btn-lg" href="/adminlogin"><strong>ADMIN</strong></a>
				</div>
			</div>
			<div class="col-4 d-flex justify-content-center text-center">
			<br><br>
				<div class="btn">
				<a role="button" class="btn btn-dark btn-lg" href="/customerlogin"><strong>USER</strong></a>
				</div>
			</div>
		</div>
	</div>
</div>
<a href="/signup"><center>New User?Signup</center></a>
</body>
</html>