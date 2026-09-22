
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Rapido Home</title>

<style>

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, Helvetica, sans-serif;
}

body {
    background-color: #FFD400;
    min-height: 100vh;

    display: flex;
    justify-content: center;
    align-items: center;
}

/* Main Container */
.container {
    background-color: white;
    width: 420px;
    padding: 45px 35px;
    border-radius: 20px;

    text-align: center;

    box-shadow: 0 10px 30px rgba(0, 0, 0, 0.25);
}

/* Logo / Heading */
.logo {
    font-size: 42px;
    font-weight: bold;
    color: black;
    margin-bottom: 10px;
}

.tagline {
    color: #555;
    font-size: 16px;
    margin-bottom: 35px;
}

/* Buttons */
a {
    display: block;

    width: 100%;
    padding: 15px;
    margin: 15px 0;

    background-color: black;
    color: white;

    text-decoration: none;
    font-size: 17px;
    font-weight: bold;

    border-radius: 10px;

    transition: 0.3s;
}

a:hover {
    background-color: #333;
    transform: scale(1.03);
}

/* Coming Soon Button */
.coming-soon {
    background-color: #FFD400;
    color: black;
}

.coming-soon:hover {
    background-color: #e6be00;
}

/* Footer */
.footer {
    margin-top: 30px;
    font-size: 13px;
    color: #777;
}

</style>

</head>

<body>

<div class="container">

    <div class="logo">
        RAPIDO
    </div>

    <div class="tagline">
        Your ride, your way 🛵
    </div>

    <a href="bookingDetails">
        🛵 Book a Ride
    </a>

    <a href="bookingHistory">
        📋 Booking History
    </a>

   <form action="getBookingHistoryById" method="get" style="margin:15px 0;">
    <input type="number" name="id" placeholder="Enter Booking ID" required
           style="width:100%; padding:12px; border-radius:10px; border:1px solid #ccc; margin-bottom:8px;">
    <input type="submit" value="🚀 Particular History"
           style="width:100%; padding:15px; background:black; color:white; border:none; border-radius:10px; font-weight:bold; cursor:pointer;">
</form>

    <div class="footer">
        Fast • Safe • Affordable
    </div>

</div>

</body>
</html>
