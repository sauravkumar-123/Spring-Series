<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.time.LocalDateTime" %>
 <%@ page import="java.util.*" %>
 <%@ page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
  <h1>Contact us:-</h1>
  <%
  /*String email=(String)request.getAttribute("Email");
  
  String mobnoformat=(String)request.getAttribute("Mobno");
  long mobno=Long.parseLong(mobnoformat);
  
  LocalDateTime time=(LocalDateTime)request.getAttribute("Time");
  List<String> Officelist=(ArrayList<String>) request.getAttribute("OfficeLocation");*/
  %>
  
  <h2>Email:- 
  <%-- <%= email %> --%>
  ${ Email}
  </h2>
  
  <h2>Mobno:- 
 <%--  <%= mobno %> --%>
 ${ Mobno}
  </h2>
  
  <h2>Date&Time:- 
 <%--  <%=time.toLocalTime().toString() %> --%>
 ${ Time}
  </h2>
  <hr>
  <h2>Office-Location:- 
<%--  <%=Officelist.toString() %> --%>
${ OfficeLocation}
  </h2>
  
  <hr>
  <c:forEach var="data" items="${ OfficeLocation}">
  <h1>${data}</h1>
  <h2> <c:out value="${data}"></c:out></h2>
  </c:forEach>
  
</body>
</html>