package com.culturaPococi.dominio.hibernate;
// Generated 11-jun-2013 9:59:41 by Hibernate Tools 3.2.1.GA



/**
 * Usuarionormal generated by hbm2java
 */
public class Usuarionormal  implements java.io.Serializable {


     private String correo;
     private String nombre;
     private String contrasenia;
     private String contraseniaComprobacion;
     private String colaborador;
     private String comprobacion;

    public Usuarionormal() {
    }

	
    public Usuarionormal(String correo) {
        this.correo = correo;
    }
    public Usuarionormal(String correo, String nombre, String contrasenia, String contraseniaComprobacion, String colaborador, String comprobacion) {
       this.correo = correo;
       this.nombre = nombre;
       this.contrasenia = contrasenia;
       this.contraseniaComprobacion = contraseniaComprobacion;
       this.colaborador = colaborador;
       this.comprobacion = comprobacion;
    }
   
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getContraseniaComprobacion() {
        return this.contraseniaComprobacion;
    }
    
    public void setContraseniaComprobacion(String contraseniaComprobacion) {
        this.contraseniaComprobacion = contraseniaComprobacion;
    }
    public String getColaborador() {
        return this.colaborador;
    }
    
    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }
    public String getComprobacion() {
        return this.comprobacion;
    }
    
    public void setComprobacion(String comprobacion) {
        this.comprobacion = comprobacion;
    }




}

