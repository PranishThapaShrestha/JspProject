<%@page import="com.cibts.wms.client.entity.Client"%>
<%@page import="com.cibts.wms.client.repository.impl.ClientRepositoryImpl"%>
<%@page import="com.cibts.wms.client.repository.ClientRepository"%>
<%
    if(request.getMethod().equalsIgnoreCase("post")){
        ClientRepository repository=new ClientRepositoryImpl();
        Client client= new Client();
       
        client.setCustomerName(request.getParameter("customer_name"));
        client.setEmail(request.getParameter("email"));
        client.setAddress(request.getParameter("address"));
        int result=repository.insert(client);
        if(result>=1){
            response.sendRedirect("success.jsp");
        }else{
            response.sendRedirect("register.jsp");
        }
    }else{
        response.sendRedirect("/");
    }
    
%>
