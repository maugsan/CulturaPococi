/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Pedro
 */
public class GuardarPerfilActionForm extends org.apache.struts.action.ActionForm {

    private FormFile file;
    private String nombrePerfil;
    private String idPerfil;
    private String idCategoria;
    private String nombreCategoria;
    private String fechaDeCreacion;
    private String biografia;
    private String imagenDePortada;
    private String correo;
    private String correoPerfil;
    private String nombreDistrito;
    private String facebook;
    private String twiter;
    private String youtube;
    private int votos;

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public FormFile getFile() {
        return file;
    }

    public void setFile(FormFile file) {
        this.file = file;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public String getIdPerfil() {
        return idPerfil;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getImagenDePortada() {
        return imagenDePortada;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCorreoPerfil() {
        return correoPerfil;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getTwiter() {
        return twiter;
    }

    public String getYoutube() {
        return youtube;
    }

    public int getVotos() {
        return votos;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public void setIdPerfil(String idPerfil) {
        this.idPerfil = idPerfil;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setImagenDePortada(String imagenDePortada) {
        this.imagenDePortada = imagenDePortada;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCorreoPerfil(String correoPerfil) {
        this.correoPerfil = correoPerfil;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public GuardarPerfilActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombrePerfil() == null || getNombrePerfil().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }


        if (getFile().getFileSize() == 0) {
            errors.add("common.file.err",
                    new ActionMessage("error.common.file.required"));
            return errors;
        }

        //only allow textfile to upload
        if (!"text/plain".equals(getFile().getContentType())) {
            errors.add("common.file.err.ext",
                    new ActionMessage("error.common.file.textfile.only"));
            return errors;
        }

        //file size cant larger than 2kb
        System.out.println(getFile().getFileSize());
        if (getFile().getFileSize() > 2048) { //2kb
            errors.add("common.file.err.size",
                    new ActionMessage("error.common.file.size.limit", 10240));
            return errors;
        }

        return errors;
    }
}
