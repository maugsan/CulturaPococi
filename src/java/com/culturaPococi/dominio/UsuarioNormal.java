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
    private String url;
    private String nombre;
    private String contrasenia;
    private String colaborador;
    private String fecha;
    private int verificado;


    

    public UsuarioNormal() {
    }

    public UsuarioNormal(String correo, String url, String nombre, String contrasenia, String colaborador, String fecha, int verificado) {
        this.correo = correo;
         this.url = url;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.colaborador = colaborador;
        this.fecha = fecha;
        this.verificado = verificado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUrl() {
        return url;
    }
    public int isVerificado() {
        return verificado;
    }

     public void setUrl(String url) {
        this.url = url;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVerificado(int verificado) {
        this.verificado = verificado;
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
