/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author Personal
 */
public class Articulo {

    
    private int idArticulo;
    private String imagen;
    private int categoria;
    private  String titulo;
    private String autor;
    private  String contenido;
    private String fecha;
    
    public Articulo() {}

    public Articulo(int idArticulo, String imagen, int categoria, String titulo, String autor, String contenido, String fecha) {
        this.idArticulo = idArticulo;
        this.imagen = imagen;
        this.categoria = categoria;
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
        this.fecha = fecha;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
