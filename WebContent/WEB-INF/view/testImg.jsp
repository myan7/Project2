<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="${request.contextPath}/header"/>
	

	<div class="container">
	Item Name: ${item.itemBrand}
	<br>
	Item Description: ${item.itemDescription}
	<br>
		<img alt="test" src="${item.itemImage}"
			style="width: 30%; height: 30%" />
		<form action="/Project2/user/add2cart/${item.itemId}" method="post">	
			<input type="number" name="quantity" value="1" class="form-control">
			<input type="hidden" name="itemId" value="${item.itemId}" /> <input
				type="submit" value="add to cart" />
		</form>
	</div>

	<script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>