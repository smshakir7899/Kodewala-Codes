<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking Details</title>
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

.navbar {
	height: 70px;
	background: #ffd400
	display: flex;
	align-items: center;
	padding: 0 8%;
}

.logo {
	font-size: 30px;
	font-weight: 900;
}

.main {
	padding: 40px 8%;
}

.card {
	max-width: 480px;
	background: white;
	padding: 30px;
	border-radius: 15px;
	box-shadow: 0 5px 20px rgba(0, 0, 0, 0.1);
}

.row {
	display: flex;
	justify-content: space-between;
	padding: 10px 0;
	border-bottom: 1px solid #eee;
}

.home-link {
	display: inline-block;
	margin-bottom: 20px;
	text-decoration: none;
	color: #111;
	font-weight: bold;
}
</style>
</head>
<body>
	<nav class="navbar">
		<div class="logo">RAPIDO</div>
	</nav>
	<div class="main">
		<a class="home-link" href="bookingDetails">&larr; Back</a>
		<c:choose>

			<c:when test="${empty bookingList}">
        No booking found
    </c:when>

			<c:otherwise>
        booking details

        <div class="card">
					<div class="row">
						<span>ID</span><b>${bookingList.id}</b>
					</div>
					<div class="row">
						<span>Mobile</span><b>${bookingList.mobile}</b>
					</div>
					<div class="row">
						<span>Source</span><b>${bookingList.source}</b>
					</div>
					<div class="row">
						<span>Destination</span><b>${bookingList.destination}</b>
					</div>
					<div class="row">
						<span>Ride Type</span><b>${bookingList.rideType}</b>
					</div>
					<div class="row">
						<span>Amount</span><b>${bookingList.amount}</b>
					</div>
				</div>
			</c:otherwise>

		</c:choose>
	</div>
</body>
</html>