/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibts.wms.client.repository.impl;

import com.cibts.wms.client.entity.Client;
import com.cibts.wms.client.repository.ClientRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pranish
 */
public class ClientRepositoryImpl implements ClientRepository {

    public List<Client> findAll() throws Exception {
        List<Client> clients = new ArrayList<>();
        String url = "jdbc:mysql://localhost/wms?serverTimezone=UTC";
        String user = "root";
        String password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "select * from workshop";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Client client = new Client();
            client.setBikeNo(rs.getInt("bike_no"));
            client.setCustomerName(rs.getString("customer_name"));
            client.setEmail(rs.getString("email"));
            client.setAddress(rs.getString("address"));
            client.setArrivalDate(rs.getDate("arrival_date"));
            client.setStatus(rs.getBoolean("status"));
            clients.add(client);
        }conn.close();

        return clients;

    }

    @Override
    public int insert(Client client) throws Exception {
         String url = "jdbc:mysql://localhost/wms?serverTimezone=UTC";
        String user = "root";
        String password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "insert into workshop(customer_name,email,address)values(?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        stmt.setObject(1, client.getCustomerName());
        stmt.setObject(2, client.getEmail());
        stmt.setObject(3, client.getAddress());
        int result=stmt.executeUpdate();
        conn.close();
        return result;
    }
    

 
    
}
