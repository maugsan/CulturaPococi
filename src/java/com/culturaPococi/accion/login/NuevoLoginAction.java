/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.login;

import com.culturaPococi.data.DataAnuncio;
import com.culturaPococi.data.DataLogin;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import prueba.Prueba;

/**
 *
 * @author Mac
 */
public class NuevoLoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";

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
