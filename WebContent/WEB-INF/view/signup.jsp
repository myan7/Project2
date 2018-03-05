<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="css/signup.css" rel="stylesheet" type="text/css">
<!-- <script type="text/javascript">
      $(function() {
          $('#idDateField').datepicker();
      });
  </script> -->
<title>Insert title here</title>
</head>
<body>
<jsp:include page="${request.contextPath}/header"/>
<div class="container">
	<div class="row">
    <div class="col-md-8">
      <section>      
        <h1 class="entry-title"><span>Sign Up</span> </h1>
        <hr>
            <form:form action = "display" cssClass="form-horizontal" method="post" name="signup" id="signup" modelAttribute="user">        
       			<div class="form-group">
          			<label class="control-label col-sm-3">Email <span class="text-danger">*</span></label>
          			<div class="col-md-8 col-sm-9">
              				<form:input type="email" cssClass="form-control" path="userEmail" id="userEmail" placeholder="Enter your Email" value=""/>
            				<small> Your Email is being used for ensuring the security of your account, authorization and access recovery. </small> 
            			</div>
        			</div>
        
        			<div class="form-group">
          			<label class="control-label col-sm-3">Set Password <span class="text-danger">*</span></label>
          			<div class="col-md-5 col-sm-8">
	            			<div class="input-group">
	              			<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
	              			<form:input type="password" cssClass="form-control" path="userPassword" id="userPassword" placeholder="Choose password (5-15 chars)" value=""/>
	           			</div>   
          			</div>  
      			</div>
      			
       			<div class="form-group">
	          		<label class="control-label col-sm-3">Confirm Password <span class="text-danger">*</span></label>
	        			<div class="col-md-5 col-sm-8">
	          			<div class="input-group">
	              			<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
	              			<input type="password" class="form-control" path="userPassword" id="cpassword" placeholder="Confirm your password" value=""/>
	            			</div>  
	          		</div>
        			</div>
        				
		        <div class="form-group">
					<label class="control-label col-sm-3">First Name <span class="text-danger">*</span></label>
		          		<div class="col-md-8 col-sm-9">
		            			<form:input type="text" cssClass="form-control" path="userFirstName"  id="userFirstName" placeholder="Enter your First Name here" value=""/>
		          		</div>
		        	</div>
		        	
		        	<div class="form-group">
					<label class="control-label col-sm-3">Last Name <span class="text-danger">*</span></label>
		          		<div class="col-md-8 col-sm-9">
		            			<form:input type="text" cssClass="form-control" path="userLastName" id="userLastName" placeholder="Enter your Last Name here" value=""/>
		          		</div>
		        	</div>
		        	
				<div class="form-group">
	          		<label class="control-label col-sm-3">Date of Birth <span class="text-danger">*</span></label>
	          			<div class="col-md-8 col-sm-9">
	              			<form:input type = "date" cssClass="form-control" path="userDOB"/>
	              		</div>
	            </div>
        
		        <div class="form-group">
			          <label class="control-label col-sm-3">Gender <span class="text-danger">*</span></label>
				          <div class="col-md-8 col-sm-9">    
							<form:radiobutton path="gender" value="M"/>Male
							<form:radiobutton path="gender" value="F"/>Female
				          </div>
		        </div>
		        
        <div class="form-group">
          <label class="control-label col-sm-3">Phone Number <span class="text-danger">*</span></label>
          <div class="col-md-5 col-sm-8">
          	<div class="input-group">
              	<span class="input-group-addon"><i class="glyphicon glyphicon-phone"></i></span>
            		<form:input type="text" class="form-control" path="userPhoneNo" id="userPhoneNo" placeholder="Enter your Primary contact no." value=""/>
            </div>
          </div>
        </div>
        
        <div class="form-group">
          <label class="control-label col-sm-3">Alternate No. <br>
          <small>(if any)</small></label>
          <div class="col-md-5 col-sm-8">
            <input type="text" class="form-control" name="contactnum2" id="contactnum2" placeholder="Any other or Landline no (if any)" value="">
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-3">Profile Photo <br>
          <small>(optional)</small></label>
          <div class="col-md-5 col-sm-8">
            <div class="input-group"> <span class="input-group-addon" id="file_upload"><i class="glyphicon glyphicon-upload"></i></span>
              <input type="file" name="file_nm" id="file_nm" class="form-control upload" placeholder="" aria-describedby="file_upload">
            </div>
          </div>
        </div>
        <div class="form-group">
          <label class="control-label col-sm-3">Security Code </label>
          <div class="col-md-5 col-sm-8">
            <div >
                
                <input type="text" name="captcha" id="captcha" class="form-control label-warning"  />                
              </div>
          </div>
        </div>
        <div class="form-group">
          <div class="col-xs-offset-3 col-md-8 col-sm-9"><span class="text-muted"><span class="label label-danger">Note:-</span> By clicking Sign Up, you agree to our <a href="#">Terms</a> and that you have read our <a href="#">Policy</a>, including our <a href="#">Cookie Use</a>.</span> </div>
        </div>
        <div class="form-group">
          <div class="col-xs-offset-3 col-xs-10">
            <input name="Submit" type="submit" value="Sign Up" class="btn btn-primary">
          </div>
        </div>
      </form:form>
    </div>
</div>
</div>
</body>
</html>