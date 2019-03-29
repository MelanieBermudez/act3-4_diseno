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
public class Farmacia {
    private int codigo;
    private String descripcion;
    private String telefono;

    public Farmacia() {
    }

    public Farmacia(int codigo, String descripcion, String telefono) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Farmacia{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", telefono=" + telefono + '}';
    }
    
    
}
