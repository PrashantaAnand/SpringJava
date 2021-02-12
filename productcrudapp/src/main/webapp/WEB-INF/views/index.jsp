<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<title>Thanks</title>
<body>
	<div class="container mt-5 text-center">
		<h2 class="display-6">Welcome to Product Details !!</h2>

		<table class="table">
            <thead class="thead-dark">
            
				<tr>
					<th scope="col">S.No</th>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Price</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${products }" var="p">
			
				<tr>
					<th scope="row">Item${p.id }</th>
					<td>${p.name }</td>
					<td>${p.description }</td>
					<td class="font-weight-bold">&#8377 ${p.price }</td>
					<td><a href="delete/${p.id}"><i class="fas fa-trash"></i></a></td>
					<td><a href="update/${p.id}"><i class="fas fa-edit"></i></a></td>
				</tr>
				
				</c:forEach>
				
			</tbody>
		</table>
</div>
		<div class="container mt-4 text-center">
			<a href="add-product" class="btn btn-primary "> Add Product</a> 
		
			<p class="bg-dark text-white mt-5 display-4">Visit Again</p>
			</div>
			

	
		
		
</body>
</html>
