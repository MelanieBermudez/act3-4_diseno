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
public class DTOProductos {
    
    private Producto unProducto;
    private String usuario;
    private List losProductos = null;

    public DTOProductos() {
        unProducto = new Producto();
    }

    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    public List getLosProductos() {
        return losProductos;
    }

    public void setLosProductos(List losProductos) {
        this.losProductos = losProductos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
