/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Producto;

/**
 *
 * @author ericka
 */
public class DAO_Imp_Productos implements DAOInterface{

    private ArrayList<Producto> lProd = new ArrayList<Producto>();
    
    public DAO_Imp_Productos() {
        for (int i = 1; i <= 10; i++) {
            lProd.add(new Producto(i, "Prod-"+i, i*2, i*100));
        } 
    }

    
    @Override
    public boolean registrar(Object obj) {
        Producto elPrd = (Producto) obj;
        
        System.out.println(" aqui se inserta el producto en la BD");
        Conexion.getInstance().getConexion();
        // la magia de la insercion
        lProd.add(elPrd);
        
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
        return lProd;
                
    }

    @Override
    public Object recuperar(Object clave) {
        int codigo = (int) clave;
        Conexion.getInstance().getConexion();

        // la magia de la recuperacion por id
        Producto elPrd = new Producto();
        elPrd.setCodigo(codigo);
        int donde = lProd.indexOf(elPrd);
        
        Conexion.getInstance().desconectar();
        return (donde != -1 ? lProd.get(donde) : null);
        
    }
    
}
