<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bugtracker | My Tickets</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

</head>
<body>
<%@ include file="../common/navbar.jsp" %>
<div class="container">
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">Id</th>
	      <th scope="col">Title</th>
	      <th scope="col">Created By</th>
	      <th scope="col">Assigned To</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="ticket" items="${tickets}">
	    
		    <tr>
		      <th scope="row">${ticket.ticketId}</th>
		      <td> <a href="/tickets/${ticket.ticketId}"> ${ticket.title} </a> </td>
		      <td>${ticket.createdBy}</td>
		      <td>${ticket.issuedTo}</td>
		    </tr>
	    
	  </c:forEach>
	  </tbody>
	</table>
</div>


	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
	
</body>
</html>