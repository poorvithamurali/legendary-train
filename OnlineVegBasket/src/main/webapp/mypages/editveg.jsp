<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<style>
body {
	color: #fff;
	background: #63738a;
	font-family: 'Roboto', sans-serif;
}
.form-control {
	height: 40px;
	box-shadow: none;
	color: #969fa4;
}
.form-control:focus {
	border-color: #5cb85c;
}
.form-control, .btn {        
	border-radius: 3px;
}
.signup-form {
	width: 450px;
	margin: 0 auto;
	padding: 30px 0;
  	font-size: 15px;
}
.signup-form h2 {
	color: #636363;
	margin: 0 0 15px;
	position: relative;
	text-align: center;
}
.signup-form h2:before, .signup-form h2:after {
	content: "";
	height: 2px;
	width: 30%;
	background: #d4d4d4;
	position: absolute;
	top: 50%;
	z-index: 2;
}	
.signup-form h2:before {
	left: 0;
}
.signup-form h2:after {
	right: 0;
}
.signup-form .hint-text {
	color: #999;
	margin-bottom: 30px;
	text-align: center;
}
.signup-form form {
	color: #999;
	border-radius: 3px;
	margin-bottom: 15px;
	background: #f2f3f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}
.signup-form .form-group {
	margin-bottom: 20px;
}
.signup-form input[type="checkbox"] {
	margin-top: 3px;
}
.signup-form .btn {        
	font-size: 16px;
	font-weight: bold;		
	min-width: 140px;
	outline: none !important;
}
.signup-form .row div:first-child {
	padding-right: 10px;
}
.signup-form .row div:last-child {
	padding-left: 10px;
}    	
.signup-form a {
	color: #fff;
	text-decoration: underline;
}
.signup-form a:hover {
	text-decoration: none;
}
.signup-form form a {
	color: #5cb85c;
	text-decoration: none;
}	
.signup-form form a:hover {
	text-decoration: underline;
}  
</style>
</head>
<body>
<div class="signup-form">
    <form action="/editvegdata" method="post">
		<h2>Edit Veg Details</h2>
        <div class="form-group">
        	VEG ID<input type="number" class="form-control" name="vegid"  required="required"  value='<c:out value="${veg.vegid}"></c:out>'>
        </div>
        <div class="form-group">
        	VEG NAME<input type="text" class="form-control" name="vegname"  required="required"  value='<c:out value="${veg.vegname}"></c:out>'>
        </div>
		<div class="form-group">
            AVAILABLE QUANTITY<input type="number" class="form-control" name="available"  required="required"  value='<c:out value="${veg.available}"></c:out>'>
        </div>
		<div class="form-group">
          OFFER PRICE  <input type="number" step="any" class="form-control" name="offerprice" required="required"  value='<c:out value="${veg.offerprice}"></c:out>'>
        </div>    
        <div class="form-group">
           ORIGINAL PRICE <input type="number" step="any"  class="form-control" name="originalprice"  required="required"  value='<c:out value="${veg.originalprice}"></c:out>'>
        </div> 
        <div class="form-group">
          OFFER PERCENT  <input type="text" class="form-control" name="offerpercent" required="required"  value='<c:out value="${veg.offerpercent}"></c:out>'>
        </div>   
        <div class="form-group">
          VEG DESCRIPTION  <input type="text" class="form-control" name="vegdesc" required="required"  value='<c:out value="${veg.vegdesc}"></c:out>'>>
        </div>   
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Edit Veg</button>
        </div>
    </form>
</div>
</body>
</html>