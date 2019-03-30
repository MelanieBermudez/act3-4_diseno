/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import controller.Conexion;
import controller.DAOInterface;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
/**
 *
 * @author melanie
 */
public class DAO_Imp_Cliente implements DAOInterface{
    
    private ArrayList<Cliente> lClien = new ArrayList<Cliente>();
    
    public DAO_Imp_Cliente() {
        for (int i = 1; i <= 10; i++) {
            lClien.add(new Cliente(i, "Client-"+i, i*100));
        } 
    }
    
     @Override
    public boolean registrar(Object obj) {
        Cliente elClien = (Cliente) obj;
        
        System.out.println(" aqui se inserta el cliente en la BD");
        Conexion.getInstance().getConexion();
        // la magia de la insercion
        lClien.add(elClien);
        
        //cierra la conexion
        Conexion.getInstance().desconectar();
        
        return true;  
    }
    
     @Override
    public List recuperar() {
        
        Conexion.getInstance().getConexion();
        // la magia de la recuperacion
        
        // simula que hace el select from.... 
        
        Conexion.getInstance().desconectar();
        return lClien;
                
    }

    @Override
    public Object recuperar(Object clave) {
        int codigo = (int) clave;
        Conexion.getInstance().getConexion();

        // la magia de la recuperacion por id
        Cliente elClien = new Cliente();
        elClien.setCodigo(codigo);
        int donde = lClien.indexOf(elClien);
        
        Conexion.getInstance().desconectar();
        return (donde != -1 ? lClien.get(donde) : null);
        
    }
    
    

    
}
