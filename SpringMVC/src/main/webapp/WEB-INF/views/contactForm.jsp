<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

   <title>Contact Form:-</title>
   
  </head>
  <body>
    
    <div class="container mt-5">
    <h3 class="text-center">${header}</h3>
    <p class="text-center">${desc}</p>
    
<form action="processform" method="post">
    
<div class="form-group">
    <label for="exampleInputEmail">Email address</label>
    <input 
    type="email" 
    class="form-control" 
    id="exampleInputEmail1" 
    aria-describedby="emailHelp" 
    placeholder="Enter Email"
    name="email">
</div>
  
 <div class="form-group">
    <label for="exampleInputUserName">Username</label>
    <input 
    type="text" 
    class="form-control" 
    id="exampleInputUserName" 
    aria-describedby="usernameHelp" 
    placeholder="Enter Username"
    name="username">
</div>
  
<div class="form-group">
    <label for="exampleInputPassword">Password</label>
    <input 
    type="password" 
    class="form-control" 
    id="exampleInputPassword" 
    aria-describedby="passwordHelp" 
    placeholder="Enter Password"
    name="password">
</div>
  
  <div class="container text-center">
  <button type="submit" class="btn btn-success">Submit</button>
  </div>
    </form>
    
    </div>
    

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>
</html>