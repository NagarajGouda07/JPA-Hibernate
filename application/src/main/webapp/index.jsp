<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application</title>
</head>
<body>
	<h1>Application Form</h1>
	<form action="/application" method="post">
		<pre>
			Name :     <input type="text" name="name" placeholder="Enter your name">
			Email :    <input type="text" name="email" placeholder="Enter your email">
			Password : <input type="text" name="password" placeholder="Enter your password">
			   <button type="submit">save</button>
			
		</pre>

	</form>

</body>
</html>