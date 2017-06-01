<%-- 
    Document   : AllPost
    Created on : Aug 8, 2015, 10:44:55 PM
    Author     : Thang
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        
          <link rel="icon" type="image/png" href=http://i64.tinypic.com/rsfvxg.png"> 
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>   
        <title>All Posts</title>
    </head>
    <body>
        <style>
           .form-style-5 {
           max-width: 750px;
    padding: 10px 20px;
    background: #f4f7f8;
    margin: 10px auto;
    padding: 20px;
    background: #f4f7f8;
    border-radius: 8px;
    font-family: Georgia, "Times New Roman", Times, serif;
            }
    .navbar-default {
    background-color: black;
    border-color: black;
}

.form-style-5{
    max-width: 890px;
    padding: 10px 20px;
    background: #f4f7f8;
    margin: 10px auto;
    padding: 20px;
    background: #f4f7f8;
    border-radius: 8px;
    font-family: Georgia, "Times New Roman", Times, serif;
}
.form-style-5 fieldset{
    border: none;
}
.form-style-5 legend {
    font-size: 1.4em;
    margin-bottom: 10px;
}
.form-style-5 label {
    margin-bottom: 8px;
}
.form-style-5 input[type="text"],
.form-style-5 input[type="number"],
.form-style-5 textarea,
.form-style-5 select,
.form-style-5 input[type="date"]{
    font-family: Georgia, "Times New Roman", Times, serif;
    background: rgba(255,255,255,.1);
    border: none;
    border-radius: 4px;
    font-size: 16px;
    margin: 0;
    outline: 0;
    padding: 7px;
    width: 100%;
    box-sizing: border-box; 
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box; 
    background-color: #e8eeef;
    color:#8a97a0;
    -webkit-box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
    box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
    margin-bottom: 30px;
    
}
.form-style-5 input[type="text"]:focus,
.form-style-5 input[type="number"]:focus,
.form-style-5 textarea:focus,
.form-style-5 select:focus{
    background: #d2d9dd;
}
.form-style-5 select{
    -webkit-appearance: menulist-button;
    height:35px;
}
.form-style-5 .number {
    background: #FFD200;
    color: #fff;
    height: 30px;
    width: 30px;
    display: inline-block;
    font-size: 0.8em;
    margin-right: 4px;
    line-height: 30px;
    text-align: center;
    text-shadow: 0 1px 0 rgba(255,255,255,0.2);
    border-radius: 15px 15px 15px 0px;
}

.form-style-5 input[type="submit"],
.form-style-5 input[type="button"]
{
    position:inherit;
    display: block;
    padding: 19px 39px 18px 39px;
    color: #FFF;
    margin: 0 auto;
    background: #FFD200;
    font-size: 18px;
    text-align: center;
    font-style: normal;
    width: 28%;
    border: 1px solid #FFD200;
    border-width: 1px 1px 3px;
    margin-bottom: 10px;
}
.form-style-5 input[type="submit"]:hover,
.form-style-5 input[type="button"]:hover
{
    background: #2C3539;
border:solid #2C3539;
}
</style>
        
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
                    <li><a href="/CRUD_News/allpost">Transacciones</a></li>
                    <li><a href="/CRUD_News/allcorte">Corte</a></li>
                    <li><a href="/CRUD_News/index.html#priceList">Donaciones</a></li>
                    <li><a href="/CRUD_News/index.html#clients">Contacto</a></li>
                    <li><a href="/CRUD_News/close">Desconectarse</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
              </div>
            </div>
          </div>
        <br>
        <br>
        <br>
        <br>
        <h1>Todos los Cortes</h1>
        
         <div class="form-style-5">
            <table cellpadding="10">
                <tr>
                    <th>Numero de Corte</th>
                    <th>Cantidad Egresos</th>
                    <th>Cantidad Ingresos</th>
                    <th>Corte</th>
                    <th>Nickname</th>
                    <th>Fecha Desde</th>
                    <th>Fecha Hasta</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach items="${AllPost}" var="p">
                    <tr>
                        <td>${p.getCorteID()}</td>
                        <td>${p.getCantidadEgresos()}</td>
                        <td>${p.getCantidadIngresos()}</td>
                        <td>${p.getCorte()}</td>
                        <td>${p.getFechaInicio()}</td>
                        <td>${p.getFechaFinal()}</td>
                        <td>
                            <form id="${p.getCorteID()}" action="AllCorteInfoID" method="post">
                            <input type="hidden" name="id" value="${p.getCorteID()}">
                            <button type="button"><a href="javascript:{}" onclick="document.getElementById('${p.getCorteID()}').submit();">Info</a></buttom>
                            
                        </form>
                        </td>
                        <td>
                            
                            
                        </td>
                    </tr>
                </c:forEach>
                    <td>
                            <button type="button"><a href="/CRUD_News/Corte/AddNew.jsp">Agregar Corte</button>
                        </td>
            </table>
        </div>
    </body>
</html>
