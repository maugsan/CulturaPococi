/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.login;

import com.culturaPococi.dominio.UsuarioNormal;
import com.culturaPococi.negocio.NegocioUsuarioAdministrador;
import com.culturaPococi.negocio.NegocioUsuarioNormal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Mac
 */
public class NuevoLoginAction extends DispatchAction {

 
    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";
    NegocioUsuarioAdministrador nua = new NegocioUsuarioAdministrador();
    NegocioUsuarioNormal nu = new NegocioUsuarioNormal();

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {


        
        NuevoLoginForm login = (NuevoLoginForm) form;
        String correo = login.getCorreo();

              for ( UsuarioNormal uN: nu.listarUsuariosDB()) {
       
               if( correo.equalsIgnoreCase( uN.getCorreo())) {
                   
                   if(uN.isVerificado() == 0 ) {
                 
                    request.setAttribute("correo", null);
                   request.setAttribute("mensaje", "<h2 id='incorrecto'>Oops!, Debe ingresar a su correo y finalizar con "
                           + " la comprobación de cuenta!</h2>");
                         return mapping.findForward(DENEGADO);
                   }
               
               }
       }
        if (nu.verificarUsuarioNormal(login.getCorreo(), login.getContrasenia())
                || nua.verificarUsuarioAdministrador(login.getCorreo(), login.getContrasenia())) {

            if (nu.verificarUsuarioNormal(login.getCorreo(), login.getContrasenia())) {

                request.setAttribute("tipo", "0");


            } else if (nua.verificarUsuarioAdministrador(login.getCorreo(), login.getContrasenia())) {
                
                request.setAttribute("tipo", "1");

            }
            request.setAttribute("correo", correo);
            return mapping.findForward(EXITOSO);

        } else {
            request.setAttribute("correo", null);
            return mapping.findForward(DENEGADO);
        }





    }
}
