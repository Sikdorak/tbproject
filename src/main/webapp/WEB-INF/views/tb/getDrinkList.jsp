<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>			    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${path}/resources/css/drink.css">
<title>Insert title here</title>
</head>
<body>

<div class="header"></div>

<div class="list">
	<div class="burger" onclick="location.href='/tb/getBurgerList';">햄버거</div>
	<div class="drink" onclick="location.href='/tb/getDrinkList';">음료</div>
	<div class="side" onclick="location.href='/tb/getSideList';">사이드</div>
</div>


<div class="productBox">
	<c:forEach var="product" items="${drink}" begin="0" end="9">
		<div class="item" onclick="location.href='/tb/addCart?name=${product.p_name}&price=${product.p_price}'">
			${product.p_name}
			${product.p_price}
		</div>
	</c:forEach>
</div>


<div class="bottom">
</div>

</body>
</html>