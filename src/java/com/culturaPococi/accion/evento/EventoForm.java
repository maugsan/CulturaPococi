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
import javax.swing.JOptionPane;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Personal
 */
public class EventoForm extends org.apache.struts.action.ActionForm {
    
    private String nombre;
    private int idCategoria;
    private String lugar;
    //private String  fecha;
    //private String hora;
    private String informacion;
    //private String correo;
    private int idEvento;
    //private String nombreCategoria;

    //private String imagen;
    
    NegocioCategoria nCategoria=new NegocioCategoria();
    NegocioEvento nEvento=new NegocioEvento();
    
//    public String getNombreCategoria() {
//        return nombreCategoria;
//    }
//
//    public void setNombreCategoria(String nombreCategoria) {
//        this.nombreCategoria = nombreCategoria;
//    }
//    
//    
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

//    public String getCorreo() {
//        return correo;
//    }
//
//    public void setCorreo(String correo) {
//        this.correo = correo;
//    }

    
    
    
    public EventoForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombre() == null || getNombre().length() < 1) {
            errors.add("enombre", new ActionMessage("evento.error.nombre"));  //arreglar
            JOptionPane.showMessageDialog(null, "falta nombre");
        }
        if (getLugar() == null || getLugar().length() < 1) {
            errors.add("elugar", new ActionMessage("evento.error.lugar"));  //arreglar
            JOptionPane.showMessageDialog(null, "falta lugar");
        }
        if (getInformacion() == null || getInformacion().length() < 1) {
            errors.add("einformacion", new ActionMessage("evento.error.informacion"));  //arreglar
            JOptionPane.showMessageDialog(null, "falta info");
        }
        try {        
            request.setAttribute("listaCategorias", nCategoria.selectCategoriasDB());
            request.setAttribute("evento", nEvento.selectEventoDB(idEvento));
            request.setAttribute("listaEventos", nEvento.listarEventosDB());
        } catch (SQLException ex) {
            Logger.getLogger(EventoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return errors;
    }
}
