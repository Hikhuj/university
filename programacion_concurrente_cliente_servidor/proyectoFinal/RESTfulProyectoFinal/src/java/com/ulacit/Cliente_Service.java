/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulacit;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author roger
 */
@Path("/clienteService")
public class Cliente_Service {
    
    Cliente_dao clienteDao = new Cliente_dao();
    
    @GET
    @Path("/clienteList")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> displayCliente() {
        
        return clienteDao.getAllClienteList();
        
    }
    
}
