/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;

/**
 *
 * @author ericka
 */
public class Conexion {

    private static Conexion singConexion;
    
    Connection conn ;
    
    private Conexion() {
        
    }
    
    public static Conexion getInstance(){
        if (singConexion == null){
            singConexion = new Conexion();
        }
        return singConexion;
    }
    
    public Connection getConexion(){
        // se conecta a la bd y devuelve la conexion
        conn = null;
        return conn;
    }
    
    public boolean desconectar(){
        // se conecta a la bd y devuelve la conexion
        conn = null;
        return true;
    }
    
}
