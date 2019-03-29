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
public class DTOFarmacias {
    
    private Farmacia unaFarmacia;
    private String usuario;
    private List lasFarmacias = null;

    public DTOFarmacias() {
        unaFarmacia = new Farmacia();
    }

    public Farmacia getUnaFarmacia() {
        return unaFarmacia;
    }

    public void setUnaFarmacia(Farmacia unaFarmacia) {
        this.unaFarmacia = unaFarmacia;
    }

    public List getLasFarmacias() {
        return lasFarmacias;
    }

    public void setLasFarmacias(List lasFarmacias) {
        this.lasFarmacias = lasFarmacias;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
