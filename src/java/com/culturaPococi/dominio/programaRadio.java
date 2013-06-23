/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author jonathan
 */
public class programaRadio {

    private String nombre;
    private String horario;
    private String descripcion;
    private String correo;

    public programaRadio(String nombre, String horario, String descripcion, String correo) {
        this.nombre = nombre;
        this.horario = horario;
        this.descripcion = descripcion;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "programaRadio{" + "nombre=" + nombre + ", horario=" + horario + ", descripcion=" + descripcion + ", correo=" + correo + '}';
    }
}