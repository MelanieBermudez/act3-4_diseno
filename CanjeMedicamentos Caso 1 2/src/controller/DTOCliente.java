/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import model.Cliente;
/**
 *
 * @author melanie
 */
public class DTOCliente {
    private Cliente unCliente;
    private List losClientes = null;

    public DTOCliente() {
        unCliente = new Cliente();
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public List getLosClientes() {
        return losClientes;
    }

    public void setLosClientes(List losProductos) {
        this.losClientes = losProductos;
    }

   
}
