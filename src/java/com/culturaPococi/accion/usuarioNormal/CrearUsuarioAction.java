/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.usuarioNormal;


import com.culturaPococi.dominio.hibernate.UsuarioNormal;
import com.culturaPococi.hibernate.helper.HelperUsuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Personal
 */
public class CrearUsuarioAction extends DispatchAction {


    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//        UsuarioNormal un = new UsuarioNormal();
        HelperUsuario hu = new HelperUsuario();
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        String colaborador = request.getParameter("colaborador");
        String contraseniaComprobacion=request.getParameter("contraseniaComprobacion");
        JOptionPane.showMessageDialog(null, "correo action "+correo);
        if (colaborador == null) {
            colaborador = "n";
        }

        
     //  UsuarioNormal un = new UsuarioNormal(correo, "", contrasenia, contraseniaComprobacion , colaborador, "");
        System.out.println("****************************************");
      //  hu.getInsertUsuario(un);
UsuarioNormal nu = new UsuarioNormal(correo, "", contrasenia, contraseniaComprobacion , colaborador, "");
System.out.println("************************111111111************22222222****");      
hu.getInsertUsuario(nu);
        System.out.println("************************111111111****************");
return mapping.getInputForward();

    }
}
