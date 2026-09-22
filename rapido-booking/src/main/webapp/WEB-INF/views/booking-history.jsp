<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking History</title>
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
	background: #ffd400;
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

table {
	width: 100%;
	border-collapse: collapse;
	background: white;
	border-radius: 12px;
	overflow: hidden;
	box-shadow: 0 5px 20px rgba(0, 0, 0, 0.1);
}

th, td {
	padding: 14px;
	text-align: left;
	border-bottom: 1px solid #eee;
}

th {
	background: #111;
	color: white;
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
		<h2 style="margin-bottom: 20px;">All Bookings</h2>

		<c:choose>
			<c:when test="${empty bookingList}">
				<p>No bookings found.</p>
			</c:when>
			<c:otherwise>
				<table>
					<tr>
						<th>ID</th>
						<th>Mobile</th>
						<th>Source</th>
						<th>Destination</th>
						<th>Ride Type</th>
						<th>Amount</th>
					</tr>
					<c:forEach var="booking" items="${bookingList}">
						<tr>
							<td>${booking.id}</td>
							<td>${booking.mobile}</td>
							<td>${booking.source}</td>
							<td>${booking.destination}</td>
							<td>${booking.rideType}</td>
							<td>${booking.amount}</td>
						</tr>
					</c:forEach>
				</table>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>