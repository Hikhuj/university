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

@Path("/localComercialservice")
public class LocalComercial_Service {
    
    LocalComercial_dao localComercialDao = new LocalComercial_dao();
    
    // Porque verbo HTTP va a ser accedido, existen varios tipos
    @GET
    // Ruta de donde esta el recurso
    @Path("/localComercialList")
    // Que salida va a producir, pueden existir varios tipos
    @Produces(MediaType.APPLICATION_JSON)
    public List<LocalComercial> displayLocal(){
        
        return localComercialDao.getAllLocalList();
        
    }
    
}
