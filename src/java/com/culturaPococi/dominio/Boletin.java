/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author Personal
 */
public class Boletin {

    String fecha;
    String correo;

    public Boletin(String fecha, String correo) {
        this.fecha = fecha;
        this.correo = correo;
    }

    public Boletin() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
