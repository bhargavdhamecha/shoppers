<%-- 
    Document   : header
    Created on : Mar 1, 2022, 12:59:55 PM
    Author     : abc
--%>

<%@page import="com.ce016.Product"%>
<%@page import="java.util.HashMap"%>
<%! HashMap<Integer, Product> product = new HashMap<>();
    HashMap<Integer, Integer> cart = new HashMap<>();
    int TotalQuantity=0;
%>
<%
    if(application.getAttribute("product")== null){
        product = Product.getProducts();
        application.setAttribute("product", product);
    }
    else{
        product = (HashMap<Integer, Product>) application.getAttribute("product");
    }
    
    if(session.getAttribute("cart")==null){
        session.setAttribute("cart", cart);
        session.setAttribute("TotalQuantity", TotalQuantity);    
    }
    else{
        cart = (HashMap<Integer, Integer>)session.getAttribute("cart");
        TotalQuantity = (Integer)session.getAttribute("TotalQuantity");
    }
    
    
 %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Perfect shoppers</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Mukta:300,400,700"> 
        <link rel="stylesheet" href="fonts/icomoon/style.css">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/jquery-ui.css">
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">


        <link rel="stylesheet" href="css/aos.css">

        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>
    <header class="site-navbar" role="banner">
                <div class="site-navbar-top">
                    <div class="container">
                        <div class="row align-items-center">

                            <div class="col-6 col-md-4 order-2 order-md-1 site-search-icon text-left">
                                <form action="" class="site-block-top-search">
                                    <span class="icon icon-search2"></span>
                                    <input type="text" class="form-control border-0" placeholder="Search">
                                </form>
                            </div>

                            <div class="col-12 mb-3 mb-md-0 col-md-4 order-1 order-md-2 text-center">
                                <div class="site-logo">
                                    <a href="index.jsp" class="js-logo-clone">Shoppers</a>
                                </div>
                            </div>

                            <div class="col-6 col-md-4 order-3 order-md-3 text-right">
                                <div class="site-top-icons">
                                    <ul>
                                        <li><a href="login.jsp"><span class="icon icon-person"></span></a></li>
                                        <li><a href="#"><span class="icon icon-heart-o"></span></a></li>
                                        <li>
                                            <a href="addtocart.jsp" class="site-cart">
                                                <span class="icon icon-shopping_cart"></span>
                                                <span class="count"><%= TotalQuantity %></span>
                                            </a>
                                        </li> 
                                        <li class="d-inline-block d-md-none ml-md-0"><a href="#" class="site-menu-toggle js-menu-toggle"><span class="icon-menu"></span></a></li>
                                    </ul>
                                </div> 
                            </div>

                        </div>
                    </div>
                </div> 
                <nav class="site-navigation text-right text-md-center" role="navigation">
                    <div class="container">
                        <ul class="site-menu js-clone-nav d-none d-md-block">
                            <li class="has-children active">
                                <a href="index.jsp">Home</a>
                                <ul class="dropdown">
                                    <li><a href="#">Menu One</a></li>
                                    <li><a href="#">Menu Two</a></li>
                                    <li><a href="#">Menu Three</a></li>
                                    <li class="has-children">
                                        <a href="#">Sub Menu</a>
                                        <ul class="dropdown">
                                            <li><a href="#">Menu One</a></li>
                                            <li><a href="#">Menu Two</a></li>
                                            <li><a href="#">Menu Three</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li class="has-children">
                                <a href="about.html">About</a>
                                <ul class="dropdown">
                                    <li><a href="#">Menu One</a></li>
                                    <li><a href="#">Menu Two</a></li>
                                    <li><a href="#">Menu Three</a></li>
                                </ul>
                            </li>
                            <li><a href="shop.jsp">Shop</a></li>
                            <li><a href="#">Catalogue</a></li>
                            <li><a href="#">New Arrivals</a></li>
                            <li><a href="contact.html">Contact</a></li>
                        </ul>
                    </div>
                </nav>
            </header>
    </body>
</html>