<%@page import="servlet_project.dto.Toy"%>
<%@page import="java.util.List"%>
<%@page import="servlet_project.dao.ToyCrud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 10px;
	font-size: 20px;
	text-align: center;
	
	
}


h1 {
	text-align: center;
	font-size: 40px;
	color: blue;
}

div {
	display: flex;
	justify-content: center;
	
	
}
</style>
</head>
<body>
	<h1>Toys Data</h1>
	<% 
	ToyCrud crud = new ToyCrud();
	List<Toy> toys = crud.fetchToys();
	%>
	<div>
		<table class="table table-striped table-hover">
			<thead>
				<tr class="table-dark">
					<th>ID</th>
					<th>NAME</th>
					<th>PRICE</th>
					<th>QUANTITY</th>

				</tr>
			</thead>
			<tbody>
				<%
				for (Toy toy : toys) {
				%>
				<tr>
					<td><%=toy.getId()%></td>
					<td><%=toy.getName()%></td>
					<td><%=toy.getPrice()%></td>
					<td><%=toy.getQuantity()%></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>


</body>
</html>