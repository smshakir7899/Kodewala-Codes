<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">

<head>

```
<meta charset="UTF-8">

<meta name="viewport"
    content="width=device-width, initial-scale=1.0">

<title>PNR Status - IRCTC</title>


<style>

    /* =========================================================
       GLOBAL
    ========================================================= */

    * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
    }

    body {
        font-family: Arial, Helvetica, sans-serif;
        background-color: #f3f5f7;
        color: #333;
    }

    a {
        text-decoration: none;
        color: inherit;
    }


    /* =========================================================
       TOP UTILITY BAR
    ========================================================= */

    .top-bar {
        background-color: #f5f5f5;
        border-bottom: 1px solid #ddd;
        height: 38px;
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 0 55px;
        font-size: 13px;
        color: #555;
    }

    .top-left span {
        margin-right: 20px;
    }

    .top-right span {
        margin-left: 18px;
        cursor: pointer;
    }

    .top-right span:hover {
        color: #e85b16;
    }


    /* =========================================================
       MAIN HEADER
    ========================================================= */

    .main-header {
        background-color: #ffffff;
        height: 105px;
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 0 55px;
        border-bottom: 1px solid #ddd;
    }


    .brand-section {
        display: flex;
        align-items: center;
        gap: 18px;
    }


    .irctc-logo {
        width: 72px;
        height: 72px;
        border: 4px solid #0b3d91;
        border-radius: 50%;
        display: flex;
        align-items: center;
        justify-content: center;
        color: #0b3d91;
        font-weight: bold;
        font-size: 17px;
        background-color: white;
    }


    .brand-text h1 {
        color: #0b3d91;
        font-size: 29px;
        letter-spacing: 1px;
    }

    .brand-text p {
        color: #666;
        font-size: 13px;
        margin-top: 5px;
    }


    .railway-section {
        text-align: right;
    }

    .railway-section h3 {
        color: #555;
        font-size: 16px;
        margin-bottom: 5px;
    }

    .railway-section p {
        color: #777;
        font-size: 12px;
    }


    /* =========================================================
       NAVIGATION BAR
    ========================================================= */

    .navigation {
        background-color: #0b3d91;
        height: 50px;
        display: flex;
        align-items: center;
        padding-left: 55px;
    }


    .navigation a {
        color: white;
        font-size: 14px;
        padding: 17px 25px;
        height: 50px;
        border-right: 1px solid rgba(255,255,255,0.15);
    }


    .navigation a:hover {
        background-color: #072d6b;
    }


    .navigation .active {
        background-color: #e86a17;
    }


    /* =========================================================
       BREADCRUMB
    ========================================================= */

    .breadcrumb {
        width: 1180px;
        margin: 20px auto 0;
        font-size: 13px;
        color: #777;
    }

    .breadcrumb span {
        color: #0b3d91;
    }


    /* =========================================================
       MAIN CONTENT
    ========================================================= */

    .main-container {
        width: 1180px;
        margin: 15px auto 50px;
    }


    /* =========================================================
       PAGE TITLE
    ========================================================= */

    .page-title {
        background-color: white;
        border-left: 5px solid #e86a17;
        padding: 18px 22px;
        margin-bottom: 20px;
        box-shadow: 0 1px 5px rgba(0,0,0,0.08);
    }

    .page-title h2 {
        color: #0b3d91;
        font-size: 24px;
        font-weight: normal;
    }

    .page-title p {
        color: #777;
        font-size: 13px;
        margin-top: 7px;
    }


    /* =========================================================
       PNR SEARCH PANEL
    ========================================================= */

    .search-panel {
        background-color: white;
        padding: 25px;
        border-radius: 3px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.10);
        margin-bottom: 25px;
    }


    .search-title {
        color: #0b3d91;
        font-size: 18px;
        font-weight: bold;
        margin-bottom: 18px;
    }


    .search-row {
        display: flex;
        align-items: flex-end;
        gap: 20px;
    }


    .form-group {
        display: flex;
        flex-direction: column;
        width: 320px;
    }


    .form-group label {
        font-size: 13px;
        font-weight: bold;
        color: #555;
        margin-bottom: 7px;
    }


    .form-group input {
        height: 43px;
        border: 1px solid #bbb;
        border-radius: 3px;
        padding: 0 13px;
        font-size: 14px;
        outline: none;
    }


    .form-group input:focus {
        border-color: #0b3d91;
    }


    .search-button {
        height: 43px;
        background-color: #e86a17;
        color: white;
        border: none;
        padding: 0 30px;
        font-size: 14px;
        font-weight: bold;
        border-radius: 3px;
        cursor: pointer;
    }


    .search-button:hover {
        background-color: #c9530d;
    }


    /* =========================================================
       STATUS SUMMARY
    ========================================================= */

    .status-summary {
        background-color: white;
        box-shadow: 0 2px 8px rgba(0,0,0,0.10);
        margin-bottom: 25px;
    }


    .section-header {
        background-color: #0b3d91;
        color: white;
        padding: 15px 20px;
        font-size: 17px;
        font-weight: bold;
    }


    .summary-body {
        padding: 25px;
    }


    .pnr-status-box {
        display: flex;
        justify-content: space-between;
        align-items: center;
        background-color: #f8f9fa;
        border: 1px solid #ddd;
        padding: 22px 28px;
        margin-bottom: 20px;
    }


    .pnr-number h4 {
        color: #777;
        font-size: 12px;
        text-transform: uppercase;
        margin-bottom: 7px;
    }


    .pnr-number strong {
        font-size: 22px;
        color: #333;
    }


    .current-status {
        text-align: right;
    }


    .current-status h4 {
        color: #777;
        font-size: 12px;
        text-transform: uppercase;
        margin-bottom: 8px;
    }


    .status-badge {
        display: inline-block;
        background-color: #fff2cc;
        color: #8a6500;
        border: 1px solid #e6c95c;
        border-radius: 4px;
        padding: 10px 25px;
        font-size: 20px;
        font-weight: bold;
    }


    /* =========================================================
       JOURNEY DETAILS
    ========================================================= */

    .journey {
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 22px 15px;
        border-top: 1px solid #eee;
    }


    .station {
        width: 30%;
    }


    .station h3 {
        color: #0b3d91;
        font-size: 22px;
    }


    .station p {
        color: #666;
        font-size: 13px;
        margin-top: 5px;
    }


    .station.right {
        text-align: right;
    }


    .journey-arrow {
        width: 35%;
        text-align: center;
        color: #e86a17;
        font-size: 28px;
    }


    .journey-arrow span {
        display: block;
        color: #777;
        font-size: 12px;
        margin-top: 5px;
    }


    /* =========================================================
       PASSENGER DETAILS TABLE
    ========================================================= */

    .passenger-section {
        background-color: white;
        box-shadow: 0 2px 8px rgba(0,0,0,0.10);
        margin-bottom: 25px;
    }


    .table-container {
        padding: 20px;
    }


    table {
        width: 100%;
        border-collapse: collapse;
    }


    th {
        background-color: #eef3f9;
        color: #0b3d91;
        font-size: 13px;
        text-align: left;
        padding: 14px;
        border: 1px solid #ddd;
    }


    td {
        padding: 14px;
        border: 1px solid #ddd;
        font-size: 13px;
    }


    tr:hover {
        background-color: #fafafa;
    }


    .waitlist {
        color: #b27600;
        font-weight: bold;
    }


    .confirmed {
        color: #198754;
        font-weight: bold;
    }


    /* =========================================================
       INFORMATION BOX
    ========================================================= */

    .information {
        background-color: white;
        box-shadow: 0 2px 8px rgba(0,0,0,0.10);
        margin-bottom: 25px;
    }


    .information-body {
        padding: 25px;
    }


    .information-body ul {
        padding-left: 20px;
    }


    .information-body li {
        margin-bottom: 12px;
        color: #555;
        font-size: 13px;
        line-height: 1.5;
    }


    /* =========================================================
       NOTICE
    ========================================================= */

    .notice {
        background-color: #fff8e5;
        border: 1px solid #f0d889;
        border-left: 5px solid #e86a17;
        padding: 18px 20px;
        margin-bottom: 25px;
    }


    .notice h4 {
        color: #9b6800;
        margin-bottom: 8px;
        font-size: 15px;
    }


    .notice p {
        color: #666;
        font-size: 13px;
        line-height: 1.5;
    }


    /* =========================================================
       FOOTER
    ========================================================= */

    .footer {
        background-color: #092f6e;
        color: white;
        margin-top: 40px;
    }


    .footer-top {
        width: 1180px;
        margin: auto;
        padding: 40px 0;
        display: flex;
        justify-content: space-between;
    }


    .footer-column {
        width: 23%;
    }


    .footer-column h3 {
        font-size: 16px;
        margin-bottom: 18px;
        color: #ffffff;
    }


    .footer-column a {
        display: block;
        font-size: 13px;
        color: #d8e2f2;
        margin-bottom: 10px;
    }


    .footer-column a:hover {
        color: white;
        text-decoration: underline;
    }


    .footer-bottom {
        border-top: 1px solid rgba(255,255,255,0.2);
        text-align: center;
        padding: 18px;
        font-size: 12px;
        color: #d8e2f2;
    }


    /* =========================================================
       RESPONSIVE
    ========================================================= */

    @media screen and (max-width: 1200px) {

        .main-container,
        .breadcrumb,
        .footer-top {
            width: 92%;
        }

    }


    @media screen and (max-width: 768px) {

        .top-bar {
            padding: 0 15px;
        }

        .main-header {
            padding: 15px;
            height: auto;
        }

        .railway-section {
            display: none;
        }

        .navigation {
            padding-left: 0;
            overflow-x: auto;
        }

        .navigation a {
            white-space: nowrap;
        }

        .search-row {
            flex-direction: column;
            align-items: stretch;
        }

        .form-group {
            width: 100%;
        }

        .pnr-status-box {
            flex-direction: column;
            gap: 20px;
            text-align: center;
        }

        .current-status {
            text-align: center;
        }

        .journey {
            flex-direction: column;
            gap: 20px;
        }

        .station,
        .journey-arrow {
            width: 100%;
            text-align: center !important;
        }

        .footer-top {
            flex-direction: column;
            gap: 30px;
        }

        .footer-column {
            width: 100%;
        }

    }

</style>
```

