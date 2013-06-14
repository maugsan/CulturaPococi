/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author MAU
 */
public class Busqueda {
    
    private String palabra;
    private String descripcion;
    private int tipo;

    public Busqueda(String palabra, String descripcion, int tipo) {
        this.palabra = palabra;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getPalabra() {
        return palabra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
