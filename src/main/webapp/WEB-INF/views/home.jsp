<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>			    
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${path}/resources/home.css">
<title>Home</title>
</head>
<body>

<div class="header"></div>

<div class="list">
	<div class="burger" onclick="location.href='/tb/getBurgerList';">햄버거</div>
	<div class="drink" onclick="location.href='/tb/getDrinkList';">음료</div>
	<div class="side" onclick="location.href='/tb/getSideList';">사이드</div>
</div>

<div class="bottom">
	<div class="admin"></div>
	<div class="basket" onclick="location.href='/tb/basketList';">장바구니</div>
</div>


</body>
</html>
