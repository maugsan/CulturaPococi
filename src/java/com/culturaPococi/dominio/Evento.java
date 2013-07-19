
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

import java.sql.Time;
import java.sql.Date;

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
    private Time tiempo;
    private String  fecha; 
    private String informacion;
    private String correo;
    private String imagen;

    public Evento(int idEvento, int idCategoria, String nombreCategoria, 
            String lugar, String nombre, Time tiempo, 
            String fecha, String informacion, String correo, String imagen) {
        this.idEvento = idEvento;
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.lugar = lugar;
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.fecha = fecha;
        this.informacion = informacion;
        this.correo = correo;
        this.imagen = imagen;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public String getLugar() {
        return lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public Time getTiempo() {
        return tiempo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getInformacion() {
        return informacion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempo(Time tiempo) {
        this.tiempo = tiempo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

 
    
    
}
