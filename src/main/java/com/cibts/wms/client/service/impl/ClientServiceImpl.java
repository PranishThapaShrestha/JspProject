/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibts.wms.client.service.impl;

import com.cibts.wms.client.entity.Client;
import com.cibts.wms.client.repository.ClientRepository;
import com.cibts.wms.client.repository.impl.ClientRepositoryImpl;
import com.cibts.wms.client.service.ClientService;
import java.util.List;

/**
 *
 * @author Pranish
 */
public class ClientServiceImpl implements ClientService{
    private List<Client> clients=null;
    private ClientRepository repository= new ClientRepositoryImpl(); 
    @Override
    public List<Client> findAll() throws Exception {
        if(clients==null){
            clients=repository.findAll();
        }return clients;
    }
    
}
