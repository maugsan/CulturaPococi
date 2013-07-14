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
    private String idPerfil;
    private String nombreCategoria;
    private String fechaDeCreacion;
    private String biografia;
    private String imagenDePortada;
    private String correo;
    private String correoPerfil;
    private String nombreDistrito;
    private String facebook;
    private String twiter;
    private String youtube;

    public Perfil(String nombrePerfil, String idPerfil, String nombreCategoria, String fechaDeCreacion, String biografia, String imagenDePortada, String correo, String correoPerfil, String nombreDistrito, String facebook, String twiter, String youtube) {
        this.nombrePerfil = nombrePerfil;
        this.idPerfil = idPerfil;
        this.nombreCategoria = nombreCategoria;
        this.fechaDeCreacion = fechaDeCreacion;
        this.biografia = biografia;
        this.imagenDePortada = imagenDePortada;
        this.correo = correo;
        this.correoPerfil = correoPerfil;
        this.nombreDistrito = nombreDistrito;
        this.facebook = facebook;
        this.twiter = twiter;
        this.youtube = youtube;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public String getIdPerfil() {
        return idPerfil;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getImagenDePortada() {
        return imagenDePortada;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCorreoPerfil() {
        return correoPerfil;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getTwiter() {
        return twiter;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public void setIdPerfil(String idPerfil) {
        this.idPerfil = idPerfil;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setImagenDePortada(String imagenDePortada) {
        this.imagenDePortada = imagenDePortada;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCorreoPerfil(String correoPerfil) {
        this.correoPerfil = correoPerfil;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }
    
    
    
    
    
}
