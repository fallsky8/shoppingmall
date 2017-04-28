<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%request.setCharacterEncoding("UTF-8"); %>
<c:if test="${check==1 }">
	<c:set var="id" value="${id }" scope="session"></c:set>

</c:if>
<p id="ck">${check}