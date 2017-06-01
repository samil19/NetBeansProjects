


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        
<title>Nueva Transaccion</title>

  <link rel="icon" type="image/png" href=http://i64.tinypic.com/rsfvxg.png"> 

   <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Slick slider css -->
    <link href="css/skdslider.css" rel="stylesheet">
    <!-- Font awesome css -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <!-- smooth animate css file -->
    <link rel="stylesheet" href="css/animate.css"> 
    <!-- Main style css -->
    <link rel="stylesheet" href="css/style.css">


    
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/css?family=Maven+Pro" rel="stylesheet">
    </head>


    <body background-color:white>
        
        <script type="text/javascript">

function cambiar(esto)
{
    vista=document.getElementById(esto).style.display;
    if (vista==='none')
        vista='block';
    else
        vista='none';

    document.getElementById(esto).style.display = vista;
}
</script>

<style type="text/css">
            
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
            
            
            
             #map {
            height: 500px;
            width: 100%;
        }
         .controls {
            margin-top: 10px;
            border: 1px solid transparent;
            border-radius: 2px 0 0 2px;
            box-sizing: border-box;
            -moz-box-sizing: border-box;
            height: 32px;
            outline: none;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.3);
        }

        #pac-input {
            background-color: #fff;
            font-family: Roboto;
            font-size: 15px;
            font-weight: 300;
            margin-left: 12px;
            padding: 0 11px 0 13px;
            text-overflow: ellipsis;
            width: 300px;
        }

            #pac-input:focus {
                border-color: #4d90fe;
            }

        .pac-container {
            font-family: Roboto;
        }
        
        #type-selector {
            color: #fff;
            background-color: #4d90fe;
            padding: 5px 11px 0px 11px;
        }

            #type-selector label {
                font-family: Roboto;
                font-size: 13px;
                font-weight: 300;
            }
            
            
