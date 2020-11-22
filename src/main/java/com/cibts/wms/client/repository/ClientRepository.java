/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibts.wms.client.repository;

import com.cibts.wms.client.entity.Client;
import java.util.List;

/**
 *
 * @author Pranish
 */
public interface ClientRepository {
    List<Client> findAll()throws Exception;
    int insert(Client client) throws Exception;
}
