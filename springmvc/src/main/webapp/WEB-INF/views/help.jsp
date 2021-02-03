<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>


	<%-- <%  by using jstl tag we cant write this leanthy lines juyst use only tag to get data from controller;

                       String now =(String)request.getAttribute("name");
                       Integer cont =(Integer)request.getAttribute("contact");
%> --%>




	<h1>this is help page</h1>

	<h1>
		My name is
		<%--  <%=now %> --%>
		${name }
	</h1>

	<p>for any help contact the number below</p>

	<ul>
		<li><h1>
				<%-- <%=cont %> --%>
				${contact }
			</h1></li>

		<li><h1>620033</h1></li>

	</ul>

	<c:forEach var="mark" items="${marks}">
		<h1>${mark }</h1>

		<%-- <c:out value="${mark}"></c:out>  --%>
	</c:forEach>

</body>
</html>