<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="modal-content">
			<div class="modal-header">
				<h4 id="login-modalLabel" class="modal-title">Customer Login</h4>
			</div>
			<div class="modal-body">
				<form:form action="login" method="post">
					<div style="margin-bottom: 10px" class="input-group">
						<form:input id="userEmail" type="text" cssClass="form-control"
							path="userEmail" placeholder="email" />
					</div>
					<div style="margin-bottom: 10px" class="input-group">
						<form:input id="userPassword" type="password"
							cssClass="form-control" path="userPassword"
							placeholder="password" />
					</div>
					<div class="col-sm-12 controls center-text">
						<spring:message code="login.text" var="valSubmit"></spring:message>
						<input id="btn-login" class="btn btn-block btn-success"
							type="submit" value="${valSubmit}" />
					</div>
				</form:form>
				<p class="text-center text-muted">Not registered yet?</p>
				<p class="text-center text-muted">
					<a href="signup"> <strong>Register now</strong></a>! It is easy and
					done in 1 minute and gives you access to special discounts and much
					more!
				</p>
			</div>
		</div>
	</div>

</body>
</html>