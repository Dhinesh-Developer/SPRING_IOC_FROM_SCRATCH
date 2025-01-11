<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enso page</title>
</head>
<body>
	<div>
		<h1>Book Details</h1>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Author</th>
					<th>Year</th>
					<th>Copies</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${books}">
				<tr>
				<th>ID</th>
					<th>${book.id}</th>
					<th>${book.title}</th>
					<th>${book.author}</th>
					<th>${book.year}</th>
					<th>${book.copies}</th>
				</tr>
				</c:forEach>c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>