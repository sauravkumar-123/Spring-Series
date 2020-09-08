<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*" %>
 <%-- <%@ page import="java.util.ArrayList" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
   <h1>Home Page</h1>
   <h2>Called by Controller</h2>
   
   <%
     String name=(String)request.getAttribute("Name");
     String email=(String)request.getAttribute("Email");
     String mobnoformat=(String)request.getAttribute("Mobno");
     long mobno=Long.parseLong(mobnoformat);
     
     List<String> list=(ArrayList<String>) request.getAttribute("Course");
   %>
   
   <h1>Name is  <%=name%></h1>
   <h2>Email is  <%=email%></h2>
   <h3>Mobno is  <%=mobno%></h3>
   
   <%
   for(String str:list)
   {  
   %>
    <h3> <%=str%></h3>
   <%
   }
   %>
</body>
</html>