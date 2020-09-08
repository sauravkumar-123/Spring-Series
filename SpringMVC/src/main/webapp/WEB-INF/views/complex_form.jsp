<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <title>Complex Form...</title>
  </head>
  <body class="" style="background:blue;">
    <div class="container mt-4">
      <div class="row">
          <div class="col-md-8 offset-md-2">
              <div class="card">
                  <div class="card-body">
                     <h3 class="text-center">Complex Form...</h3>
                     
                     <div class="alert alert-danger" role="alert">
                                 <form:errors path="studentdetail.*"></form:errors>
                              </div>

  <form action="complexform_process" method="post" enctype="multipart/form-data">
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputFirstName">First Name</label>
      <input type="text" class="form-control" id="inputFirstName" placeholder="first name" name="firstname" required="required">
    </div>
    
    <div class="form-group col-md-6">
      <label for="inputLastName">Last Name</label>
      <input type="text" class="form-control" id="inputLastName" placeholder="last name" name="lastname" required="required">
    </div>
  </div>
  
  
  <div class="form-group">
    <label for="inputEmail">Email</label>
    <input type="email" class="form-control" id="inputEmail" placeholder="example@gmail.com" name="email" required="required">
  </div>
  
  <div class="form-group">
    <label for="inputmobno">Mobno.</label>
    <input type="text" class="form-control" id="inputmobno" placeholder="+91-7484751420" name="mobno" required="required">
  </div>
  
  <div class="form-group">
    <label for="inputdob">DOB</label>
    <input type="text" class="form-control" id="inputdob" placeholder="dd-mm-yyyy" name="dob" required="required">
  </div>
  
  <div class="form-group">
   <span class="mr-3">Select Gender</span>
  <div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male">
   <label class="form-check-label" for="inlineRadio1" >Male</label>
  </div>
  
  <div class="form-check form-check-inline">
   <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female">
   <label class="form-check-label" for="inlineRadio2" >Female</label>
  </div>
  
  </div>
  
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="inputCity" name="city" required="required">
    </div>
    
    
    
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control" name="state">
        <option selected>Select...</option>
        
        
  <option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Dadar and Nagar Haveli">Dadar and Nagar Haveli</option>
<option value="Daman and Diu">Daman and Diu</option>
<option value="Delhi">Delhi</option>
<option value="Lakshadweep">Lakshadweep</option>
<option value="Puducherry">Puducherry</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Odisha">Odisha</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Telangana">Telangana</option>
<option value="Tripura">Tripura</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="West Bengal">West Bengal</option>
      </select>
      </div>
    
    
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" id="inputZip" name="zip" required="required">
    </div>
  </div>
  
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCourse">Select Course</label>
      <select id="inputCourse" class="form-control" name="course">
<option selected>Select...</option>
<option value="C/C++">C/C++</option>
<option value="JAVA">JAVA</option>
<option value="ADV JAVA">ADV JAVA</option>
<option value="HIBERNATE">HIBERNATE</option>
<option value="SPRING">SPRING FRAMEWORK</option>
<option value="PYTHON">PYTHON</option>
<option value="DJANGO">DJANGO</option>
<option value="REST API">REST API</option>
<option value="MACHINE LEARNING">MACHINE LEARNING</option>
    </select>
  </div>
  
  <!-- 
  <div class="form-group col-md-6">
      <label for="inputImage">Upload Image</label>
      <input type="file" class="form-control" id="inputImage" name="image" required="required">
 </div>
  -->
  
  </div>

  <div class="form-group col-md-4">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck" name="check">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
            
                  </div>
              </div>
          
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