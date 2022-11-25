<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
  margin: 20;
  
		background-image: url("https://t3.ftcdn.net/jpg/01/18/17/52/360_F_118175297_GZcJbKj0f4Jemq8EDIXIYbUFuTpoMwLT.jpg");
		background-size: 100%;
}

.nav {
  overflow: hidden;
  background-color: #000000;
}

.nav a {
  float: left;
  color: #ffffff;
  text-align: center;
  padding: 29px 19px;
  text-decoration: none;
  font-size: 19px;

}

.nav a:hover {
  background-color: #D9D3AA;
  color: black;
}


</style>
</head>
<body>

<div class="nav">
  <a class="active" href="/viewcustomers">View Users</a>
  <a href="/addvegdets">Add veg details</a>
  <a href="/viewveg">View Veg details</a>
  <a href="/viewrev">View reviews</a>
  <a href="/adminlogout">Logout</a>
</div>
  <marquee><h1 style="color:white">WELCOME TO ONLINE VEG BASKET</h1></marquee>
</body>
</html>