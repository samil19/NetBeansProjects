<%-- 
    Document   : ManagerCorte
    Created on : Nov 10, 2016, 12:58:31 AM
    Author     : Samil
--%>

<%@page import="dao.CorteDataAccess"%>
<%@page import="model.Corte"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            java.sql.Date FechaInicio = java.sql.Date.valueOf( request.getParameter("FechaInicio") );
            java.sql.Date FechaFinal = java.sql.Date.valueOf( request.getParameter("FechaFinal") );
            int CorteID = Integer.parseInt(request.getParameter("CorteID"));
            CorteDataAccess da = new CorteDataAccess();
            da.corte(CorteID, Integer.parseInt((String)request.getSession(false).getAttribute("ID")), FechaInicio, FechaFinal);
            
            response.sendRedirect("/CRUD_News/allcorte");
        %>
    </body>
</html>
