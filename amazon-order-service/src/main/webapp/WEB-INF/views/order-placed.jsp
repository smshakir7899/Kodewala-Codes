
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Order Placed Successfully</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: #eaeded;
	color: #111;
	min-height: 100vh;
	display: flex;
	flex-direction: column;
}

/* ================= HEADER ================= */
.header {
	background-color: #131921;
	color: white;
	height: 70px;
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 0 50px;
}

.logo {
	font-size: 30px;
	font-weight: bold;
}

.logo span {
	color: #ff9900;
}

.header-title {
	font-size: 18px;
	color: #ffffff;
}

/* ================= NAVIGATION ================= */
.navbar {
	background-color: #232f3e;
	height: 48px;
	display: flex;
	align-items: center;
	padding-left: 50px;
}

.navbar a {
	color: white;
	text-decoration: none;
	padding: 15px 25px;
	font-size: 14px;
	font-weight: bold;
}

.navbar a:hover {
	background-color: #37475a;
}

/* ================= MAIN ================= */
.container {
	width: 900px;
	margin: 50px auto;
	flex: 1;
}

/* ================= ORDER CARD ================= */
.order-card {
	background-color: white;
	border-radius: 8px;
	box-shadow: 0 3px 12px rgba(0, 0, 0, 0.15);
	overflow: hidden;
}

/* Card Header */
.card-header {
	background-color: #f7f7f7;
	border-bottom: 1px solid #ddd;
	padding: 22px 30px;
}

.card-header h1 {
	font-size: 25px;
	font-weight: normal;
	color: #232f3e;
}

.card-header p {
	margin-top: 7px;
	font-size: 13px;
	color: #565959;
}

/* ================= SUCCESS BODY ================= */
.card-body {
	padding: 50px 40px;
	text-align: center;
}

/* Success Icon */
.success-icon {
	width: 75px;
	height: 75px;
	margin: 0 auto 20px;
	border-radius: 50%;
	background-color: #e7f4e4;
	border: 2px solid #a9d6a3;
	display: flex;
	align-items: center;
	justify-content: center;
	font-size: 40px;
	color: #007600;
}

/* Success Message */
.success-title {
	font-size: 27px;
	color: #007600;
	font-weight: bold;
	margin-bottom: 12px;
}

.success-message {
	font-size: 16px;
	color: #565959;
	margin-bottom: 30px;
}

/* Order Status */
.order-status {
	display: inline-block;
	padding: 12px 35px;
	background-color: #fff3cd;
	border: 1px solid #f0c36d;
	border-radius: 5px;
	color: #856404;
	font-weight: bold;
	font-size: 14px;
	margin-bottom: 30px;
}

/* Additional Information */
.info-box {
	width: 80%;
	margin: 0 auto;
	background-color: #f7f7f7;
	border: 1px solid #ddd;
	border-radius: 5px;
	padding: 20px;
	text-align: left;
}

.info-box p {
	margin: 8px 0;
	font-size: 14px;
	color: #333;
}

.info-box strong {
	color: #232f3e;
}

/* ================= BUTTONS ================= */
.button-container {
	margin-top: 30px;
}

.btn {
	display: inline-block;
	padding: 12px 25px;
	margin: 5px;
	border-radius: 5px;
	text-decoration: none;
	font-size: 14px;
	font-weight: bold;
	cursor: pointer;
}

.home-btn {
	background-color: #ffd814;
	border: 1px solid #fcd200;
	color: #111;
}

.orders-btn {
	background-color: #ffa41c;
	border: 1px solid #ff8f00;
	color: #111;
}

.btn:hover {
	opacity: 0.85;
}

/* ================= FOOTER ================= */
.footer {
	background-color: #131a22;
	color: white;
	text-align: center;
	padding: 30px;
	font-size: 12px;
	margin-top: auto;
}

/* ================= RESPONSIVE ================= */
@media screen and (max-width: 950px) {
	.container {
		width: 90%;
	}
}

@media screen and (max-width: 600px) {
	.header {
		padding: 0 20px;
	}
	.header-title {
		display: none;
	}
	.navbar {
		padding-left: 0;
		overflow-x: auto;
	}
	.navbar a {
		white-space: nowrap;
	}
	.card-body {
		padding: 35px 20px;
	}
	.info-box {
		width: 100%;
	}
	.success-title {
		font-size: 22px;
	}
}
</style>

</head>


<body>

	<!-- ================= HEADER ================= -->

	<header class="header">

		<div class="logo">
			amazon<span>.in</span>
		</div>

		<div class="header-title">Order Confirmation</div>

	</header>


	<!-- ================= NAVIGATION ================= -->

	<nav class="navbar">

		<a href="#">Home</a> <a href="#">Your Orders</a> <a href="#">Cart</a>

		<a href="#">Account</a> <a href="#">Customer Service</a>

	</nav>


	<!-- ================= MAIN CONTENT ================= -->

	<main class="container">

		<div class="order-card">

			<!-- Card Header -->

			<div class="card-header">

				<h1>Order Confirmation</h1>

				<p>Thank you for shopping with us. Your order has been
					successfully placed.</p>

			</div>


			<!-- Card Body -->

			<div class="card-body">

				<!-- Success Icon -->

				<div class="success-icon">✓</div>


				<!-- Success Message -->

				<div class="success-title">Order Placed Successfully!</div>

				<div class="success-message">Your order has been received and
					is being processed.</div>


				<!-- Status -->

				<div class="order-status">ORDER CONFIRMED</div>


				<!-- Information -->

				<div class="info-box">

					<p>
						<strong>Order Status:</strong> Confirmed
					</p>

					<p>
						<strong>Payment Status:</strong> Payment Successful
					</p>

					<p>
						<strong>Delivery Status:</strong> Preparing for Shipment
					</p>

					<p>
						<strong>Message:</strong> You will receive your order at the
						provided shipping address.
					</p>

				</div>


				<!-- Buttons -->

				<div class="button-container">

					<a href="#" class="btn home-btn"> Continue Shopping </a> <a
						href="#" class="btn orders-btn"> View Your Orders </a>

				</div>

			</div>

		</div>

	</main>


	<!-- ================= FOOTER ================= -->

	<footer class="footer">

		© 2026 Amazon Orders Portal <br> <br> All Rights Reserved.

	</footer>


</body>

</html>
```
