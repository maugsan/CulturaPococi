package com.culturaPococi.accion.usuarioNormal;

import com.culturaPococi.data.DataUsuarioNormal;
import com.culturaPococi.dominio.Mail;
import com.culturaPococi.dominio.UsuarioNormal;
import com.culturaPococi.negocio.NegocioUsuarioNormal;
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
 * @author Personal
 */
public class CrearUsuarioAction extends DispatchAction {

    private DataUsuarioNormal dUsuario = new DataUsuarioNormal();
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        
        NegocioUsuarioNormal nun = new NegocioUsuarioNormal();
        String correo = request.getParameter("correo");
        String nombre = request.getParameter("nombre");
        String contrasenia = request.getParameter("contrasenia");
        String colaborador = request.getParameter("colaborador");
        String contraseniaComprobacion = request.getParameter("contraseniaComprobacion");
        
        
       
        
        
        for ( UsuarioNormal uN : dUsuario.selectUsuarios()) {
            
            if (uN.getCorreo().equalsIgnoreCase(correo) ) {
             
        
            }
        
        
        }
        
        if (colaborador == null) {
            colaborador = "n";
        }

        if (contrasenia.equalsIgnoreCase(contraseniaComprobacion)) {
            

            
            nun.crearUsuariosDB(new UsuarioNormal(correo, nombre,
                    contrasenia, colaborador));


            // Recipient's email ID needs to be mentioned.
            String to = "maugsan@gmail.com";

            // Sender's email ID needs to be mentioned
            String from = "maugsan@gmail.com";

            // Assuming you are sending email from localhost
            String host = "localhost";
            Mail m = new Mail(to, from, host);

            m.enviar(to, from, host);

        } else {
            // fallo crear forward
        }
        return mapping.getInputForward();


    }
}
