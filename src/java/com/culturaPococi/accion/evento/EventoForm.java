/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.evento;

import com.culturaPococi.negocio.NegocioCategoria;
import com.culturaPococi.negocio.NegocioEvento;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Personal
 */
public class EventoForm extends org.apache.struts.action.ActionForm {
    
    private FormFile file;
    private String nombre;
    private int idCategoria;
    private String lugar;
    private String  fecha;
    private String hora;
    private String minutos;
    private String informacion;
    private String correo;
    private int idEvento;

    NegocioCategoria nCategoria=new NegocioCategoria();
    NegocioEvento nEvento=new NegocioEvento();

     public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String  minutos) {
        this.minutos = minutos;
    }
    
    
    public FormFile getFile() {
        return file;
    }

    public void setFile(FormFile file) {
        this.file = file;
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

 
    
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    
    
    
    public EventoForm() {
        super();
        // TODO Auto-generated constructor stub
    }

   
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombre() == null || getNombre().length() < 1) {
            errors.add("enombre", new ActionMessage("evento.error.nombre"));  //arreglar
        }
        if (getLugar() == null || getLugar().length() < 1) {
            errors.add("elugar", new ActionMessage("evento.error.lugar"));  //arreglar
        }
        if (getInformacion() == null || getInformacion().length() < 1) {
            errors.add("einformacion", new ActionMessage("evento.error.informacion"));  //arreglar
        }
        if (getFecha() == null || getFecha().length() < 1) {
            errors.add("efecha", new ActionMessage("evento.error.fecha"));  //arreglar
        }
        try {        
            request.setAttribute("listaCategorias", nCategoria.selectCategorias());
            request.setAttribute("evento", nEvento.selectEventoDB(idEvento));
            request.setAttribute("listaEventos", nEvento.listarEventosDB());
        } catch (SQLException ex) {
            Logger.getLogger(EventoForm.class.getName()).log(Level.SEVERE, null, ex);
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
                    new ActionMessage("error.common.file.size.limit", 2048));
            return errors;
        }
        return errors;
    }
}
