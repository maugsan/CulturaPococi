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


    NegocioAnuncio nAnuncio = new NegocioAnuncio();

   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        boolean accionRealizada;
        

        String datos = request.getParameter("datos");
        String datosSeparados[] = datos.split("-");

        Anuncio anuncio = new Anuncio(datosSeparados[2], datosSeparados[1], Integer.parseInt(datosSeparados[3]), 0);


        accionRealizada = nAnuncio.crearAnuncioDB(anuncio);
        if (accionRealizada == false) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al cargar la base de datos crearAnuncioAction");
        }

       // request.setAttribute("listaPrioridades", listaPrioridades);

        LinkedList<Anuncio> listaAnuncios;

        listaAnuncios = nAnuncio.listarAnunciosDB();
        //hay que mostrar un mensaje de error
        if (listaAnuncios == null) {
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de anuncios");
        }
        
        request.setAttribute("listaAnuncios", listaAnuncios);
        return mapping.getInputForward();
    }
}
