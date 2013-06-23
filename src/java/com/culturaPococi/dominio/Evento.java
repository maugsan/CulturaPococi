
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author jonathan
 */
public class Evento {

    private int idEvento;
    private int idCategoria;
    private String nombreCategoria;
    private String lugar;
    private String nombre;
    private String  fecha;
    private String hora;
    private String minutos;
    private String tiempo;
    private String informacion;
    private String correo;
    private String imagen;

    public Evento() {}

    public Evento(int idEvento, int idCategoria, String nombreCategoria, String lugar, String nombre, String fecha, String hora, String minutos, String tiempo, String informacion, String correo, String imagen) {
        this.idEvento = idEvento;
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.lugar = lugar;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.minutos = minutos;
        this.tiempo = tiempo;
        this.informacion = informacion;
        this.correo = correo;
        this.imagen = imagen;
    }
    
    

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    
    
    

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}
