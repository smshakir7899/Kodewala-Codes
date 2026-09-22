<!DOCTYPE html>

<html lang="en">

<head>

```
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>IRCTC - PNR Enquiry</title>


<style>

    /* =====================================================
       GLOBAL RESET
    ===================================================== */

    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        font-family: Arial, Helvetica, sans-serif;
        background-color: #f2f5f8;
        color: #333;
    }


    /* =====================================================
       TOP BAR
    ===================================================== */

    .top-bar {
        height: 38px;
        background-color: #f6f6f6;
        border-bottom: 1px solid #ddd;

        display: flex;
        justify-content: space-between;
        align-items: center;

        padding: 0 55px;

        font-size: 13px;
        color: #555;
    }

    .top-left span {
        margin-right: 22px;
    }

    .top-right span {
        margin-left: 20px;
        cursor: pointer;
    }

    .top-right span:hover {
        color: #e66a17;
    }


    /* =====================================================
       HEADER
    ===================================================== */

    .header {
        height: 105px;
        background-color: white;

        display: flex;
        justify-content: space-between;
        align-items: center;

        padding: 0 55px;

        border-bottom: 1px solid #ddd;
    }


    .brand {
        display: flex;
        align-items: center;
        gap: 18px;
    }


    .logo {
        width: 72px;
        height: 72px;

        border: 4px solid #0b3d91;
        border-radius: 50%;

        display: flex;
        justify-content: center;
        align-items: center;

        color: #0b3d91;

        font-size: 17px;
        font-weight: bold;

        background-color: white;
    }


    .brand-text h1 {
        color: #0b3d91;
        font-size: 30px;
        letter-spacing: 1px;
    }


    .brand-text p {
        margin-top: 5px;
        color: #666;
        font-size: 13px;
    }


    .railway {
        text-align: right;
    }


    .railway h3 {
        color: #555;
        font-size: 16px;
        margin-bottom: 5px;
    }


    .railway p {
        color: #777;
        font-size: 12px;
    }


    /* =====================================================
       NAVIGATION
    ===================================================== */

    .navbar {
        height: 50px;
        background-color: #0b3d91;

        display: flex;
        align-items: center;

        padding-left: 55px;
    }


    .navbar a {
        height: 50px;

        display: flex;
        align-items: center;

        padding: 0 25px;

        color: white;

        font-size: 14px;

        border-right: 1px solid rgba(255,255,255,0.15);

        cursor: pointer;
    }


    .navbar a:hover {
        background-color: #082e6b;
    }


    .navbar .active {
        background-color: #e66a17;
    }


    /* =====================================================
       BREADCRUMB
    ===================================================== */

    .breadcrumb {
        width: 1100px;
        margin: 22px auto 0;

        font-size: 13px;
        color: #777;
    }


    .breadcrumb span {
        color: #0b3d91;
        font-weight: bold;
    }


    /* =====================================================
       MAIN CONTENT
    ===================================================== */

    .container {
        width: 1100px;
        margin: 18px auto 60px;
    }


    /* =====================================================
       PAGE TITLE
    ===================================================== */

    .page-title {
        background-color: white;

        border-left: 5px solid #e66a17;

        padding: 20px 25px;

        margin-bottom: 22px;

        box-shadow: 0 2px 7px rgba(0,0,0,0.08);
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


    /* =====================================================
       MAIN PNR CARD
    ===================================================== */

    .pnr-card {
        width: 700px;

        margin: 0 auto;

        background-color: white;

        box-shadow: 0 3px 15px rgba(0,0,0,0.13);

        border-radius: 4px;

        overflow: hidden;
    }


    /* =====================================================
       CARD HEADER
    ===================================================== */

    .card-header {
        background-color: #0b3d91;

        color: white;

        padding: 18px 25px;

        font-size: 19px;

        font-weight: bold;
    }


    .card-header small {
        display: block;

        margin-top: 5px;

        font-size: 12px;

        font-weight: normal;

        color: #dbe5f5;
    }


    /* =====================================================
       CARD BODY
    ===================================================== */

    .card-body {
        padding: 35px 40px;
    }


    .instruction {
        background-color: #f4f7fb;

        border: 1px solid #dce4ef;

        border-left: 4px solid #e66a17;

        padding: 15px;

        margin-bottom: 28px;

        font-size: 13px;

        line-height: 1.6;

        color: #555;
    }


    /* =====================================================
       FORM
    ===================================================== */

    .form-group {
        margin-bottom: 20px;
    }


    .form-group label {
        display: block;

        color: #444;

        font-size: 14px;

        font-weight: bold;

        margin-bottom: 8px;
    }


    .required {
        color: #d9534f;
    }


    .pnr-input {
        width: 100%;

        height: 48px;

        border: 1px solid #aaa;

        border-radius: 3px;

        padding: 0 15px;

        font-size: 17px;

        letter-spacing: 2px;

        outline: none;
    }


    .pnr-input:focus {
        border-color: #0b3d91;

        box-shadow: 0 0 4px rgba(11,61,145,0.25);
    }


    .help-text {
        margin-top: 7px;

        color: #777;

        font-size: 12px;
    }


    /* =====================================================
       BUTTON AREA
    ===================================================== */

    .button-area {
        display: flex;

        justify-content: center;

        gap: 15px;

        margin-top: 25px;
    }


    .check-button {
        height: 45px;

        min-width: 190px;

        border: none;

        border-radius: 3px;

        background-color: #e66a17;

        color: white;

        font-size: 14px;

        font-weight: bold;

        cursor: pointer;
    }


    .check-button:hover {
        background-color: #c9540c;
    }


    .reset-button {
        height: 45px;

        min-width: 120px;

        border: 1px solid #aaa;

        border-radius: 3px;

        background-color: white;

        color: #555;

        font-size: 14px;

        cursor: pointer;
    }


    .reset-button:hover {
        background-color: #f4f4f4;
    }


    /* =====================================================
       PNR INFORMATION
    ===================================================== */

    .info-section {
        width: 900px;

        margin: 30px auto 0;

        background-color: white;

        box-shadow: 0 2px 8px rgba(0,0,0,0.09);
    }


    .info-header {
        background-color: #0b3d91;

        color: white;

        padding: 14px 20px;

        font-size: 16px;

        font-weight: bold;
    }


    .info-body {
        padding: 22px 25px;
    }


    .info-body ul {
        padding-left: 20px;
    }


    .info-body li {
        margin-bottom: 10px;

        color: #555;

        font-size: 13px;

        line-height: 1.5;
    }


    /* =====================================================
       NOTICE
    ===================================================== */

    .notice {
        width: 900px;

        margin: 20px auto 0;

        background-color: #fff8e5;

        border: 1px solid #ecd68d;

        border-left: 5px solid #e66a17;

        padding: 17px 20px;
    }


    .notice h4 {
        color: #946b00;

        font-size: 14px;

        margin-bottom: 7px;
    }


    .notice p {
        color: #666;

        font-size: 12px;

        line-height: 1.5;
    }


    /* =====================================================
       FOOTER
    ===================================================== */

    .footer {
        background-color: #092f6e;

        color: white;

        margin-top: 50px;
    }


    .footer-content {
        width: 1100px;

        margin: auto;

        padding: 38px 0;

        display: flex;

        justify-content: space-between;
    }


    .footer-column {
        width: 23%;
    }


    .footer-column h3 {
        font-size: 15px;

        margin-bottom: 17px;
    }


    .footer-column a {
        display: block;

        color: #d5e0f2;

        font-size: 12px;

        margin-bottom: 10px;
    }


    .footer-column a:hover {
        color: white;

        text-decoration: underline;
    }


    .footer-bottom {
        border-top: 1px solid rgba(255,255,255,0.2);

        text-align: center;

        padding: 17px;

        color: #d5e0f2;

        font-size: 12px;
    }


    /* =====================================================
       RESPONSIVE
    ===================================================== */

    @media screen and (max-width: 1150px) {

        .container,
        .breadcrumb,
        .footer-content {
            width: 92%;
        }

        .info-section,
        .notice {
            width: 90%;
        }

    }


    @media screen and (max-width: 768px) {

        .top-bar {
            padding: 0 15px;
        }

        .top-left {
            display: none;
        }

        .header {
            padding: 15px;
            height: auto;
        }

        .railway {
            display: none;
        }

        .navbar {
            padding-left: 0;
            overflow-x: auto;
        }

        .navbar a {
            white-space: nowrap;
        }

        .pnr-card {
            width: 100%;
        }

        .card-body {
            padding: 25px 20px;
        }

        .button-area {
            flex-direction: column;
        }

        .check-button,
        .reset-button {
            width: 100%;
        }

        .footer-content {
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
<!-- =====================================================
     TOP UTILITY BAR
====================================================== -->

<div class="top-bar">

    <div class="top-left">

        <span>Indian Railways</span>

        <span>Passenger Services</span>

    </div>


    <div class="top-right">

        <span>Help</span>

        <span>Contact Us</span>

        <span>Login</span>

    </div>

</div>



<!-- =====================================================
     HEADER
====================================================== -->

<header class="header">


    <div class="brand">


        <div class="logo">
            IRCTC
        </div>


        <div class="brand-text">

            <h1>IRCTC</h1>

            <p>
                Indian Railway Catering and Tourism Corporation
            </p>

        </div>


    </div>


    <div class="railway">

        <h3>INDIAN RAILWAYS</h3>

        <p>
            Safety • Service • Convenience
        </p>

    </div>


</header>



<!-- =====================================================
     NAVIGATION
====================================================== -->

<nav class="navbar">

    <a href="#">
        HOME
    </a>

    <a href="#" class="active">
        PNR STATUS
    </a>

    <a href="#">
        TRAIN SCHEDULE
    </a>

    <a href="#">
        TRAIN BETWEEN STATIONS
    </a>

    <a href="#">
        FARE ENQUIRY
    </a>

    <a href="#">
        SERVICES
    </a>

</nav>



<!-- =====================================================
     BREADCRUMB
====================================================== -->

<div class="breadcrumb">

    Home
    &nbsp; / &nbsp;

    <span>
        PNR Status
    </span>

</div>



<!-- =====================================================
     MAIN CONTENT
====================================================== -->

<main class="container">


    <!-- PAGE TITLE -->

    <div class="page-title">

        <h2>
            IRCTC PNR Enquiry
        </h2>

        <p>
            Check the current status of your railway reservation
            using your 10-digit PNR number.
        </p>

    </div>



    <!-- =================================================
         PNR FORM CARD
    ================================================== -->

    <div class="pnr-card">


        <div class="card-header">

            PNR Status Enquiry

            <small>
                Passenger Name Record Status
            </small>

        </div>


        <div class="card-body">


            <!-- INSTRUCTION -->

            <div class="instruction">

                Enter your <strong>10-digit PNR number</strong>
                printed on your railway ticket to check your
                current reservation status.

            </div>



            <!-- FORM -->

            <form action="pnrstatus" method="get">


                <div class="form-group">

                    <label for="pnrnumber">

                        PNR Number

                        <span class="required">
                            *
                        </span>

                    </label>


                    <input
                        type="text"
                        id="pnrnumber"
                        name="pnrnumber"
                        class="pnr-input"
                        maxlength="10"
                        minlength="10"
                        pattern="[0-9]{10}"
                        placeholder="Enter 10 digit PNR number"
                        required>


                    <div class="help-text">

                        Example: 1234567890

                    </div>

                </div>



                <!-- BUTTONS -->

                <div class="button-area">


                    <button
                        type="submit"
                        class="check-button">

                        CHECK PNR STATUS

                    </button>


                    <button
                        type="reset"
                        class="reset-button">

                        RESET

                    </button>


                </div>


            </form>


        </div>

    </div>



    <!-- =================================================
         INFORMATION
    ================================================== -->

    <section class="info-section">


        <div class="info-header">

            About PNR Status

        </div>


        <div class="info-body">

            <ul>

                <li>
                    PNR stands for Passenger Name Record.
                </li>

                <li>
                    A PNR number contains information related
                    to your railway reservation.
                </li>

                <li>
                    The PNR number printed on your ticket is
                    generally a 10-digit number.
                </li>

                <li>
                    Reservation status may change due to
                    cancellations, upgrades and chart preparation.
                </li>

                <li>
                    Passengers should check the final status
                    before starting their journey.
                </li>

            </ul>

        </div>


    </section>



    <!-- =================================================
         IMPORTANT NOTICE
    ================================================== -->

    <div class="notice">


        <h4>
            Important Information
        </h4>


        <p>

            Please enter a valid 10-digit PNR number.
            The reservation status displayed is subject
            to change until the final reservation chart
            is prepared.

        </p>


    </div>


</main>



<!-- =====================================================
     FOOTER
====================================================== -->

<footer class="footer">


    <div class="footer-content">


        <div class="footer-column">

            <h3>
                IRCTC Services
            </h3>

            <a href="#">
                PNR Status
            </a>

            <a href="#">
                Train Schedule
            </a>

            <a href="#">
                Fare Enquiry
            </a>

            <a href="#">
                Train Information
            </a>

        </div>



        <div class="footer-column">

            <h3>
                Passenger Services
            </h3>

            <a href="#">
                Ticket Booking
            </a>

            <a href="#">
                Ticket Cancellation
            </a>

            <a href="#">
                Refund Status
            </a>

            <a href="#">
                Travel Information
            </a>

        </div>



        <div class="footer-column">

            <h3>
                Information
            </h3>

            <a href="#">
                About Indian Railways
            </a>

            <a href="#">
                Terms & Conditions
            </a>

            <a href="#">
                Privacy Policy
            </a>

            <a href="#">
                Contact Us
            </a>

        </div>



        <div class="footer-column">

            <h3>
                Help & Support
            </h3>

            <a href="#">
                Customer Care
            </a>

            <a href="#">
                Frequently Asked Questions
            </a>

            <a href="#">
                Feedback
            </a>

            <a href="#">
                Help Centre
            </a>

        </div>


    </div>


    <div class="footer-bottom">

        © 2026 Indian Railways / IRCTC.
        All Rights Reserved.

        <br><br>

        PNR Enquiry Portal

    </div>


</footer>
```

</body>

</html>
