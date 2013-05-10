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
    private String colaborador;

    public UsuarioNormal(String correo, String nombre,
            String contrasenia, String colaborador) {
        this.correo = correo;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.colaborador = colaborador;
    }

    public UsuarioNormal() {
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

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }
}
