/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Farmacia;
import model.Producto;

/**
 *
 * @author ericka
 */
public class Controlador {

    private DTOProductos dTOProductos;
    private GestorProductos gProductos;
    private GestorFarmacias gFarmacias;
        
    public Controlador() {
        gProductos = new GestorProductos();
        gFarmacias = new GestorFarmacias();
        dTOProductos = new DTOProductos();
    }

    public DTOProductos getdTOProductos() {
        return dTOProductos;
    }
    
    
    public boolean registrarProducto(int codigo, String descripcion, int unidades, int puntos){
        return true;
        
    }

    public boolean registrarProducto(){
        System.out.println("en el Controlador solicitando registro de producto");
        
        return gProductos.crearProducto(dTOProductos.getUnProducto());
    }
    
    public void recuperarProductos(){
        dTOProductos.setLosProductos((List) gProductos.recuperar());
    }

    public boolean recuperarProducto() {
        Producto elPrd =  gProductos.consultarProducto(dTOProductos.getUnProducto().getCodigo());
        dTOProductos.setUnProducto(elPrd);
        return elPrd!=null;
        
    }
    
    public boolean registrarFarmacia(int codigo, String descripcion, String telefono){
        return true;
        
    }

    public boolean registrarFarmacia(DTOFarmacias dTOFarmacia){
        System.out.println("en el Controlador solicitando registro de farmacia");
        return gFarmacias.crearFarmacia(dTOFarmacia.getUnaFarmacia());
    }
    
    public void recuperarFarmacias(DTOFarmacias dTOFarmacia){
        dTOFarmacia.setLasFarmacias((List) gFarmacias.recuperar());
    }

    public boolean recuperarFarmacia(DTOFarmacias dTOFarmacia) {
        Farmacia laFrm =  gFarmacias.consultarFarmacia(dTOFarmacia.getUnaFarmacia().getCodigo());
        System.out.println(dTOFarmacia.getUnaFarmacia().getCodigo());
        dTOFarmacia.setUnaFarmacia(laFrm);
        return laFrm!=null;
        
    }
}
