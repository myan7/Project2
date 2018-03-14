<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
#content { display: inline; float: right; width: 668px; }

.products { padding-bottom: 24px; }
.products .title { margin: 0 0 27px 16px; width: 632px; }
.products .title a.title-link { position: absolute; top: 15px; right: 2px; color: #00a7e7; text-decoration: underline; }
.products .title a.title-link:hover { text-decoration: none; }
.products .row { height: 298px; }
.products .active { background-position: 0 0; }
.best-sellers { padding-bottom: 0; }

.product-holder { display: inline; float: left; padding: 0 8px; width: 206px; }
.product { position: relative; padding: 5px 0 0 6px; background: url(images/product-active.png) repeat-y -4000px 0; cursor: pointer; }
.product-bottom { height: 12px; line-height: 0; font-size: 0; background: url(images/product-bottom.png) no-repeat -4000px 0; }
.product img { display: block; width: 190px; height: 193px; border: solid 1px #bababa; }

.product .desc { padding: 8px 0 0 10px; width: 182px; background: #ff9600 url(images/desc.png) repeat-x 0 0; }
.product .desc p { font-weight: bold; }
.product .desc p.price { color: #fff; font-size: 18px; }
.product .desc span.dollar { font-size: 12px; }
.product .desc strike { color: #595959; font-style: italic; }
.product .bottom { height: 11px; line-height: 0; font-size: 0; background: url(images/bottom-desc.png) no-repeat 0 bottom;  }
.product img.top-label { position: absolute; top: 7px; left: 8px; display: block; width: 88px; height: 70px; border: 0; }
.product img.new-label { position: absolute; top: 7px; right: 10px; display: block; width: 88px; height: 70px; border: 0; } 

#footer { padding: 10px 0 15px 50px; }
#footer p { font-family: Tahoma, arial, helvetica, sans-serif; font-size: 11px; line-height: 18px; color: #c8e59f; }
#footer p a { color: #fff; }
#footer p span { padding: 0 3px 0 4px; }
#footer .author { float: right; }
</style>
<title>Display User Information</title>
</head>
<body>
<jsp:include page="${request.contextPath}/header"/>
<div class="container">
<table>
<%= session.getAttribute("user") %>
	<tr>
		<td>email:</td>
		<td>${user.userEmail}</td>
	</tr>
	<tr>
		<td>userFirstName:</td>
		<td>${user.userFirstName}</td>
	</tr>
	<tr>
		<td>userLastName:</td>
		<td>${user.userLastName}</td>
	</tr>
	<tr>
		<td>userPassword:</td>
		<td>${user.userPassword}</td>
	</tr>
	<tr>
		<td>DOB:</td>
		<td>${user.userDOB}</td>
	</tr>
	<tr>
		<td>Phone:</td>
		<td>${user.userPhoneNo}</td>
	</tr>
	<tr>
		<td>Gender:</td>
		<td>${user.gender}</td>
	</tr>
	
</table>
</div>
				

</body>
</html>
