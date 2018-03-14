<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>

<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
</head>
<body>

	<jsp:include page="${request.contextPath}/header" />

	<div class="container text-center">
		<div class="row">
			<div>
				<c:forEach items="${itemList}" var="item">
					<div class="col-lg-4 col-md-6">
						<div class="box-simple">
							<div class="icon-outlined"></div>
							<a href="./${item.itemId}"> <img id="${item.itemId}"
								src="${item.itemImage}" alt="item"
								style="width: 40%; height: 40%"></a>
							<p>${item.itemBrand}</p>
							<c:set var="balance" value="${item.itemPrice}" />
							<fmt:formatNumber type="currency" currencySymbol="$"
								value="${balance}" />
							<form action="./${item.itemId}" method="post">
								<input type="hidden" name="itemName"
									value="<c:out value="${item.itemId}"/>" /> <input
									type="submit" value="details" />
							</form>
							<br>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
		<c:forEach begin="1" end="${pages}" var="page">
			<a href="page=${page}">${page}</a> &#160&#160&#160&#160
		</c:forEach>
	</div>



	<script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>