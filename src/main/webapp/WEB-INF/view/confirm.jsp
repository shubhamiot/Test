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
<title>Confirm</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<meta charset="ISO-8859-1">

</head>
<body>

<c:choose>
		<c:when test="${mode=='CNF_BOOKING' }">
			<div class="container text-center">
				<h3>CONFIRM Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="/savetocart">
					<div class="form-group">
						<label class="control-label col-md-3">Train Number</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="trainno"
								value="${train.trainno }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Train Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="trainname"
								value="${train.trainname }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Time</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="traintime"
								value="${train.traintime }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Origin Station</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="origins"
								value="${train.origins }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Destination Station</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="destinations"
								value="${train.destinations }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">End Time</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="endtraintime"
								value="${train.endtraintime }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Price </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="price" 
							value="${train.price }"/>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">No of Seats </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="quantity" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Confirm Booking" />
					</div>
				</form>
			</div>
		</c:when>
		</c:choose>
</body>
</html>