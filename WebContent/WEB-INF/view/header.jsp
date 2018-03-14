<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<spring:url value="/css/header.css" var="headerCss" />
<link  rel="stylesheet" href="${headerCss}">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

<title><spring:message code="index.title.text"></spring:message></title>
</head>
<body>
<link href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.css" rel="stylesheet">
	${user}
	<br>
	<%= session.getAttribute("user") %>
<div class="container">
	<nav class="navbar navbar-default" role="navigation">
		  <div class="container-fluid navbar-border">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="/Project2/home"><i class="fa fa-home"></i><spring:message code="index.title.text"></spring:message> </a>
			    </div>
			
			    <!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			     
			     <!-- Category + search bar starts -->
			      <ul class="nav navbar-nav">
			       
			       <!-- Category dropdown starts -->
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-anchor"></i> <spring:message code = "category.text"></spring:message> <span class="caret"></span></a>
			          <ul class="dropdown-menu" role="menu">
			            <li><a href="/Project2/category=desktop"><i class="fa fa-plug"></i> <spring:message code ="category.desktop"></spring:message> </a></li>
			            <li><a href="/Project2/category=book"><i class="fa fa-phone"></i> <spring:message code ="category.book"></spring:message></a></li>
			            <li><a href="/Project2/category=laptop"><i class="fa fa-laptop"></i> <spring:message code ="category.laptop" ></spring:message></a></li>
			            <li><a href="/Project2/category=headphone"><i class="fa fa-headphones"></i> <spring:message code ="category.headphone" ></spring:message></a></li>
			            <li class="active"><a href="./category=clothing"><i class="fa fa-credit-card"></i> <spring:message code ="category.clothing" ></spring:message></a></li>
			          </ul>
			        </li>
			        <!-- Category dropdown ends -->
			        
			        <!-- Search starts -->
			        <li>
			            <form action = "/Project2/search=${key}" class="navbar-form" >
			            <div class="input-group">
			                <input type="text" class="form-control" placeholder="search" name="key">
			                <div class="input-group-btn">
			                    <button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
			                </div>
			            </div>
			            </form>    
			        </li>
			        <!-- Search ends -->
			      </ul>
			      <!-- Category + search bar ends -->

			      <!-- right navbar starts -->
			      <ul class="nav navbar-nav navbar-right">
<c:if test="${(user eq null) || (user.userId==0)}"> 			        
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-cogs"></i> <b class="color-blue"><spring:message code="login.text"></spring:message> </b> <span class="caret"></span></a>
			          <ul class="dropdown-menu login-panel">
			            <li>
			                <div class="dropdown-header">
			                    <span class="login-header color-blue"> <a href="/Project2/user/signup"><spring:message code = "signup.text"></spring:message></a></span>
			                    <span class="forgot-password color-blue"><a href="user/displayPSW">Forgot password?</a></span>
			                </div>
			                <div class="clearfix"></div>
			                <div style="padding: 8px;">
			                    <form:form id="loginform" cssClass="form-horizontal" role="form" action="/Project2/user/login" modelAttribute="user">
			                        <div style="margin-bottom: 10px" class="input-group">
			                            <span class="input-group-addon"><i class="glyphicon glyphicon-user color-blue"></i></span>
			                            <form:input id="userEmail" type="text" cssClass="form-control" path="userEmail" placeholder="email" />                                        
			                        </div>
			                        <div style="margin-bottom: 10px" class="input-group">
			                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock color-blue"></i></span>
			                            <form:input id="userPassword" type="password" cssClass="form-control" path="userPassword" placeholder="password" />
			                        </div>
			                        <div class="center-text">
			                            <label><input id="login-remember" type="checkbox" name="remember" value="1"> Remember me</label>
			                        </div>
			           
			                        <div style="margin-top:10px" class="form-group">
			                            <!-- Button -->
			                            <div class="col-sm-12 controls center-text">
			                            		<spring:message code="login.text" var="valSubmit"></spring:message> 
											<input id="btn-login" class="btn btn-block btn-success" type="submit" value = "${valSubmit}" />
			                            </div>
			                        </div>  
			                    </form:form>
			                </div>                
			            </li>
			          </ul>
			        </li>
			         <li class="active"><a href="navCart"><i class="fa fa-shopping-cart"></i> <spring:message code = "shopingcart.text"></spring:message></a></li>
</c:if>		

<c:if test="${!((user eq null) || (user.userId==0))}">
 					<li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> <b class="color-blue">${user.userFirstName} ${ user.userLastName} </b> <span class="caret"></span></a>
			          <ul class="dropdown-menu login-panel">
			          <!--   <li> <a href="/Project2/signout">Log out</a></span></li> -->
			          <form action ="/Project2/signout">
			          		<input id="btn-login" class="btn btn-block btn-danger" type="submit" value = "Log out">
			          </form>
			          </ul>
			        </li>
			       <li class="active"><a href="/Project2/user/cart"><i class="fa fa-shopping-cart"></i> <spring:message code = "shopingcart.text"></spring:message><span class="badge"
								style="background-color: red;" id="cartSize">${user.getUserCart().getItems().size()}</span></a></li>
					
</c:if>	     
			       
			       
					<!-- Language bar starts -->
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-language"></i> <spring:message code = "language.text"></spring:message> <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="?language=en">English</a> </li> 
							<li><a href="?language=es">Español</a></li>
						</ul>
					</li>
					<!-- Language bar ends -->
					
			    </ul>
			    <!-- right navbar ends -->
			    </div>
		  </div><!-- /.container-fluid -->
	</nav>
</div>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>