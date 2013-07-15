/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Perfil;
import com.culturaPococi.negocio.NegocioPerfil;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Pedro
 */
public class GuardarPerfilAction extends DispatchAction {

    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";
    private NegocioPerfil nPerfil = new NegocioPerfil();

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        HttpSession sesion = request.getSession();



        String distrito = request.getParameter("distrito");
        String nombre = request.getParameter("nombre");
        String idPerfil = request.getParameter("idPerfil");
        String nombreCategoria = request.getParameter("idCategoria");
        String biografia = request.getParameter("biografia");
        String imagen = request.getParameter("imagen");
        String correo = (String) sesion.getAttribute("c");
        String correoPerfil = request.getParameter("correoPerfil");
        String facebook = request.getParameter("facebook");
        String twiter = request.getParameter("twiter");
        String youtube = request.getParameter("youtube");
      

        for (Perfil p : nPerfil.getListaPerfil() ) {
        
           if (nombre.equalsIgnoreCase(p.getNombrePerfil())) {
               
                JOptionPane.showMessageDialog(null, "Ya Existe");
                 return mapping.findForward(DENEGADO);
           
           }
        }


        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("dd/MM/yyyy");

        nPerfil.crearPerfil(new Perfil(nombre,
                idPerfil, nombreCategoria,
                ft.format(dNow), biografia,
                imagen, correo, correoPerfil,
                distrito, facebook,
                twiter, youtube));
        return mapping.findForward(EXITOSO);
    }
}