.form-style-5{
    max-width: 1000px;
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

#caldiv, #cal{
    animation-name: example;
    animation-duration: 3s;
}
#cal2{
    animation-name: example;
    animation-duration: 4s;
}
@keyframes example {
    0%   {left:-150px;}
    25%  {left:0px;}
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
                    <li><a href="/CRUD_News/chart.jsp?id=<%=Integer.parseInt(request.getParameter("UserID"))%>">Brief</a></li>
                    <li><a href="/CRUD_News/allpost?id2=<%=Integer.parseInt(request.getParameter("UserID"))%>">Transacciones</a></li>
                    <li><a href="/CRUD_News/allcorte?id=<%=Integer.parseInt(request.getParameter("UserID"))%>">Corte</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
              </div>
            </div>
          </div>
<br>
        <br>
        <br>
        <br>
        
        
        <h1>Nueva Transaccion</h1>
        
        <div id="caldiv" style="position:fixed;  bottom: 39px; width: auto; display:none; height: 339px; z-index: 1;">
<iframe src="./extra/CurrencyConverter.html" scrolling="no" frameborder="0" marginwidth="10" marginheight="0"  style="background-color: rgb(255, 255, 255); height:339px;"></iframe>
                
</div>
        <div id="cal" style="position:fixed;  bottom: 0px; width: auto; display:none; height: 339px; z-index: 1; margin-left:77%;">
<iframe src="./extra/cal.html" scrolling="no" frameborder="0" marginwidth="10" marginheight="0"  style="background-color: rgb(255, 255, 255); height:267px; width: 325px;"></iframe>
                
</div>
<a href="#" class="download_btn appdown_btn unique" style="position:fixed;  bottom: 60%; top: auto; width: auto; z-index: 2; margin-left:-47px;" onclick="cambiar('opciones'); return false;"><img src="http://a.dryicons.com/images/icon_sets/polygon_icons/png/128x128/calculator.png" width="30%"></a>

<div id="opciones" style="position:fixed; swidth: auto; display:none; height: 339px; z-index: 1;">
        <a href="#" id="cal" style="position:fixed;  bottom: 57%; top: auto; width: 146px; z-index: 2; background-color: #2C3539" onclick="cambiar('cal'); return false;">Calculadora</a>
    <a href="#" id="cal2" style="position:fixed;  bottom: 54%; width: 146px; top: auto; z-index: 2; background-color: #2C3539" onclick="cambiar('caldiv'); return false;">Calculadora de Divisas</a>
        </div>
        

<div class="form-style-5">
        
            <form action="JSP/ManagerAddNew.jsp" method="post">
                
                <input type="hidden" name="TransaccionID" style="width: 200px" value="1" readonly>
                Tipo de Transaccion<br>
                
               <select name="TipoTransaccion" style="width: 200px" required>
   <option value="Egreso">Egreso</option> 
   <option value="Ingreso">Ingreso</option> 
</select>
                
                <br>
                Tipo de Pago<br>
                
                <select name="TipoPago" style="width: 200px" required>
   <option value="Efectivo">Efectivo</option> 
   <option value="Tarjeta">Tarjeta</option>
   <option value="Paypal">Paypal</option> 
   <option value="Bitcoin">Bitcoin</option>
   <option value="Transferencia Bancaria">Transferencia Bancaria</option> 
   <option value="Cheque">Cheque</option>
   <option value="Intercambio">Intercambio</option> 
   <option value="Otro">Otro</option>
</select>
              
                <br>
                
                Monto<br>
                <input type="number" min="1" step="any" name="Monto" style="width: 200px" required><br>
                Comentario                <br>
                <textarea name="Comentario" style="width: 400px; height: 200px"></textarea><br>
                
                Fecha<br>
                <input type="date" name="Fecha" style="width: 200px" required><br>
                
                <input type="hidden" name="Latitud" id="Latitud" required>
                
                <input type="hidden" name="Longitud" id="Longitud" required>
                
                
                
                
                
                
                
                
                
                <input id="pac-input" class="controls" type="text" name="Direccion"
                       placeholder="Enter a location" required>

    <div id="type-selector" class="controls">
        <input type="radio" name="type" id="changetype-all" checked="checked">
        <label for="changetype-all">All</label>

        <input type="radio" name="type" id="changetype-establishment">
        <label for="changetype-establishment">Establishments</label>

        <input type="radio" name="type" id="changetype-address">
        <label for="changetype-address">Addresses</label>
    </div>
        
                <div id="map" style="position:fixed;"></div>

    <script>
    function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
            center: { lat: 18.4723789, lng: -69.9729824 },
            zoom: 13
        });

        var input = (
        document.getElementById('pac-input'));

        var types = document.getElementById('type-selector');
        map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);
        map.controls[google.maps.ControlPosition.TOP_LEFT].push(types);

        var autocomplete = new google.maps.places.Autocomplete(input);
        autocomplete.bindTo('bounds', map);

        var infowindow = new google.maps.InfoWindow();
        var marker = new google.maps.Marker({draggable: true,
            map: map,
            anchorPoint: new google.maps.Point(0, -29)
        });

        
        autocomplete.addListener('place_changed', function () {
            infowindow.close();
            marker.setVisible(false);
            var place = autocomplete.getPlace();
            if (!place.geometry) {
                window.alert("Autocomplete's returned place contains no geometry");
                return;
            }


            if (place.geometry.viewport) {
                map.fitBounds(place.geometry.viewport);
            } else {
                map.setCenter(place.geometry.location);
                map.setZoom(17);
            }
            marker.setIcon(({
                url: place.icon,
                size: new google.maps.Size(71, 71),
                origin: new google.maps.Point(0, 0),
                anchor: new google.maps.Point(17, 34),
                scaledSize: new google.maps.Size(35, 35)
            }));
            marker.setPosition(place.geometry.location);
            marker.setVisible(true);

            var address = '';
            if (place.address_components) {
                address = [
                  (place.address_components[0] && place.address_components[0].short_name || ''),
                  (place.address_components[1] && place.address_components[1].short_name || ''),
                  (place.address_components[2] && place.address_components[2].short_name || '')
                ].join(' ');
            }


            infowindow.setContent('<div><strong>' + place.name + '</strong><br>' + address);
            infowindow.open(map, marker);
});
            // Sets a listener on a radio button to change the filter type on Places
            // Autocomplete.
            
            google.maps.event.addListener(marker, 'dragend', function (event) {
            document.getElementById("Latitud").value = this.getPosition().lat();
            document.getElementById("Longitud").value = this.getPosition().lng();
        });

            
            
            function setupClickListener(id, types) {
                var radioButton = document.getElementById(id);
                radioButton.addEventListener('click', function() {
                    autocomplete.setTypes(types);
                });
            }



            setupClickListener('changetype-all', []);
            setupClickListener('changetype-address', ['address']);
            setupClickListener('changetype-establishment', ['establishment']);
            setupClickListener('changetype-geocode', ['geocode']);



        }


    </script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDLov3DZ5oTZUglO6OQ_-pDvIMZ_FsIJ_8&libraries=places&callback=initMap"
            async defer></script>
                
                
                
                 <input type="hidden" name="UserID" value="<%=Integer.parseInt(request.getParameter("UserID"))%>">
                
                
                
                
                
                
                
                
                <input type="submit" value="Submit">
            </form>
        
        
            <!--Complete Interface Addnew.-->
        </div>

    </body>
</html>
