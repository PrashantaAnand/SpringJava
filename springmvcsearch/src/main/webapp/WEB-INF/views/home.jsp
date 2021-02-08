<!doctype html>
z
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">

<title>Hello</title>
</head>
<body>
	<div class="container">

		<div class="card mx-auto mt-5 bg-secondary" style="width: 50%;">
			<div class="card-body py-5">
				<h3 class="text-center text-white ">My Search</h3>
				
				<form action="search" class="mt-3">
				
					<div class=form-group>

						<input type="text" name="querybox"
							placeholder="Enter your Keyword" class="form-control">
</div>

						<div class="container text-center py-3">
							<button class="btn btn-outline-light">search</button>
						</div>
				</form>

			</div>
		</div>

	</div>
	
	
	<%
	String query = request.getParameter("query");
	if(query.isEmpty())
	{
		response.sendRedirect("home.jsp");
	}
	else 
		response.sendRedirect("https://www.google.com/search?q=");
	
	%>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>

</body>
</html>