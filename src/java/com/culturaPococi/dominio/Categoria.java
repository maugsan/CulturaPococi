/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author Personal
 */
public class Categoria {
    
    private String nombreCategoria;
    private int idCategoria;

    public Categoria() {
    }

    
    public Categoria(String nombreCategoria, int idCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
}
