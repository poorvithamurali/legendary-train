<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reviews</title>
    
    
</head>
<body  background="vegetable.jpg">
    
<form  class="form-horizontal" >
<table border="2" width="70%" cellpadding="2">
<tr><th>Review Id</th>
<th>Name</th>
<th>Review</th>
<th>Rating</th>
<th>Edit</th>
<th>Delete</th></tr>  

   <c:forEach var="review" items="${reviews}"> 
   <tr>  
   <td>${review.reviewid}</td>  
   <td>${review.name}</td> 
   <td>${review.review}</td>  
   <td>${review.rating}</td> 
     <td><a href="/editrevbyid/${review.reviewid}">Edit</a></td>  
   <td><a href="/deleterev/${review.reviewid}">Delete</a></td>  
   </tr>  
   </c:forEach> 

  </table>  
   <br/>

   </form>

</body>
</html>