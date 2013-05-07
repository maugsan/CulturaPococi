/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.dominio;

/**
 *
 * @author jonathan
 */
public class UsuarioNormal {

    private String correo;
    private String nombre;
    private String contrasenia;
    private char colaborador;

    public UsuarioNormal(String correo, String nombre, String contrasenia, char colaborador) {
        this.correo = correo;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.colaborador = colaborador;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public char getColaborador() {
        return colaborador;
    }

    public void setColaborador(char colaborador) {
        this.colaborador = colaborador;
    }
}
