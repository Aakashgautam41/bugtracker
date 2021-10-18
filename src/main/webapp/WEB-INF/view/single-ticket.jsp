<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bugtracker | Ticket</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<style>
	.ticket-wrapper{
		padding: 1rem;
		margin: 1rem;
		border: 1px solid #AEAFAF;
		border-radius: 1rem;
	}
</style>
</head>
<body>
<%@ include file="../common/navbar.jsp" %>

<div class="container">
 	<div>
	  <div class="ticket-wrapper">
	    <h3>${ticket.title} </h3>
	    <p class="text-wrap">${ticket.desc} </p>
	    <p><span class="text-muted">Created By - </span> ${ticket.createdBy} </p>
		<p><span class="text-muted">Assigned To - </span> ${ticket.issuedTo} </p>
	  </div>
	</div>
	
</div>


	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
	
</body>
</html>