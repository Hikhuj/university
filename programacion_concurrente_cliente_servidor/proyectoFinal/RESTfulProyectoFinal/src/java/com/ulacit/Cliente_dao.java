/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulacit;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class Cliente_dao {
    
    
    /*
        Obtener todos los clientes de la aplicacion
    */
    public List<Cliente> getAllClienteList() {
        
        // Crear lista para retornar
        List<Cliente> clienteList = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoFinal?useSSL=false", "root", "mysql");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cliente");
            clienteList = new ArrayList<>();
            while(rs.next()){
                int id = rs.getInt(1);
                String nombre1 = rs.getString(2);
                String nombre2 = rs.getString(3);
                String apellido1 = rs.getString(4);
                String apellido2 = rs.getString(5);
                String email = rs.getString(6);
                
                clienteList.add(new Cliente(id, nombre1, nombre2, apellido1, apellido2, email));
            }
            rs.close();
            stmt.close();
            con.close();
            
            return clienteList;
            
        }catch (Exception e) {
            System.out.println(e);
        }
        
        // retorna la lista null si no encuentra nada en la DB
        return clienteList;
        
    }
    
}
