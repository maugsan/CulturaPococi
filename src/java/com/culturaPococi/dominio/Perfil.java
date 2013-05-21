/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author jonathan
 */
public class Perfil {
    

    private String nombrePerfil;
    private String nombreCategoria;
    private String fechaDeCreacion;
    private String biografia;
    private String imagenDePortada;
    private String correo;
    private String nombreDistrito;

    public Perfil(String nombrePerfil, String nombreCategoria, String fechaDeCreacion,String biografia, String imagenDePortada, String correo, String nombreDistrito) {
        
        
        this.nombrePerfil = nombrePerfil;
        this.nombreCategoria = nombreCategoria;
        this.fechaDeCreacion = fechaDeCreacion;
        this.biografia = biografia;
        this.imagenDePortada = imagenDePortada;
        this.correo = correo;
        this.nombreDistrito = nombreDistrito;
    }
 
    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getImagenDePortada() {
        return imagenDePortada;
    }

    public void setImagenDePortada(String imagenDePortada) {
        this.imagenDePortada = imagenDePortada;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }
    
}
