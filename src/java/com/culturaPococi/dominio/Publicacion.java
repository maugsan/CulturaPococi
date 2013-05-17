/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author jonathan
 */
public class Publicacion {

    private String nombrePerfil;
    private int idPublicacion;
    private String fechaPublicacion;
    private String correo;
    private String descripcion;
    private int verificacion;
    private String musica;
    private String video;
    private String texto;
    private String imagen;
    private String nombreCategoria;

    public Publicacion(String nombrePerfil,
         int idPublicacion,
         String fechaPublicacion,
         String correo,
         String descripcion,
         int verificacion,
         String musica,
         String video,
         String texto,
         String imagen,
         String nombreCategoria) {
        
        this.nombrePerfil = nombrePerfil;
        this.idPublicacion = idPublicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.correo = correo;
        this.descripcion = descripcion;
        this.verificacion = verificacion;
        this.musica = musica;
        this.video = video;
        this.texto = texto;
        this.imagen = imagen;
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(int verificacion) {
        this.verificacion = verificacion;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "nombrePerfil=" + nombrePerfil + ", idPublicacion=" + idPublicacion + ", fechaPublicacion=" + fechaPublicacion + ", correo=" + correo + ", descripcion=" + descripcion + ", verificacion=" + verificacion + ", musica=" + musica + ", video=" + video + ", texto=" + texto + ", imagen=" + imagen + ", nombreCategoria=" + nombreCategoria + '}';
    }

   

   
    
    
    
}
