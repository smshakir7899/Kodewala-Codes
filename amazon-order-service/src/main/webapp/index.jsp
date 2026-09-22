<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Amazon Orders</title>


    <style>

        /* =====================================================
           GLOBAL STYLES
        ===================================================== */

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }


        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: #eaeded;
            color: #111;
        }


        /* =====================================================
           HEADER
        ===================================================== */

        .header {
            height: 70px;
            background-color: #131921;

            display: flex;
            align-items: center;
            justify-content: space-between;

            padding: 0 50px;

            color: white;
        }


        .logo {
            font-size: 30px;
            font-weight: bold;
            color: white;
        }


        .logo span {
            color: #ff9900;
        }


        .header-title {
            font-size: 18px;
            color: #ffffff;
        }


        /* =====================================================
           NAVIGATION BAR
        ===================================================== */

        .navbar {
            height: 48px;
            background-color: #232f3e;

            display: flex;
            align-items: center;

            padding-left: 50px;
        }


        .navbar a {
            color: white;
            text-decoration: none;

            font-size: 14px;
            font-weight: bold;

            padding: 16px 25px;

            height: 48px;
        }


        .navbar a:hover {
            background-color: #37475a;
        }


        /* =====================================================
           MAIN CONTAINER
        ===================================================== */

        .container {
            width: 1100px;
            margin: 40px auto;
        }


        /* =====================================================
           PAGE TITLE
        ===================================================== */

        .page-title {
            background-color: white;

            padding: 25px 30px;

            margin-bottom: 25px;

            border-radius: 4px;

            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.10);
        }


        .page-title h1 {
            font-size: 28px;
            font-weight: normal;

            color: #232f3e;
        }


        .page-title p {
            margin-top: 8px;

            font-size: 14px;

            color: #565959;
        }


        /* =====================================================
           VIEW ORDER SECTION
        ===================================================== */

        .view-order-card {
            background-color: white;

            padding: 25px 30px;

            margin-bottom: 25px;

            border-radius: 4px;

            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.10);
        }


        .section-title {
            font-size: 20px;

            color: #232f3e;

            margin-bottom: 8px;
        }


        .section-description {
            color: #565959;

            font-size: 13px;

            margin-bottom: 20px;
        }


        .order-button {
            display: inline-block;

            background-color: #ffd814;

            border: 1px solid #fcd200;

            color: #111;

            text-decoration: none;

            padding: 11px 25px;

            border-radius: 20px;

            font-size: 14px;

            font-weight: bold;
        }


        .order-button:hover {
            background-color: #f7ca00;
        }


        /* =====================================================
           PLACE ORDER CARD
        ===================================================== */

        .order-card {
            background-color: white;

            width: 100%;

            padding: 30px;

            border-radius: 4px;

            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.10);
        }


        .order-card-header {
            border-bottom: 1px solid #ddd;

            padding-bottom: 20px;

            margin-bottom: 25px;
        }


        .order-card-header h2 {
            font-size: 24px;

            font-weight: normal;

            color: #232f3e;
        }


        .order-card-header p {
            font-size: 13px;

            color: #565959;

            margin-top: 6px;
        }


        /* =====================================================
           FORM
        ===================================================== */

        .form-row {
            display: flex;

            gap: 25px;

            margin-bottom: 20px;
        }


        .form-group {
            flex: 1;
        }


        .form-group.full-width {
            width: 100%;
        }


        .form-group label {
            display: block;

            font-size: 14px;

            font-weight: bold;

            margin-bottom: 8px;

            color: #111;
        }


        .required {
            color: #c40000;
        }


        .form-group input {
            width: 100%;

            height: 42px;

            border: 1px solid #888;

            border-radius: 3px;

            padding: 0 12px;

            font-size: 14px;

            outline: none;
        }


        .form-group input:focus {
            border-color: #e77600;

            box-shadow: 0 0 0 3px #ffe0b2;
        }


        .form-group input::placeholder {
            color: #999;
        }


        /* =====================================================
           DESCRIPTION
        ===================================================== */

        .description-input {
            width: 100%;

            height: 80px;

            border: 1px solid #888;

            border-radius: 3px;

            padding: 12px;

            font-family: Arial, Helvetica, sans-serif;

            font-size: 14px;

            resize: vertical;

            outline: none;
        }


        .description-input:focus {
            border-color: #e77600;

            box-shadow: 0 0 0 3px #ffe0b2;
        }


        /* =====================================================
           FORM FOOTER
        ===================================================== */

        .form-footer {
            border-top: 1px solid #ddd;

            margin-top: 10px;

            padding-top: 25px;

            display: flex;

            justify-content: space-between;

            align-items: center;
        }


        .security-text {
            font-size: 12px;

            color: #565959;
        }


        .place-order-button {
            background-color: #ffa41c;

            border: 1px solid #ff8f00;

            color: #111;

            padding: 13px 35px;

            border-radius: 22px;

            font-size: 15px;

            font-weight: bold;

            cursor: pointer;
        }


        .place-order-button:hover {
            background-color: #ff9900;
        }


        /* =====================================================
           INFORMATION SECTION
        ===================================================== */

        .information {
            margin-top: 25px;

            background-color: white;

            padding: 25px 30px;

            border-radius: 4px;

            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.10);
        }


        .information h3 {
            color: #232f3e;

            font-size: 18px;

            margin-bottom: 15px;
        }


        .information ul {
            padding-left: 20px;
        }


        .information li {
            font-size: 13px;

            color: #565959;

            margin-bottom: 10px;

            line-height: 1.5;
        }


        /* =====================================================
           FOOTER
        ===================================================== */

        .footer {
            margin-top: 60px;

            background-color: #131a22;

            color: white;
        }


        .back-to-top {
            height: 50px;

            background-color: #37475a;

            display: flex;

            justify-content: center;

            align-items: center;

            font-size: 13px;

            font-weight: bold;
        }


        .back-to-top:hover {
            background-color: #485769;
        }


        .footer-content {
            width: 1100px;

            margin: auto;

            padding: 45px 0;

            display: flex;

            justify-content: space-between;
        }


        .footer-column {
            width: 23%;
        }


        .footer-column h3 {
            font-size: 16px;

            margin-bottom: 15px;
        }


        .footer-column a {
            display: block;

            color: #ddd;

            text-decoration: none;

            font-size: 13px;

            margin-bottom: 10px;
        }


        .footer-column a:hover {
            text-decoration: underline;
        }


        .footer-bottom {
            border-top: 1px solid #3a4553;

            text-align: center;

            padding: 25px;

            font-size: 12px;

            color: #aaa;
        }


        /* =====================================================
           RESPONSIVE DESIGN
        ===================================================== */

        @media screen and (max-width: 1150px) {

            .container,
            .footer-content {
                width: 92%;
            }

        }


        @media screen and (max-width: 700px) {

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


            .container {
                margin: 20px auto;
            }


            .form-row {
                flex-direction: column;

                gap: 0;
            }


            .form-group {
                margin-bottom: 20px;
            }


            .form-footer {
                flex-direction: column;

                gap: 20px;

                align-items: stretch;
            }


            .place-order-button {
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

</head>


<body>


    <!-- =====================================================
         HEADER
    ====================================================== -->

    <header class="header">

        <div class="logo">
            amazon<span>.in</span>
        </div>

        <div class="header-title">
            Orders & Shopping
        </div>

    </header>



    <!-- =====================================================
         NAVIGATION
    ====================================================== -->

    <nav class="navbar">

        <a href="#">
            Home
        </a>

        <a href="#">
            Your Orders
        </a>

        <a href="#">
            Cart
        </a>

        <a href="#">
            Account
        </a>

        <a href="#">
            Customer Service
        </a>

    </nav>



    <!-- =====================================================
         MAIN CONTENT
    ====================================================== -->

    <main class="container">


        <!-- =================================================
             PAGE TITLE
        ================================================== -->

        <div class="page-title">

            <h1>
                Amazon Orders
            </h1>

            <p>
                View your existing orders or place a new order.
            </p>

        </div>



        <!-- =================================================
             VIEW ORDER
        ================================================== -->

        <section class="view-order-card">

            <h2 class="section-title">
                View Order Details
            </h2>


            <p class="section-description">

                View the details of your existing order,
                including product and order information.

            </p>


            <a
                href="orders/1001"
                class="order-button">

                View Order Details

            </a>

        </section>



        <!-- =================================================
             PLACE ORDER
        ================================================== -->

        <section class="order-card">


            <div class="order-card-header">

                <h2>
                    Place Your Order
                </h2>

                <p>
                    Enter the details below to place a new order.
                </p>

            </div>



            <form
                action="placeOrder"
                method="post">


                <!-- ITEM + QUANTITY -->

                <div class="form-row">


                    <div class="form-group">

                        <label for="item">

                            Item Name
                            <span class="required">*</span>

                        </label>


                        <input
                            type="text"
                            id="item"
                            name="item"
                            placeholder="Enter item name"
                            required>

                    </div>



                    <div class="form-group">

                        <label for="quantity">

                            Quantity
                            <span class="required">*</span>

                        </label>


                        <input
                            type="number"
                            id="quantity"
                            name="quantity"
                            min="1"
                            placeholder="Enter quantity"
                            required>

                    </div>


                </div>



                <!-- DESCRIPTION -->

                <div class="form-row">

                    <div class="form-group full-width">

                        <label for="desc">

                            Description

                        </label>


                        <input
                            type="text"
                            id="desc"
                            name="desc"
                            placeholder="Enter product description">

                    </div>

                </div>



                <!-- ADDRESS -->

                <div class="form-row">

                    <div class="form-group full-width">

                        <label for="address">

                            Delivery Address
                            <span class="required">*</span>

                        </label>


                        <input
                            type="text"
                            id="address"
                            name="address"
                            placeholder="Enter complete delivery address"
                            required>

                    </div>

                </div>



                <!-- MOBILE NUMBER -->

                <div class="form-row">

                    <div class="form-group">

                        <label for="number">

                            Mobile Number
                            <span class="required">*</span>

                        </label>


                        <input
                            type="tel"
                            id="number"
                            name="number"
                            placeholder="Enter mobile number"
                            maxlength="10"
                            required>

                    </div>

                </div>



                <!-- FORM FOOTER -->

                <div class="form-footer">


                    <div class="security-text">

                        🔒 Your order information is securely submitted.

                    </div>


                    <button
                        type="submit"
                        class="place-order-button">

                        Place Order

                    </button>


                </div>


            </form>


        </section>



        <!-- =================================================
             INFORMATION
        ================================================== -->

        <section class="information">


            <h3>
                Ordering Information
            </h3>


            <ul>

                <li>
                    Enter the correct item name and quantity.
                </li>

                <li>
                    Provide a complete delivery address.
                </li>

                <li>
                    Make sure your mobile number is correct.
                </li>

                <li>
                    Check all order details before submitting.
                </li>

            </ul>


        </section>


    </main>



    <!-- =====================================================
         FOOTER
    ====================================================== -->

    <footer class="footer">


        <div class="back-to-top">
            Back to top
        </div>


        <div class="footer-content">


            <div class="footer-column">

                <h3>
                    Get to Know Us
                </h3>

                <a href="#">
                    About Us
                </a>

                <a href="#">
                    Careers
                </a>

                <a href="#">
                    Press Releases
                </a>

                <a href="#">
                    Our Services
                </a>

            </div>



            <div class="footer-column">

                <h3>
                    Make Money with Us
                </h3>

                <a href="#">
                    Sell Products
                </a>

                <a href="#">
                    Become a Seller
                </a>

                <a href="#">
                    Advertise Your Products
                </a>

            </div>



            <div class="footer-column">

                <h3>
                    Customer Support
                </h3>

                <a href="#">
                    Your Account
                </a>

                <a href="#">
                    Your Orders
                </a>

                <a href="#">
                    Returns
                </a>

                <a href="#">
                    Help
                </a>

            </div>



            <div class="footer-column">

                <h3>
                    Payment & Security
                </h3>

                <a href="#">
                    Payment Methods
                </a>

                <a href="#">
                    Security
                </a>

                <a href="#">
                    Privacy
                </a>

                <a href="#">
                    Terms & Conditions
                </a>

            </div>


        </div>


        <div class="footer-bottom">

            © 2026 Amazon Orders Portal

            <br><br>

            This is a demonstration project.

        </div>


    </footer>


</body>

</html>