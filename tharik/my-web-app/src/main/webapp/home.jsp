<%-- 
    Document   : home
    Created on : Dec 20, 2020, 1:41:26 PM
    Author     : tharik
--%>

<%@page import="org.icbt.my.web.app.Utils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
            String username  = "";
            String password = "";

            if(request.getParameter("username") != null) {
                username  = request.getParameter("username").toString();
            }

            if(request.getParameter("password") != null) {
                password  = request.getParameter("password").toString();
            }
            
            if(Utils.authenticate(username, password)) {
                out.print("Welcome " + username);
            } else {
                response.sendRedirect("login.jsp");
            }


        %>
    </body>
</html>
