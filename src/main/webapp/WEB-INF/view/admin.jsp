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
<title>Admin Access</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
</head>
<body>
<h1>ADMIN DATABASE</h1>
<form>
<c:choose>

<c:when test="${mode=='ALL_U' }">
			<div class="container text-center" id="tasksDiv">
				<h3>All Registered Trains</h3>
				<hr>
				<form class="form-horizontal" action="/login-admin">
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Train Number</th>
								<th>Train Name</th>
								<th>Start Time</th>
								<th>Origin Station</th>
								<th>Destination Station</th>
								<th>End Time</th>
								<th>Price</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="train" items="${trains }">
								<tr>
									<td>${train.trainno}</td>
									<td>${train.trainname}</td>
									<td>${train.traintime}</td>
									<td>${train.origins}</td>
									<td>${train.destinations}</td>
									<td>${train.endtraintime}</td>
									<td>${train.price}</td>
									<td><a href="/deletetrain?id=${train.id }" action="/savetrain"><span
											class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				</form>
			</div>
		</c:when>
		
		
		</c:choose>
		</form>
		<a href="/newtrain">Create New Train</a>
		<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>

</body>
</html>