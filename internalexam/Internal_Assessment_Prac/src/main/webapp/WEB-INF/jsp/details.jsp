<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Details page</h2>
		<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>email</th>
				<th>City</th>
				<th>cell_no</th>
				<th>reg_amount</th>
				<th>reg_date</th>
			</tr>
		</thead>
		<tbody>
			
				<tr>
					<td>${vendor.id}</td>
					<td>${vendor.name}</td>
					<td>${vendor.email}</td>
					<td>${vendor.city}</td>
					<td>${vendor.cell_no}</td>
					<td>${vendor.reg_amount}</td>
					<td>${vendor.reg_date}</td>
				</tr>					
			
		</tbody>
	</table>
	<a href = "logout">Logout</a>
</body>
</html>