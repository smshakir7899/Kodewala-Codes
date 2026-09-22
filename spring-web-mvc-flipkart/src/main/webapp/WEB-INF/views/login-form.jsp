<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Welcome to Flipkart</title>

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
	padding: 18px;
	text-align: center;
	font-size: 28px;
	font-weight: bold;
}

.login-container {
	width: 350px;
	margin: 80px auto;
	background: white;
	padding: 35px;
	border-radius: 10px;
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.15);
}

.login-container h2 {
	text-align: center;
	margin-bottom: 30px;
	color: #333;
}

.input-box {
	width: 100%;
	padding: 12px;
	margin: 10px 0 20px 0;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
	font-size: 15px;
}

.input-box:focus {
	border-color: #2874f0;
	outline: none;
}

.login-btn {
	width: 100%;
	padding: 12px;
	background: #2874f0;
	color: white;
	border: none;
	border-radius: 5px;
	font-size: 16px;
	font-weight: bold;
	cursor: pointer;
}

.login-btn:hover {
	background: #1f5fc4;
}

.footer {
	text-align: center;
	color: #777;
	font-size: 13px;
	margin-top: 25px;
}
</style>

</head>

<body>

	<div class="header">Flipkart</div>

	<div class="login-container">

		<h2>Login to your account</h2>

		<form action="">

			<label>Username</label> <input type="text" name="username"
				class="input-box" placeholder="Enter your username"> <label>Password</label>
			<input type="password" name="password" class="input-box"
				placeholder="Enter your password"> <input type="submit"
				value="Login" class="login-btn">

		</form>

		<div class="footer">Welcome back! Please login to continue.</div>

	</div>

</body>
</html>