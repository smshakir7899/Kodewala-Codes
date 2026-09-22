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
			padding: 20px;
			text-align: center;
			font-size: 28px;
			font-weight: bold;
		}

		.container {
			width: 400px;
			margin: 100px auto;
			background: white;
			padding: 40px;
			text-align: center;
			border-radius: 10px;
			box-shadow: 0 4px 15px rgba(0, 0, 0, 0.15);
		}

		h2 {
			color: #333;
			margin-bottom: 30px;
		}

		.btn {
			display: block;
			width: 100%;
			padding: 12px;
			margin: 15px 0;
			background: #2874f0;
			color: white;
			text-decoration: none;
			border-radius: 5px;
			font-size: 16px;
			font-weight: bold;
			box-sizing: border-box;
		}

		.btn:hover {
			background: #1f5fc4;
		}

		.logout {
			background: #fb641b;
		}

		.logout:hover {
			background: #e85a16;
		}
	</style>

</head>

<body>

	<div class="header">
		Flipkart
	</div>

	<div class="container">

		<h2>Welcome to Flipkart</h2>

		<a href="viewForm" class="btn">
			View Login Page
		</a>

		<a href="logout" class="btn logout">
			Logout
		</a>

	</div>

</body>
</html>