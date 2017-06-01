<%-- 
    Document   : ManagerRegister
    Created on : Jan 22, 2017, 7:30:26 PM
    Author     : Samil
--%>

<%@page import="dao.LoginDataAccess"%>
<%@page import="model.Register"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            int UserID = Integer.parseInt(request.getParameter("UserID"));
            String LoginName = request.getParameter("LoginName");
            String Password = request.getParameter("Password");
            String FirstName = request.getParameter("FirstName");
            String LastName = request.getParameter("LastName");
            String Email = request.getParameter("Email");
            
            Register n = new Register( UserID, LoginName, Password, FirstName, LastName, Email);
            LoginDataAccess da = new LoginDataAccess();
            da.addNew(n);
            
            response.sendRedirect("/CRUD_News/index.html");
        %>
        
    </body>
</html>
