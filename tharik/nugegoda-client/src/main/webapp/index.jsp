<%-- 
    Document   : index.jsp
    Created on : Jan 10, 2021, 1:46:03 PM
    Author     : tharik
--%>

<%@page import="my.Student"%>
<%@page import="my.MyService"%>
<%@page import="my.MyService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>
            <%
                MyService_Service service = new MyService_Service();
                MyService proxy = service.getMyServicePort();
                
                Student student = proxy.getStudent("01");
              
                out.print("<p> Name : " + student.getId()+ "</p>");
                out.print("<p> Name : " + student.getName() + "</p>");
                out.print("<p> Name : " + student.getNic()+ "</p>");
                
                proxy.addStudent(student);

            
            %>
        </h2>
    </body>
</html>
