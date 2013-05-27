/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

import java.sql.Blob;

/**
 *
 * @author Personal
 */
public class Anuncio {
    
    private String titulo;
    private String imagen;
    private int prioridad;
    private int idAnuncio;

    public Anuncio() {
    }

    public Anuncio(String titulo, String imagen, int prioridad, int idAnuncio) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.prioridad = prioridad;
        this.idAnuncio = idAnuncio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }
    
    
}
