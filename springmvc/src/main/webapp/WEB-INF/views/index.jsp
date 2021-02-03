<%@page import="java.util.List"%>
<html>
<body>
	<h2>Hello!</h2>
	<h2>this comes from index.jsp</h2>

	<%
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");
		List<String> student = (List<String>) request.getAttribute("list");
	%>
	
	
	 <h2>
		NAME is
		<%=name%></h2>
	<h2>
		Id is
		<%=id%></h2>


	<%
		for (String s : student){
	%>	
		
		
		<h2><%=s %></h2>
 <%
		}
 %>

</body>
</html>
