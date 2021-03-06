<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <link href="<c:url value="/resources/css/style.css"/>">
    <script src="<c:url value="/resources/js/script.js"/>"></script>

    <title>Search</title>
  </head>
  <body>
  
  <img alt="my imag" src="<c:url value="/resources/images/saurav kumar.jpg"/>">
    <div class="container">
      <div class="card mx-auto mt-5 bg-primary" style="width:80%;">
        
        <div class="card-body py-5">
        <h3 class="text-center text-white">My Search..</h3>
        
        <form action="search" class="mt-3">
        
           <div class="form-group">
           
           <input type="text" 
           name="search_bar" 
           placeholder="Type to Search..."
           class="form-control"
           />
           
           </div>
           
           <div class="container text-center">
           
            <button class="btn btn-outline-light">Search</button>
        
           </div>
           
        </form>
        
        </div>
      </div>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>
</html>