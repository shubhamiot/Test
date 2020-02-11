
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
<title>Train Ticket</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">

</head>
<body>
<form>
<c:choose>
<c:when test="${mode=='ALL_BOOKING' }">
			<div class="container text-center" id="tasksDiv">
			<div class="jumbotron text-center">
				<h3>All BOOKINGS</h3>
				</div>
				</div>
				<hr>
				<div>
				<form class="form-horizontal" action="/loginuser">
					<div class="table-responsive">
						<table class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>PNR</th>
									<th>Train Number</th>
									<th>Train Name</th>
									<th>Start Time</th>
									<th>Origin Station</th>
									<th>Destination Station</th>
									<th>End Time</th>
									<th>Price</th>
									
							</tr>
							</thead>
							<tbody>
								<c:forEach var="b" items="${bookings }">
									<tr>
										<td>${b.pnr}</td>
										<td>${b.trainno}</td>
										<td>${b.trainname}</td>
										<td>${b.traintime}</td>
										<td>${b.origins}</td>
										<td>${b.destinations}</td>
										<td>${b.endtraintime}</td>
										<td>${b.price}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</form>
			</div>
		</c:when>
	</c:choose>
	
	<a href="/dobooking">BOOK A TRAIN</a>
	</form>
		<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>