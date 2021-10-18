<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Ticket</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

</head>
<body>
 <%@ include file="../common/navbar.jsp" %>
	<div class="container">
		<form method="POST">
		<h2>Create Ticket</h2>
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Title</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="title">
		  </div>
		  
		   <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Description</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="description">
		    
		  </div>
		   <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Assigned to</label>
	    	<select class="form-select" name="employeeId" aria-label="Default select example">
			  <option selected>Open this select menu</option>
			  <c:forEach var="projectMember" items="${projectMembers}">
			  	<option value="${projectMember.id}">${projectMember.firstName}</option>
			  </c:forEach>
			</select>
		  </div>
		  
		  <div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Created By</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="createdBy" value="${name}" readonly>
		  </div>
	
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
	
</body>
</html>