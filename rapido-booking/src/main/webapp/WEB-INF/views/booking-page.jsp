<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Rapido - Book Your Ride</title>

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
        font-size: 15px;
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

    /* Booking Card */

    .booking-card {
        width: 480px;
        background: white;
        padding: 35px;
        border-radius: 22px;
        box-shadow: 0 15px 45px rgba(0, 0, 0, 0.20);
    }

    .booking-header {
        text-align: center;
        margin-bottom: 30px;
    }

    .booking-header h1 {
        font-size: 30px;
        margin-bottom: 8px;
    }

    .booking-header p {
        color: #777;
        font-size: 14px;
    }

    /* Form */

    .form-group {
        margin-bottom: 20px;
    }

    .form-group label {
        display: block;
        font-size: 14px;
        font-weight: bold;
        margin-bottom: 8px;
    }

    .input-box {
        position: relative;
    }

    .input-icon {
        position: absolute;
        left: 14px;
        top: 50%;
        transform: translateY(-50%);
        font-size: 17px;
    }

    .form-group input,
    .form-group select {
        width: 100%;
        padding: 14px 14px 14px 45px;
        border: 1px solid #ddd;
        border-radius: 10px;
        font-size: 15px;
        outline: none;
        background: #fafafa;
        transition: 0.3s;
    }

    .form-group input:focus,
    .form-group select:focus {
        border-color: #ffd400;
        background: white;
        box-shadow: 0 0 0 3px rgba(255, 212, 0, 0.20);
    }

    /* Ride Type */

    .ride-types {
        display: flex;
        gap: 10px;
    }

    .ride-types input {
        display: none;
    }

    .ride-option {
        flex: 1;
        padding: 13px 5px;
        text-align: center;
        border: 1px solid #ddd;
        border-radius: 10px;
        cursor: pointer;
        font-weight: bold;
        font-size: 14px;
        transition: 0.3s;
    }

    .ride-types input:checked + .ride-option {
        background: #ffd400;
        border-color: #ffd400;
    }

    /* Book Button */

    .book-btn {
        width: 100%;
        border: none;
        padding: 16px;
        margin-top: 10px;
        background: #111;
        color: white;
        border-radius: 10px;
        font-size: 17px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    .book-btn:hover {
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

    @media (max-width: 550px) {

        .navbar {
            padding: 0 20px;
        }

        .nav-text {
            display: none;
        }

        .booking-card {
            width: 100%;
            padding: 25px;
        }

        .booking-header h1 {
            font-size: 26px;
        }

    }

</style>

</head>

<body>

<!-- Navbar -->

<nav class="navbar">

    <div class="logo">
        RAPIDO
    </div>

    <div class="nav-text">
        Safe • Fast • Affordable
    </div>

</nav>


<!-- Main Booking Section -->

<main class="main">

    <div class="booking-card">

        <div class="booking-header">

            <h1>🏍️ Book Your Ride</h1>

            <p>
                Enter your details and choose your ride
            </p>

        </div>


        <form action="bookRide" method="post">


            <!-- Mobile Number -->

            <div class="form-group">

                <label>
                    Mobile Number
                </label>

                <div class="input-box">

                    <span class="input-icon">📱</span>

                    <input type="text"
                           name="mobile"
                           placeholder="Enter mobile number"
                           required>

                </div>

            </div>


            <!-- Source -->

            <div class="form-group">

                <label>
                    Pickup Location
                </label>

                <div class="input-box">

                    <span class="input-icon">📍</span>

                    <input type="text"
                           name="source"
                           placeholder="Enter pickup location"
                           required>

                </div>

            </div>


            <!-- Destination -->

            <div class="form-group">

                <label>
                    Destination
                </label>

                <div class="input-box">

                    <span class="input-icon">🏁</span>

                    <input type="text"
                           name="destination"
                           placeholder="Where do you want to go?"
                           required>

                </div>

            </div>


            <!-- Ride Type -->

            <div class="form-group">

                <label>
                    Choose Ride Type
                </label>

                <div class="ride-types">

                    <input type="radio"
                           id="bike"
                           name="rideType"
                           value="Bike"
                           required>

                    <label for="bike" class="ride-option">
                        🏍️ Bike
                    </label>


                    <input type="radio"
                           id="auto"
                           name="rideType"
                           value="Auto">

                    <label for="auto" class="ride-option">
                        🛺 Auto
                    </label>


                    <input type="radio"
                           id="cab"
                           name="rideType"
                           value="Cab">

                    <label for="cab" class="ride-option">
                        🚕 Cab
                    </label>

                </div>

            </div>


            <!-- Amount -->

            <div class="form-group">

                <label>
                    Ride Amount
                </label>

                <div class="input-box">

                    <span class="input-icon">₹</span>

                    <input type="text"
                           name="amount"
                           placeholder="Enter ride amount"
                           required>

                </div>

            </div>


            <!-- Submit -->

            <input type="submit"
                   value="Book Ride →"
                   class="book-btn">

        </form>

    </div>

</main>


<!-- Footer -->

<footer>

    © 2026
    <span>Rapido Booking App</span>
    &nbsp; | &nbsp;
    Ride smart. Ride safe.

</footer>

</body>

</html>
