<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Logout</title>

<style>
body {
	margin: 0;
	padding: 0;
	font-family: Arial, sans-serif;
	background: #f1f3f6;
}

.header {
	background: #2874f0;
	color: white;
	padding: 20px;
	text-align: center;
	font-size: 28px;
	font-weight: bold;
}

.logout-container {
	width: 400px;
	margin: 100px auto;
	background: white;
	padding: 40px;
	text-align: center;
	border-radius: 10px;
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.15);
}

.success-icon {
	font-size: 50px;
	margin-bottom: 15px;
}

h2 {
	color: #333;
	margin-bottom: 15px;
}

p {
	color: #666;
	font-size: 16px;
	margin-bottom: 30px;
}

.btn {
	display: inline-block;
	padding: 12px 25px;
	background: #2874f0;
	color: white;
	text-decoration: none;
	border-radius: 5px;
	font-size: 16px;
	font-weight: bold;
}

.btn:hover {
	background: #1f5fc4;
}
</style>

</head>

<body>

	<div class="header">Flipkart</div>

	<div class="logout-container">

		<div class="success-icon">✅</div>

		<h2>Successfully Logged Out</h2>

		<p>You have been successfully logged out.</p>

		<a href="viewForm" class="btn"> Login Again </a>

	</div>

</body>
</html>