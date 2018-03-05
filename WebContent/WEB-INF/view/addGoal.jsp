<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="addgoal.text"></spring:message></title>
<style>
.error
{
	color: #ff0000;
}
.errorblock
{
	color: #000000;
	background-color: #ffeeee;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
<form:form modelAttribute = "goal">
<form:errors cssClass="errorblock" path="*" element="div"></form:errors>
	<table>
		<tr>
			<td><spring:message code="entergoal.text"></spring:message></td>
			<td><form:input path="minutes" cssErrorClass="error"/></td>
			<td><form:errors cssClass = "error" path="minutes"/></td>
		</tr>
		<tr>
			<td colspan=3 align="center">
				<spring:message code="user.submit.goal" var="submitval"></spring:message>
				<input type = "submit" value="${submitval}">
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>