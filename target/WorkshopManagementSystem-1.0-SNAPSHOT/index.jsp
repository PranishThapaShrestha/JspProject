<%-- 
    Document   : index
    Created on : Sep 18, 2020, 12:36:15 PM
    Author     : Pranish
--%>

<%@page import="com.cibts.wms.client.service.impl.ClientServiceImpl"%>
<%@page import="com.cibts.wms.client.service.ClientService"%>
<%@page import="com.cibts.wms.client.entity.Client"%>
<%
    ClientService service=new ClientServiceImpl();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Customers</h1>

        <select>
            <option value="">Select Customer</option>
            <%
                for (Client client : service.findAll()) {
            %>
            <option value="<%=client.getBikeNo()%>"><%=client.getCustomerName()%></option>
            <%
                }
            %>
        </select>


        <table border="1">
            <thead>
                <tr>
                    <th>Bike number</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Arrival Date</th>
                    <th>Status</th>
                </tr>
            </thead>
            <%
                for (Client client : service.findAll()) {
            %>
            <tr>
                <td><%=client.getBikeNo()%></td>
                <td><%=client.getCustomerName()%></td>
                <td><%=client.getEmail()%></td>
                <td><%=client.getAddress()%></td>
                <td><%=client.getArrivalDate()%></td>
                <td><%=client.isStatus()%></td>
            </tr>
            <%
                }
            %>

        </table>
            <h2>
                Your bike getting dirty?
                <a href="register.jsp">Click here for service.</a>
            </h2>

    </body>
</html>
