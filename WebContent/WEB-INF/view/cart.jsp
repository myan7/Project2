<%@page import="my.spring.model.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html >
<html>
<head>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="${request.contextPath}/header" />
<c:set var = "total" value = "${0}"></c:set>
<div id="heading-breadcrumbs">
        <div class="container">
          <div class="row d-flex align-items-center flex-wrap">
            <div class="col-md-7">
              <h1 class="h2">Shopping Cart</h1>
            </div>
          </div>
        </div>
      </div>
      <div id="content">
        <div class="container">
          <div class="row bar">
            <div class="col-lg-12">
              <p class="text-muted lead">You currently have ${user.getUserCart().getItems().size()} item(s) in your cart.</p>
            </div>
            <div id="basket" class="col-lg-9">
              <div class="box mt-0 pb-0 no-horizontal-padding">
                <form method="post" action="#">
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                        <tr>
                          <th colspan="2">Product</th>
                          <th>Quantity</th>
                          <th >Unit</th>
                          <th colspan="2">Total</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${user.getUserCart().getItems()}" var="item">
                       <tr id = "${item.getKey().itemId}">
                          <td><a href="/Project2/${item.getKey().itemId}"><img src="/Project2/${item.getKey().itemImage}" alt="${item.getKey().itemName}" class="img-fluid"  style="width: 20%; height: 7%"></a></td>
                          <td><a href="/Project2/${item.getKey().itemId}">${item.getKey().itemName}</a></td>
                          <td>
                            <input type="number" value="${item.getValue()}" class="form-control">
                          </td>
                          <td>
							<c:set var="balance" value="${item.getKey().itemPrice}" />
							<fmt:formatNumber type="currency" currencySymbol="$"
								value="${balance}"/>
						  </td>
                          <td>
                          	<c:set var="balance" value="${item.getKey().itemPrice*item.getValue()}" />
							<fmt:formatNumber type="currency" currencySymbol="$"
								value="${balance}" />
						  </td>
                          <td><a href="/Project2/user/removeFromCart/${item.getKey().itemId}"><i class="fa fa-trash-o"></i></a></td>
                    			
                        </tr>
                      </c:forEach>
                      </tbody>
                      <tfoot>
	                      <c:forEach var = "item" items = "${ user.getUserCart().getItems() }">
	                      	<c:set var = "total" value = "${ total + item.getKey().itemPrice * item.getValue() }"></c:set>
	                      </c:forEach>
	                       <tr>
	                          <th colspan="5">Total</th>
	                          <th colspan="2"><fmt:formatNumber type="currency" currencySymbol="$"
									value="${total}" /></th>
	                      </tr>
                      </tfoot>
                    </table>
                  </div>
                   <div class="box-footer d-flex justify-content-between align-items-center">
                    <div class="left-col"><a href="/Project2/home" class="btn btn-secondary mt-0"><i class="fa fa-chevron-left"></i> Continue shopping</a></div>
                    <div class="right-col"><a href="#" class="btn btn-secondary"><i class="fa fa-refresh"></i> Update cart</a></div> 
                  </div> 
                </form>
              </div>
            </div>
            <div class="col-lg-3">
              <div id="order-summary" class="box mt-0 mb-4 p-0">
                <div class="box-header mt-0">
                  <h3>Order summary</h3>
                </div>
                <p class="text-muted">Shipping and additional costs are calculated based on the values you have entered.</p>
                <div class="table-responsive">
                  <table class="table">
                    <tbody>
                      <tr>
                        <td>Order subtotal</td>
                        <th><fmt:formatNumber type="currency" currencySymbol="$"
								value="${total}" /></th>
                      </tr>
                      <tr>
                        <td>Shipping and handling</td>
                        <th>$10.00</th>
                      </tr>
                      <tr>
                        <td>Tax</td>
                        <c:set var="tax" value = "${total*0.1}"></c:set>
                        <th><fmt:formatNumber type="currency" currencySymbol="$"
								value="${tax}" /></th>
                      </tr>
                      <tr class="total">
                        <td>Total</td>
                        <th><fmt:formatNumber type="currency" currencySymbol="$"
								value="${total+10+tax}" /></th>
                      </tr>
                    </tbody>
                  </table>
                  <form>
                    	<button type="submit" class="btn btn-success" style="float: right">Proceed to checkout <i class="fa fa-chevron-right"></i></button>
                    </form>
                </div>
              </div>
              
            </div>
          </div>
        </div>
      </div>
    <script type="text/javascript"
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>
	<script
		src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>