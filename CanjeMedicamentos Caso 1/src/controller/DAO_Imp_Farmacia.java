/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Farmacia;

/**
 *
 * @author ericka
 */
public class DAO_Imp_Farmacia implements DAOInterface{

    private ArrayList<Farmacia> lFarm = new ArrayList<Farmacia>();
    
    public DAO_Imp_Farmacia() {
        for (int i = 1; i <= 10; i++) {
            lFarm.add(new Farmacia(i, "La Bomba " + i , "88888888"));
        } 
    }

    
    @Override
    public boolean registrar(Object obj) {
        Farmacia laFrm = (Farmacia) obj;
        
        System.out.println(" aqui se inserta el producto en la BD");
        Conexion.getInstance().getConexion();
        // la magia de la insercion
        lFarm.add(laFrm);
        
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
        return lFarm;
                
    }

    @Override
    public Object recuperar(Object clave) {
        int codigo = (int) clave;
        Conexion.getInstance().getConexion();

        Farmacia laFarm = null;
        // la magia de la recuperacion por id
        for(Farmacia farm: lFarm){
            System.out.println("Farmacia  " + farm.getCodigo() + " compara " + codigo);
            Integer codFarmacia = farm.getCodigo();
            if(codFarmacia.equals(codigo))
                laFarm = farm;
        }
        
        Conexion.getInstance().desconectar();
        
        return laFarm;
    }
    
}
