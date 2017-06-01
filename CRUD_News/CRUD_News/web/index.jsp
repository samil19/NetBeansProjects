<%-- 
    Document   : index
    Created on : Feb 25, 2017, 2:17:37 PM
    Author     : Samil
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    
    
    <title>FireBrand : Home</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Slick slider css -->
    <link href="css/skdslider.css" rel="stylesheet">
    <!-- Font awesome css -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <!-- smooth animate css file -->
    <link rel="stylesheet" href="css/animate.css"> 
    <!-- Main style css -->
    <link rel="stylesheet" href="style.css">
    <!-- Favicon -->
    <link rel="icon" type="image/png" href=http://i64.tinypic.com/rsfvxg.png"/> 
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>     
   
    

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
  <!-- BEGAIN PRELOADER -->
  <div id="preloader">
    <div id="status">&nbsp;</div>
  </div>
  <!-- END PRELOADER -->

  <!-- START HEADER SECTION -->
  <header id="headerArea">
    <a href="#" class="scrollToTop"><i class="fa fa-angle-up"></i></a>
    <div class="row">
      <div class="col-lg-12 col-md-12 col-sm-12">
        <div class="slider_area">           
          <div class="menuarea"> 
            <div class="navbar navbar-default navbar-fixed-top" role="navigation">
              <div class="container">
                <div class="navbar-header">
                  <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                  </button>
                  <!-- For Text Logo -->
                 <a class="navbar-brand logo" href="#"><span>Fire</span>Brand</a>
                 <!-- For Img Logo -->
                  <!--  <a class="navbar-brand logo" href="#"><img src="img/logo.png" alt="logo"></a> -->
                </div>
            
                <div id="navbar" class="navbar-collapse collapse">
                  <ul class="nav navbar-nav navbar-right custom_nav mobnav" >
                    <li><a href="/CRUD_News/chart.jsp">Muro de Resumen</a></li>
                    <li><a href="/CRUD_News/allpost">Transacciones</a></li>***
                    <li><a href="/CRUD_News/allcorte">Corte</a></li>
                    <li><a href="#priceList">Donaciones</a></li>
                    <li><a href="#clients">Contacto</a></li>
                    <li><a href="/CRUD_News/close">Desconectarse</a></li>
                    
                  </ul>
                </div><!--/.nav-collapse -->
              </div>
            </div>
          </div>       
        </div>
      </div>  
    </div>      
  </header>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <h1>Hola ${sessionScope.user}, bienvenido</h1>
   <!-- START FEATURES PRODUCT AREA -->
    <div class="features_productarea">
      <div class="container">
        <!-- START FIRST FEATURES PRODUCT -->
        <div class="row">
          <div class="col-lg-6 col-md-6">
            <div class="featprodcs_img wow fadeInLeft">
              <h1>Corte</h1>
              <img class="img-responsive" src="img/piechart${sessionScope.ID}.png" alt="img">
            </div>
          </div>
          <div class="col-lg-6 col-md-6">
            <div class="featprodcs_img wow fadeInRight">
            <h1>Ingresos y Egresos</h1>

                  <img class="img-responsive" src="img/barchart${sessionScope.ID}.png" alt="img">
                </div>
              </div>
            </div>
          </div>
        </div>

    <!-- START FEATURES PRODUCT AREA -->
    <div class="features_productarea sample_appparea">
      <div class="direction_icon">
        <a id="secondTop" class="dirc_up" href="#">
          <i class="fa fa-chevron-up"></i>
        </a>
        <a id="secondBottom" class="dirc_down" href="#">
          <i class="fa fa-chevron-down"></i>
        </a>
      </div>
  <!-- START CLIENTS SECTION -->
  <section id="clients">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="clients_area">
            <h1>Valor de los principales minerales</h1>
           
            <iframe src="https://s.tradingview.com/goldprice/widgetembed/?symbol=TVC%3AGOLD&interval=D&hidesidetoolbar=0&symboledit=1&saveimage=1&toolbarbg=f5f5f5&watchlist=TVC%3AGOLD%1FTVC%3ASILVER%1FTVC%3APLATINUM%1FTVC%3APALLADIUM%1FTVC%3AGOLDSILVER%1FTVC%3AUSOIL%1FOANDA%3AEURUSD%1FFX_IDC%3AUSDJPY%1FINDEX%3AHUI%1FINDEX%3AXAU%1FCOINBASE%3ABTCUSD&details=1&studies=&hideideas=1&theme=White&style=1&timezone=America%2FNew_York&hideideasbutton=1&withdateranges=1&studies_overrides=%7B%7D&overrides=%7B%7D&enabled_features=%5B%5D&disabled_features=%5B%5D&locale=en&utm_source=goldprice.org&utm_medium=widget&utm_campaign=chart&utm_term=TVC%3AGOLD" width="1200" height="800"></iframe>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- END CLIENTS SECTION -->
  <!-- START FOOTER SECTION -->
  <footer id="footer">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="footer_area">
            <p>Designed By Francisco Samyl</p>
          </div>
        </div>
      </div>
    </div>
  </footer>
  <!-- END FOOTER SECTION -->

  <!-- JQuery Files -->

  <!-- Initialize jQuery Library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
  <!-- Google map -->
  <script src="https://maps.googleapis.com/maps/api/js"></script>
  <script src="js/jquery.ui.map.js"></script>  
  <!-- Skds slider -->
  <script src="js/skdslider.min.js"></script>
  <!-- Bootstrap js  -->
  <script src="js/bootstrap.min.js"></script>
  <!-- For smooth animatin  -->
  <script src="js/wow.min.js"></script> 

  <!-- Custom js -->
  <script type="text/javascript" src="js/custom.js"></script>
  </body>
</html>