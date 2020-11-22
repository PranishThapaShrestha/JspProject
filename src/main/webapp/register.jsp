<%-- 
    Document   : register
    Created on : Sep 20, 2020, 11:40:46 AM
    Author     : Pranish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bike Registration!</h1>
        <form method="post" action="_register.jsp">
           
            <div>
                <label>Customer Name:</label>
                <input type="text" name="customer_name" required=""/>
            </div>
            <div>
                <label>Email:</label>
                <input type="email" name="email" required=""/>
            </div>
            <div>
                <label>Address:</label>
                <input type="text" name="address" required=""/>
            </div>
            <button type="submit">Register</button>
            
            
        </form>
       
    </body>
</html>
