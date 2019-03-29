/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Producto;

/**
 *
 * @author ericka
 */
public class GestorProductos {
    
    private  DAO_Imp_Productos elDAO;

    public GestorProductos() {
        this.elDAO = new DAO_Imp_Productos();
    }
    
    
    public boolean crearProducto (Producto unProducto ){
        System.out.println("en el Gestor de productos solicitando registro de producto");
        return elDAO.registrar(unProducto);
    }
    
    public List recuperar(){
        return elDAO.recuperar();
    }

    public Producto consultarProducto(int codigo) {
        return (Producto) elDAO.recuperar(codigo);
    }
    
    
}
