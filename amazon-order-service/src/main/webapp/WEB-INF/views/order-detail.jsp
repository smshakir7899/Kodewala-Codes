<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport"
        content="width=device-width, initial-scale=1.0">

    <title>Order Details - Amazon</title>


    <style>

        /* =====================================================
           GLOBAL
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

            color: white;
        }


        /* =====================================================
           NAVIGATION
        ===================================================== */

        .navbar {
            height: 48px;

            background-color: #232f3e;

            display: flex;

            align-items: center;

            padding-left: 50px;
        }


        .navbar a {
            height: 48px;

            display: flex;

            align-items: center;

            padding: 0 25px;

            color: white;

            text-decoration: none;

            font-size: 14px;

            font-weight: bold;
        }


        .navbar a:hover {
            background-color: #37475a;
        }


        .navbar .active {
            background-color: #37475a;
        }


        /* =====================================================
           MAIN CONTAINER
        ===================================================== */

        .container {
            width: 1100px;

            margin: 40px auto 60px;
        }


        /* =====================================================
           BREADCRUMB
        ===================================================== */

        .breadcrumb {
            font-size: 13px;

            color: #565959;

            margin-bottom: 18px;
        }


        .breadcrumb span {
            color: #007185;
        }


        /* =====================================================
           PAGE TITLE
        ===================================================== */

        .page-title {
            background-color: white;

            padding: 25px 30px;

            border-radius: 4px;

            margin-bottom: 25px;

            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.10);
        }


        .page-title h1 {
            font-size: 28px;

            font-weight: normal;

            color: #232f3e;
        }


        .page-title p {
            margin-top: 8px;

            color: #565959;

            font-size: 13px;
        }


        /* =====================================================
           ORDER DETAILS CARD
        ===================================================== */

        .order-card {
            background-color: white;

            border-radius: 4px;

            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.10);

            margin-bottom: 25px;
        }


        .order-header {
            padding: 20px 25px;

            background-color: #f7f7f7;

            border-bottom: 1px solid #ddd;

            display: flex;

            justify-content: space-between;

            align-items: center;
        }


        .order-header h2 {
            font-size: 20px;

            font-weight: normal;

            color: #232f3e;
        }


        .order-status {
            background-color: #e7f4e8;

            color: #067d62;

            border: 1px solid #a9d8b5;

            padding: 8px 18px;

            border-radius: 4px;

            font-size: 13px;

            font-weight: bold;
        }


        /* =====================================================
           ORDER INFORMATION
        ===================================================== */

        .order-body {
            padding: 30px;
        }


        .details-grid {
            display: grid;

            grid-template-columns: repeat(2, 1fr);

            gap: 25px;

            margin-bottom: 30px;
        }


        .detail-box {
            border: 1px solid #ddd;

            border-radius: 4px;

            padding: 20px;

            background-color: #fff;
        }


        .detail-box h3 {
            color: #232f3e;

            font-size: 16px;

            margin-bottom: 12px;
        }


        .detail-box p {
            color: #565959;

            font-size: 13px;

            line-height: 1.6;
        }


        .detail-label {
            color: #555;

            font-weight: bold;
        }


        /* =====================================================
           PRODUCT DETAILS
        ===================================================== */

        .product-section {
            border-top: 1px solid #ddd;

            padding-top: 25px;
        }


        .product-section h3 {
            color: #232f3e;

            font-size: 19px;

            margin-bottom: 18px;
        }


        .product {
            border: 1px solid #ddd;

            border-radius: 4px;

            padding: 22px;

            display: flex;

            justify-content: space-between;

            align-items: center;
        }


        .product-info h4 {
            font-size: 17px;

            color: #007185;

            margin-bottom: 8px;
        }


        .product-info p {
            font-size: 13px;

            color: #565959;

            margin-bottom: 6px;
        }


        .product-price {
            font-size: 20px;

            font-weight: bold;

            color: #111;

            text-align: right;
        }


        /* =====================================================
           DELIVERY ADDRESS
        ===================================================== */

        .address-section {
            margin-top: 25px;

            border-top: 1px solid #ddd;

            padding-top: 25px;
        }


        .address-section h3 {
            font-size: 18px;

            color: #232f3e;

            margin-bottom: 15px;
        }


        .address-box {
            border: 1px solid #ddd;

            border-radius: 4px;

            padding: 20px;

            width: 50%;

            color: #565959;

            font-size: 13px;

            line-height: 1.6;
        }


        /* =====================================================
           ORDER ACTIONS
        ===================================================== */

        .actions {
            margin-top: 30px;

            padding-top: 25px;

            border-top: 1px solid #ddd;

            display: flex;

            gap: 15px;
        }


        .action-button {
            padding: 11px 25px;

            border-radius: 20px;

            border: 1px solid #888;

            background-color: white;

            color: #111;

            text-decoration: none;

            font-size: 13px;

            font-weight: bold;
        }


        .action-button:hover {
            background-color: #f3f3f3;
        }


        .primary-button {
            background-color: #ffd814;

            border-color: #fcd200;
        }


        .primary-button:hover {
            background-color: #f7ca00;
        }


        /* =====================================================
           ORIGINAL PLACEHOLDER
        ===================================================== */

        .placeholder {
            margin-top: 25px;

            padding: 25px;

            background-color: #fff8e5;

            border: 1px solid #ead28b;

            border-left: 5px solid #ff9900;

            color: #565959;

            font-size: 14px;

            line-height: 1.6;
        }


        /* =====================================================
           FOOTER
        ===================================================== */

        .footer {
            background-color: #131a22;

            color: white;

            margin-top: 50px;
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
           RESPONSIVE
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


            .details-grid {
                grid-template-columns: 1fr;
            }


            .address-box {
                width: 100%;
            }


            .order-header {
                flex-direction: column;

                align-items: flex-start;

                gap: 15px;
            }


            .product {
                flex-direction: column;

                align-items: flex-start;

                gap: 15px;
            }


            .product-price {
                text-align: left;
            }


            .actions {
                flex-direction: column;
            }


            .action-button {
                text-align: center;
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
            Order Details
        </div>

    </header>



    <!-- =====================================================
         NAVIGATION
    ====================================================== -->

    <nav class="navbar">

        <a href="#">
            Home
        </a>

        <a href="#" class="active">
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


        <!-- BREADCRUMB -->

        <div class="breadcrumb">

            Home
            &nbsp;›&nbsp;

            Your Orders
            &nbsp;›&nbsp;

            <span>
                Order Details
            </span>

        </div>



        <!-- PAGE TITLE -->

        <div class="page-title">

            <h1>
                Order Details
            </h1>

            <p>
                View complete information about your order.
            </p>

        </div>



        <!-- =================================================
             ORDER CARD
        ================================================== -->

        <section class="order-card">


            <!-- ORDER HEADER -->

            <div class="order-header">

                <h2>
                    Order #1001
                </h2>


                <span class="order-status">
                    Order Placed
                </span>

            </div>



            <!-- ORDER BODY -->

            <div class="order-body">


                <!-- DETAILS GRID -->

                <div class="details-grid">


                    <!-- ORDER INFORMATION -->

                    <div class="detail-box">

                        <h3>
                            Order Information
                        </h3>


                        <p>

                            <span class="detail-label">
                                Order ID:
                            </span>

                            1001

                        </p>


                        <p>

                            <span class="detail-label">
                                Order Date:
                            </span>

                            01 September 2026

                        </p>


                        <p>

                            <span class="detail-label">
                                Status:
                            </span>

                            Order Placed

                        </p>

                    </div>



                    <!-- PAYMENT INFORMATION -->

                    <div class="detail-box">

                        <h3>
                            Payment Information
                        </h3>


                        <p>

                            <span class="detail-label">
                                Payment Method:
                            </span>

                            Online Payment

                        </p>


                        <p>

                            <span class="detail-label">
                                Payment Status:
                            </span>

                            Successful

                        </p>

                    </div>


                </div>



                <!-- =================================================
                     PRODUCT
                ================================================== -->

                <div class="product-section">


                    <h3>
                        Product Details
                    </h3>


                    <div class="product">


                        <div class="product-info">

                            <h4>
                                Product Name
                            </h4>


                            <p>

                                <strong>
                                    Item:
                                </strong>

                                Sample Product

                            </p>


                            <p>

                                <strong>
                                    Quantity:
                                </strong>

                                2

                            </p>


                            <p>

                                <strong>
                                    Description:
                                </strong>

                                Sample product description

                            </p>

                        </div>


                        <div class="product-price">

                            ₹1,999

                        </div>


                    </div>


                </div>



                <!-- =================================================
                     DELIVERY ADDRESS
                ================================================== -->

                <div class="address-section">


                    <h3>
                        Delivery Address
                    </h3>


                    <div class="address-box">

                        Customer Name
                        <br>

                        House No. 123, Main Road
                        <br>

                        Mumbai, Maharashtra
                        <br>

                        India
                        <br>

                        Mobile: 9876543210

                    </div>


                </div>



                <!-- =================================================
                     ACTIONS
                ================================================== -->

                <div class="actions">


                    <a
                        href="#"
                        class="action-button primary-button">

                        Track Order

                    </a>


                    <a
                        href="#"
                        class="action-button">

                        Download Invoice

                    </a>


                    <a
                        href="#"
                        class="action-button">

                        Back to Orders

                    </a>


                </div>



                <!-- =================================================
                     YOUR ORIGINAL TEXT
                ================================================== -->

                <div class="placeholder">

                    <strong>
                        Order Details:
                    </strong>

                    <br><br>

                    order details visible here.........

                </div>


            </div>


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