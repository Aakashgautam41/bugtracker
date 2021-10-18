<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bugtracker | Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

</head>
<body>
<%@ include file="../common/navbar.jsp" %>
	<div class="container mt-3">
		<form method="POST">
		<h2>Register</h2> <hr>
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input type="email" class="form-control" id="exampleInputEmail1" name="email">
		  </div>
		   <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">First Name</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="firstName">
		  </div>
		   <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Last Name</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="lastName">
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Password</label>
		    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
		  </div>
		  <div>
		  <label for="exampleInputPassword1" class="form-label">Project</label>
	  		<select class="form-select" name="projectId" aria-label="Default select example">
				  <option selected>Select a project</option>
				  <c:forEach var="project" items="${projectList}">
				  	<option value="${project.projectId}">${project.projectName}</option>
				  </c:forEach>
			</select>
		   </div>
		  <button type="submit" class="btn btn-primary mt-2">Submit</button>
		</form>
		<div class="mt-3">
			<p>Already have an account <a href="/login">Login</a>  instead</p>
		</div>	
	</div>
	
	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
	
</body>
</html>