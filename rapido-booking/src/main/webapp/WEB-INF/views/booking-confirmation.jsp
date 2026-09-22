<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Rapido - Booking Confirmed</title>


<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: Arial, Helvetica, sans-serif;
}

body {
	background: #f5f5f5;
	color: #222;
}

/* Navbar */
.navbar {
	height: 70px;
	background: #ffd400;
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 0 8%;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 0.15);
}

.logo {
	font-size: 30px;
	font-weight: 900;
	letter-spacing: -1px;
}

.nav-text {
	font-size: 14px;
	font-weight: bold;
}

/* Main */
.main {
	min-height: calc(100vh - 130px);
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 50px 20px;
	background: linear-gradient(135deg, #ffd400, #fff0a3);
}

/* Confirmation Card */
.confirmation-card {
	width: 480px;
	background: white;
	padding: 40px;
	border-radius: 22px;
	box-shadow: 0 15px 45px rgba(0, 0, 0, 0.20);
	text-align: center;
}

/* Success Icon */
.success-icon {
	width: 75px;
	height: 75px;
	margin: 0 auto 20px;
	background: #ffd400;
	border-radius: 50%;
	display: flex;
	align-items: center;
	justify-content: center;
	font-size: 38px;
}

/* Heading */
.confirmation-card h1 {
	font-size: 30px;
	margin-bottom: 10px;
	color: #111;
}

.success-message {
	color: #777;
	font-size: 15px;
	margin-bottom: 30px;
	line-height: 1.5;
}

/* Details */
.details {
	text-align: left;
	background: #fafafa;
	border: 1px solid #eee;
	border-radius: 15px;
	padding: 20px;
	margin-bottom: 25px;
}

.detail-row {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 15px 5px;
	border-bottom: 1px solid #eee;
}

.detail-row:last-child {
	border-bottom: none;
}

.detail-label {
	color: #777;
	font-size: 14px;
}

.detail-value {
	font-weight: bold;
	font-size: 15px;
	color: #222;
	text-align: right;
}

/* OTP */
.otp-box {
	background: #fff8cc;
	border: 2px dashed #ffd400;
	border-radius: 12px;
	padding: 18px;
	margin-bottom: 25px;
}

.otp-label {
	font-size: 13px;
	color: #777;
	margin-bottom: 7px;
}

.otp {
	font-size: 30px;
	font-weight: 900;
	letter-spacing: 7px;
	color: #111;
}

/* Button */
.home-btn {
	display: block;
	width: 100%;
	padding: 15px;
	background: #111;
	color: white;
	text-decoration: none;
	border-radius: 10px;
	font-size: 16px;
	font-weight: bold;
	transition: 0.3s;
}

.home-btn:hover {
	background: #333;
	transform: translateY(-2px);
}

/* Footer */
footer {
	height: 60px;
	background: #111;
	color: white;
	display: flex;
	align-items: center;
	justify-content: center;
	font-size: 13px;
}

footer span {
	color: #ffd400;
	font-weight: bold;
	margin-left: 4px;
}

/* Mobile */
@media ( max-width : 550px) {
	.navbar {
		padding: 0 20px;
	}
	.nav-text {
		display: none;
	}
	.confirmation-card {
		width: 100%;
		padding: 30px 22px;
	}
	.confirmation-card h1 {
		font-size: 26px;
	}
	.detail-row {
		gap: 15px;
	}
}
</style>


</head>

<body>

	
	<!-- Navbar -->

	<nav class="navbar">

		<div class="logo">RAPIDO</div>

		<div class="nav-text">Safe • Fast • Affordable</div>

	</nav>



	<!-- Confirmation -->

	<main class="main">

		<div class="confirmation-card">


			<!-- Success -->

			<div class="success-icon">✓</div>


			<h1>Booking Confirmed!</h1>


			<p class="success-message">Your ride has been successfully
				booked. Your captain will reach your pickup location shortly.</p>



			<!-- Booking Details -->

			<div class="details">


				<div class="detail-row">

					<span class="detail-label"> 🧑 Captain </span> <span
						class="detail-value"> ${bookingResponse.riderName} </span>

				</div>


				<div class="detail-row">

					<span class="detail-label"> 🏍️ Bike Number </span> <span
						class="detail-value"> ${bookingResponse.bikeNo} </span>

				</div>


				<div class="detail-row">

					<span class="detail-label"> ⏱️ Arrival Time </span> <span
						class="detail-value"> ${bookingResponse.eta} </span>

				</div>


			</div>



			<!-- OTP -->

			<div class="otp-box">

				<div class="otp-label">SHARE THIS OTP WITH YOUR CAPTAIN</div>

				<div class="otp">${bookingResponse.otp}</div>

			</div>



			<!-- Home Button -->

			<a href="bookingDetails" class="home-btn"> Book Another Ride </a>


		</div>

	</main>



	<!-- Footer -->

	<footer>

		© 2026 <span>Rapido Booking App</span> &nbsp; | &nbsp; Ride smart.
		Ride safe.

	</footer>
	

</body>

</html>