</head>

<body>

```
<!-- =========================================================
     TOP BAR
========================================================== -->

<div class="top-bar">

    <div class="top-left">
        <span>Indian Railways</span>
        <span>Passenger Information</span>
    </div>

    <div class="top-right">
        <span>Help</span>
        <span>Contact Us</span>
        <span>Login</span>
    </div>

</div>


<!-- =========================================================
     HEADER
========================================================== -->

<header class="main-header">

    <div class="brand-section">

        <div class="irctc-logo">
            IRCTC
        </div>

        <div class="brand-text">

            <h1>IRCTC</h1>

            <p>
                Indian Railway Catering and Tourism Corporation
            </p>

        </div>

    </div>


    <div class="railway-section">

        <h3>INDIAN RAILWAYS</h3>

        <p>
            Safety • Service • Convenience
        </p>

    </div>

</header>


<!-- =========================================================
     NAVIGATION
========================================================== -->

<nav class="navigation">

    <a href="#">HOME</a>

    <a href="#" class="active">PNR STATUS</a>

    <a href="#">TRAIN SCHEDULE</a>

    <a href="#">TRAIN BETWEEN STATIONS</a>

    <a href="#">FARE ENQUIRY</a>

    <a href="#">SERVICES</a>

</nav>


<!-- =========================================================
     BREADCRUMB
========================================================== -->

<div class="breadcrumb">

    Home &nbsp; / &nbsp;

    <span>PNR Status</span>

</div>


<!-- =========================================================
     MAIN
========================================================== -->

<main class="main-container">


    <!-- PAGE TITLE -->

    <div class="page-title">

        <h2>PNR Status</h2>

        <p>
            Check your railway ticket booking status using your
            Passenger Name Record (PNR) number.
        </p>

    </div>


    <!-- =====================================================
         SEARCH PNR
    ====================================================== -->

    <div class="search-panel">

        <div class="search-title">
            Check PNR Status
        </div>


        <div class="search-row">

            <div class="form-group">

                <label for="pnr">
                    Enter PNR Number
                </label>

                <input
                    type="text"
                    id="pnr"
                    value="1234567890"
                    maxlength="10"
                    placeholder="Enter 10 digit PNR">

            </div>


            <button class="search-button">
                CHECK PNR STATUS
            </button>

        </div>

    </div>


    <!-- =====================================================
         STATUS SUMMARY
    ====================================================== -->

    <section class="status-summary">

        <div class="section-header">
            PNR Status Details
        </div>


        <div class="summary-body">


            <div class="pnr-status-box">


                <div class="pnr-number">

                    <h4>PNR Number</h4>

                    <strong>
                        1234567890
                    </strong>

                </div>


                <div class="current-status">

                    <h4>Current Booking Status</h4>

                    <span class="status-badge">
                        GNWL/14
                    </span>

                </div>


            </div>


            <!-- JOURNEY -->

            <div class="journey">


                <div class="station">

                    <h3>CSMT</h3>

                    <p>
                        Mumbai Chhatrapati Shivaji Maharaj Terminus
                    </p>

                </div>


                <div class="journey-arrow">

                    ─────────►

                    <span>
                        Journey Details
                    </span>

                </div>


                <div class="station right">

                    <h3>NDLS</h3>

                    <p>
                        New Delhi Railway Station
                    </p>

                </div>


            </div>

        </div>

    </section>


    <!-- =====================================================
         PASSENGER STATUS
    ====================================================== -->

    <section class="passenger-section">

        <div class="section-header">
            Passenger Status
        </div>


        <div class="table-container">

            <table>

                <thead>

                    <tr>

                        <th>
                            Passenger No.
                        </th>

                        <th>
                            Booking Status
                        </th>

                        <th>
                            Current Status
                        </th>

                        <th>
                            Coach
                        </th>

                        <th>
                            Berth
                        </th>

                    </tr>

                </thead>


                <tbody>

                    <tr>

                        <td>
                            1
                        </td>

                        <td>
                            GNWL/25
                        </td>

                        <td class="waitlist">
                            GNWL/14
                        </td>

                        <td>
                            --
                        </td>

                        <td>
                            --
                        </td>

                    </tr>


                    <tr>

                        <td>
                            2
                        </td>

                        <td>
                            GNWL/26
                        </td>

                        <td class="waitlist">
                            GNWL/15
                        </td>

                        <td>
                            --
                        </td>

                        <td>
                            --
                        </td>

                    </tr>

                </tbody>

            </table>

        </div>

    </section>


    <!-- =====================================================
         IMPORTANT NOTICE
    ====================================================== -->

    <div class="notice">

        <h4>
            Important Information
        </h4>

        <p>
            The above PNR status is subject to change until the
            final reservation chart is prepared. Please check
            your PNR status before commencing your journey.
        </p>

    </div>


    <!-- =====================================================
         INFORMATION
    ====================================================== -->

    <section class="information">

        <div class="section-header">
            PNR Status Information
        </div>


        <div class="information-body">

            <ul>

                <li>
                    GNWL means General Waiting List.
                </li>

                <li>
                    The number displayed after GNWL represents
                    your current position in the waiting list.
                </li>

                <li>
                    Waiting list status may change depending on
                    cancellations and subsequent reservations.
                </li>

                <li>
                    Final reservation status is determined when
                    the reservation chart is prepared.
                </li>

                <li>
                    Passengers are advised to verify the final
                    status before travelling.
                </li>

            </ul>

        </div>

    </section>


</main>


<!-- =========================================================
     FOOTER
========================================================== -->

<footer class="footer">


    <div class="footer-top">


        <div class="footer-column">

            <h3>IRCTC Services</h3>

            <a href="#">PNR Status</a>

            <a href="#">Train Schedule</a>

            <a href="#">Train Between Stations</a>

            <a href="#">Fare Enquiry</a>

        </div>


        <div class="footer-column">

            <h3>Passenger Services</h3>

            <a href="#">Ticket Booking</a>

            <a href="#">Cancellation</a>

            <a href="#">Refund Status</a>

            <a href="#">Travel Information</a>

        </div>


        <div class="footer-column">

            <h3>Information</h3>

            <a href="#">About Indian Railways</a>

            <a href="#">Terms & Conditions</a>

            <a href="#">Privacy Policy</a>

            <a href="#">Contact Us</a>

        </div>


        <div class="footer-column">

            <h3>Help & Support</h3>

            <a href="#">Customer Care</a>

            <a href="#">Frequently Asked Questions</a>

            <a href="#">Feedback</a>

            <a href="#">Emergency Information</a>

        </div>


    </div>


    <div class="footer-bottom">

        © 2026 Indian Railways / IRCTC.
        All Rights Reserved.

        <br><br>

        This is a demonstration PNR status page.

    </div>


</footer>
```

</body>

</html>
