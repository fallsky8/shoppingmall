<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<link rel="stylesheet" href="/shoppingmall/css/style.css" />

<c:if test="${empty sessionScope.id}">
	<meta http-equiv="Refresh" content="0;url=/shoppingmall/index.do">
</c:if>

<div id="orderResult">
	<p>${orderStus}
</div>

<div id="buyProcess">
	<form action="/shoppingmall/buyList.do" id="buyPro" method="post">
		<input type="hidden" name="buyer" value="${sessionScope.id}">
		<input type="submit" value="주문확인">
	</form>
</div>