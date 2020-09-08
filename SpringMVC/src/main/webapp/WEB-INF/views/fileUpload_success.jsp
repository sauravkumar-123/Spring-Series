<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success!!!!</title>
</head>
<body>
  <h2>Image Uploaded...</h2>
  
  <h2>${msg}</h2>
  
  <img alt="profile image" src="<c:url value="/resources/ServerData/${filename}"/> "/>
  
</body>
</html>