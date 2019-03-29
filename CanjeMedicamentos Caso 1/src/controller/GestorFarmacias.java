/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Farmacia;

/**
 *
 * @author j_dan
 */
public class GestorFarmacias {
    
    private  DAO_Imp_Farmacia elDAO;

    public GestorFarmacias() {
        this.elDAO = new DAO_Imp_Farmacia();
    }
    
    
    public boolean crearFarmacia (Farmacia unaFarmacia ){
        System.out.println("en el Gestor de productos solicitando registro de farmacia");
        return elDAO.registrar(unaFarmacia);
    }
    
    public List recuperar(){
        return elDAO.recuperar();
    }

    public Farmacia consultarFarmacia(int codigo) {
        return (Farmacia) elDAO.recuperar(codigo);
    }
    
}
