<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "jakarta.tags.core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Jstl core tags</h1>
<c:forEach var="a" begin="1" end ="10">
	<c:out value="${a}"></c:out><br>
</c:forEach>
<% 
List<String> listNames = Arrays.asList("Rohit","Virat","SKY","Dhoni");
application.setAttribute("names", listNames);
%>
<c:forEach var="data" items="${names}">
	<c:out value ="${data}"></c:out><br>
</c:forEach>
<c:set var="age" value="${21}"></c:set>
<c:out value ="${age}"></c:out>

<%-- <c:remove var="age"/>--%>
<%--<c:out value="${age}"></c:out> --%>

<c:choose>
	<c:when test="${age == 18 }">
		<c:out value ="Just Eligible"></c:out>
	</c:when>
	<c:when test="${age > 18 }">
		<c:out value ="most Eligible"></c:out>
	</c:when>
	<c:otherwise>
		<c:out value="not eligible for voting"></c:out>
	</c:otherwise>
</c:choose>
<c:forTokens items="Rohit,Virat,SKY,Dhoni-Thala for A REASON" delims=",.-" var="names">
	<c:out value="${names }"></c:out>
</c:forTokens>
</body>
</html>