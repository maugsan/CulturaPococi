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
    private int idCategoria;
    private String fechaDeCreacion;
    private String distrito;
    private String biografia;
    private String imagenDePortada;
    private String correo;
    private String nombreDistrito;

    public Perfil(String nombrePerfil, int idCategoria, String fechaDeCreacion, String distrito, String biografia, String imagenDePortada, String correo, String nombreDistrito) {
        this.nombrePerfil = nombrePerfil;
        this.idCategoria = idCategoria;
        this.fechaDeCreacion = fechaDeCreacion;
        this.distrito = distrito;
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

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
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
