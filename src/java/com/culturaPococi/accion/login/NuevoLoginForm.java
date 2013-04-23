/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.login;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Mac
 */
public class NuevoLoginForm extends org.apache.struts.action.ActionForm {

    private String correo;
    private String contrasenia;

    public NuevoLoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        System.out.println("Entro a Validate--------------------------------------------------------");
        if (correo == null || correo.length() < 1) {

            errors.add("correo", new ActionMessage("error.userName.required"));

        }

        if (contrasenia == null || contrasenia.length() < 1) {

            errors.add("contrasenia", new ActionMessage("error.password.required"));

        }


        return errors;
    }
}
