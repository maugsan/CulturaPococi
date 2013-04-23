/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Mac
 */
public class NuevoLoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
  private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
         System.out.println("ENTRO A ACTION-------------------------------------------------------------------");
        
      
        
        NuevoLoginForm login = (NuevoLoginForm) form;
        
        
        if (login.getCorreo().equals(login.getContrasenia())  ) {
             System.out.println("ENTRO----------------------------------------------------------------");
          return mapping.findForward(EXITOSO);
        } else {
            
           System.out.println("NO ENTRO----------------------------------------------------------------");
          return mapping.findForward(DENEGADO);
        }
      
    }
}
