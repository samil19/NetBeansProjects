<%-- 
    Document   : ManagerLogin
    Created on : Jan 29, 2017, 12:13:15 PM
    Author     : Samil
--%>
<%@page import="dao.LoginDataAccess"%>
<%@page import="model.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String LoginName = request.getParameter("LoginName");
            String Password = request.getParameter("Password");
             request.getRequestDispatcher("login.jps").forward(request,response);
            request.setAttribute("Password", Password);
            request.setAttribute("LoginName",LoginName);
           
            
            response.sendRedirect("/CRUD_News/login");
        %>
        
    </body>
</html>