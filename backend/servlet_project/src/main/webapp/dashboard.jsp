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
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 10px;
	font-size: 20px;
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
		<table>
			<thead>
				<tr>
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