<%-- 
    Document   : ManagerAddNew
    Created on : Aug 8, 2015, 10:38:33 PM
    Author     : Thang
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="dao.TransaccionDataAccess"%>
<%@page import="model.Transaccion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            int TransaccionID = Integer.parseInt(request.getParameter("TransaccionID"));
            String TipoTransaccion = request.getParameter("TipoTransaccion");
            String TipoPago = request.getParameter("TipoPago");
            double Monto = Double.parseDouble(request.getParameter("Monto"));
            String Comentario = request.getParameter("Comentario");
            java.sql.Date Fecha = java.sql.Date.valueOf( request.getParameter("Fecha"));
            String Direccion = request.getParameter("Direccion");
            double Latitud = Double.parseDouble(request.getParameter("Latitud"));
            double Longitud = Double.parseDouble(request.getParameter("Longitud"));
            int rid = Integer.parseInt(request.getParameter("UserID"));
            Transaccion n = new Transaccion( TransaccionID, TipoTransaccion, TipoPago, Monto, Comentario, Fecha, Direccion, Latitud, Longitud);
            TransaccionDataAccess da = new TransaccionDataAccess();
            da.addNew(n,rid);
            
            response.sendRedirect("/CRUD_News/allpost?id2="+rid+"");
        %>
        
    </body>
</html>
