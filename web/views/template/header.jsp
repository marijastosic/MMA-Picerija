<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <title>MMA</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

        <!-- Custom CSS -->
        <link href="<c:url value="/css/landing.css"/>" rel="stylesheet">
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Architects+Daughter' rel='stylesheet' type='text/css'>
    </head>
    <body>



        <!-- navbar top -->
        <nav class="navbar navbar-inverse topnav"style="opacity: 0.80;">

            <!-- topnav -->
            <div class="container topnav">

                <!-- Logo -->

                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mainNavBar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="<c:url value="/views/home.jsp"/>"> <img src="<c:url value="/images/logo_pizzerija.PNG"/>"
                         style="position: relative; right: 30px; bottom: 5px; height:73px;" class="navbar-brand"/>
                    <a href="<c:url value="/views/home.jsp"/>" class="navbar-brand">MMA Picerija</a>
                </div>

                <!-- Menu Items -->
                <div class="collapse navbar-collapse" id="mainNavBar">
                    <ul class="nav navbar-nav">
                        <li><a href="<c:url value="/views/oNama.jsp"/>">O nama</a></li>
                        <li><a href="<c:url value="/views/kontakt.jsp"/>">Kontakt</a></li>

                        <li><a href="<c:url value="/views/meni.jsp"/>">Meni</a></li> 
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li> <a href="<c:url value="/views/login.jsp"/>">Login/Register</a></li>
                    </ul>     
                </div>

            </div>
        </nav>
