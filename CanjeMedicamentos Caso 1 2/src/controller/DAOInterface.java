/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author ericka
 */
public interface DAOInterface {
    

    /**
     * 
     * @param obj: un objeto cualquiera que pueda persistirse en un ambiente de BD
     * @return 
     */
    boolean registrar(Object obj);
    
    List recuperar();
    
    Object recuperar(Object clave);
}
