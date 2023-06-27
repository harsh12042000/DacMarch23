<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1 class="text-center">Employee Registration</h1>
		<form action="employee" method="post">
			<div class="mb-3">
				<label for="name" class="form-label">Name:</label>
				<input type="text" class="form-control" id="name" name="name" required>
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email:</label>
				<input type="email" class="form-control" id="email" name="email" required>
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">Password:</label>
				<input type="password" class="form-control" id="password" name="pswd" required>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>
