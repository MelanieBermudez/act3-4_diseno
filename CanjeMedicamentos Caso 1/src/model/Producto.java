/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ericka
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private int unidadesReq;
    private int puntos;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, int unidadesReq, int puntos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidadesReq = unidadesReq;
        this.puntos = puntos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidadesReq() {
        return unidadesReq;
    }

    public void setUnidadesReq(int unidadesReq) {
        this.unidadesReq = unidadesReq;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", unidadesReq=" + unidadesReq + ", puntos=" + puntos + '\n';
    }

       @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
}
