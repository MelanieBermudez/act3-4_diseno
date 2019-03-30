/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

/**
 *
 * @author melanie
 */
import java.util.List;
import model.Cliente;
public class GestorClientes {
    private final  DAO_Imp_Cliente elDAO;

    public GestorClientes() {
        this.elDAO = new  DAO_Imp_Cliente();
    }
    
    
    public boolean crearCliente (Cliente unCliente ){
        System.out.println("en el Gestor de clientes solicitando registro de cliente");
        return elDAO.registrar(unCliente);
    }
    
    public List recuperar(){
        return elDAO.recuperar();
    }

    public Cliente consultarCliente(int codigo) {
        return (Cliente) elDAO.recuperar(codigo);
    }
    
}
