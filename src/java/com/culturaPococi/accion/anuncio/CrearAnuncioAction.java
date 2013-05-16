/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.anuncio;

import com.culturaPococi.dominio.Anuncio;
import com.culturaPococi.negocio.NegocioAnuncio;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Moa
 */
public class CrearAnuncioAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioAnuncio nAnuncio=new NegocioAnuncio();
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        boolean accionRealizada;
        AnuncioForm formu=(AnuncioForm) form;
        Anuncio anuncio=new Anuncio(formu.getTitulo(),null,formu.getPrioridad(),formu.getIdAnuncio());
        
        LinkedList listaPrioridades = new LinkedList();
        listaPrioridades = nAnuncio.listarPrioridadesDB();
        
        accionRealizada=nAnuncio.crearAnuncioDB(anuncio);
        
        if(accionRealizada==false || listaPrioridades==null){
            JOptionPane.showMessageDialog(null, "ocurrio un error al cargar la base de datos");
        }
        
        request.setAttribute("listaPrioridades", listaPrioridades);
        return mapping.getInputForward();
    }
}
