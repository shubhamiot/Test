<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>THANKYOU FOR BUYING</title>
</head>
<body>
<c:choose>
<c:when test="${mode=='MODE_THANKYOU' }">
<h1>Thank You For Buying FROM US</h1>
</c:when>
</c:choose>
</body>
</html>