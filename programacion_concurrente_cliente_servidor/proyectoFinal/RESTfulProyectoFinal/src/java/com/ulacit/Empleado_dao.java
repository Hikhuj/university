/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulacit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class Empleado_dao {
    
    public List<Empleado> getAllEmpleadoList(){
        
        List<Empleado> empleadoLista = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoFinal?useSSL=false", "root", "mysql");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM empleado");
            empleadoLista = new ArrayList<>();
            while(rs.next()){
                int id = rs.getInt(1);
                String usuario = rs.getString(2);
                String contrasenia = rs.getString(3);
                String nombre1 = rs.getString(4);
                String nombre2 = rs.getString(5);
                String apellido1 = rs.getString(6);
                String apellido2 = rs.getString(7);
                String email = rs.getString(8);
                String tipoUsuario = rs.getString(9);
                int clienteAtendido = rs.getInt(10);
                int visitaRealizada = rs.getInt(11);
                String horarioDefinido = rs.getString(12);
                String asignarLocal = rs.getString(13);
                int descuento = rs.getInt(14);
                
                
                empleadoLista.add(new Empleado(usuario, contrasenia, nombre1, nombre2, apellido1, apellido2, email, tipoUsuario, clienteAtendido, visitaRealizada, horarioDefinido, asignarLocal, descuento));
            }
            rs.close();
            stmt.close();
            con.close();
            
            return empleadoLista;
            
        } catch(Exception e){
            
            System.out.println(e);
            
        }
        
        
        return empleadoLista;
        
    }
    
}
