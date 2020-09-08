<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data after from submission</title>
</head>
<body>
  <h1>Form Submitted!!!!</h1>
  <h2>${header}</h2>
  <p>${desc}</p>
  
  <h1>Welcome, ${user.username}</h1>
  <h2>Your email is,${user.email}</h2>
  <h3>Your password is,${user.password}</h3>
</body>
</html>