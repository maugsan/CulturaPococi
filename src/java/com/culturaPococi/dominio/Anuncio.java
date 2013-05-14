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
    private Blob imagen;
    private int prioridad;
    private int idAnuncio;

    public Anuncio() {
    }

    public Anuncio(String titulo, Blob imagen, int prioridad, int idAnuncio) {
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

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
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
