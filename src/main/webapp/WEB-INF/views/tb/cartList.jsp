<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>			    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${path}/resources/cartList.css">
<title>Insert title here</title>
</head>
<body>
<div class="header"></div>

<div class="list">
	<div class="burger" onclick="location.href='/tb/getBurgerList';">햄버거</div>
	<div class="drink" onclick="location.href='/tb/getDrinkList';">음료</div>
	<div class="side" onclick="location.href='/tb/getSideList';">사이드</div>
</div>

<div class="order_List">
	<c:forEach items="${cartItems}" var="item">
		<li>${item.name} ${item.price}</li>
	</c:forEach>
</div>

<div class="bottom">
	<div class="goMain" onclick="location.href='/';">메인으로</div>
	<div class="order">주문하기</div>
</div>

</body>
</html>