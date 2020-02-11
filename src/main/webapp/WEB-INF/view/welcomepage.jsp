<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div role="navigation">
		<div class="navbar navbar-inverse">
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/register">New User Registration</a></li>
					<li><a href="/login">Login</a></li>
				</ul>
			</div>
		</div>
	</div>
<c:choose>
	<c:when test="${mode=='MODE_HOMEPAGE' }">
	<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>Welcome to Train Ticket Resrvation Website</h1>
				</div>
			</div>
	</c:when>
	</c:choose>
<script src="static/js/jquery-1.11.1.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>

</body>
</html>