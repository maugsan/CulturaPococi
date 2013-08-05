package com.culturaPococi.accion.usuarioNormal;

import com.culturaPococi.data.DataUsuarioNormal;
import com.culturaPococi.dominio.Mail;
import com.culturaPococi.dominio.UsuarioNormal;
import com.culturaPococi.negocio.NegocioUsuarioNormal;
import java.sql.SQLException;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Personal
 */
public class CrearUsuarioAction extends DispatchAction {

    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";
    private DataUsuarioNormal dUsuario = new DataUsuarioNormal();

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {


        if (rpHash(request.getParameter("defaultReal")).equals(
                request.getParameter("defaultRealHash"))) {
            // Accepted
        } else {
              request.setAttribute("mensaje", "<h2 id='incorrecto'>Oops!, Capcha incorrecto!</h2>");
                return mapping.findForward(DENEGADO);
        }


        NegocioUsuarioNormal nun = new NegocioUsuarioNormal();
        String correo = request.getParameter("correo");
        String nombre = request.getParameter("nombre");
        String contrasenia = request.getParameter("contrasenia");
        String colaborador = request.getParameter("colaborador");
        String contraseniaComprobacion = request.getParameter("contraseniaComprobacion");


        for (UsuarioNormal uN : dUsuario.selectUsuarios()) {

            if (uN.getCorreo().equalsIgnoreCase(correo)) {

                
                request.setAttribute("mensaje", "<h2 id='incorrecto'>Oops!, Este correo ya esta registrado!</h2>");
                return mapping.findForward(DENEGADO);
            }
            
        }


        if (colaborador == null) {
            colaborador = "n";
        }

        if (contrasenia.equalsIgnoreCase(contraseniaComprobacion)) {
 
            
            // (String correo, String nombre, String contrasenia, String colaborador, String fecha, boolean verificado)
            nun.crearUsuariosDB(new UsuarioNormal(correo.toLowerCase(),"", nombre, contrasenia, colaborador, "", 0));

            //  String to, String emailMsgTxt, String 
            enviarVerificacionDeCuenta(correo);
            
          

        } else {
            request.setAttribute("mensaje", "<h2 id='incorrecto'>Oops!, No es posible crear este Perfi!</h2>");
            return mapping.findForward(DENEGADO);
        }
        request.setAttribute("mensaje", "<h2 id='correcto'>Cuenta Creada Correctamente <br> Se ha enviado a "+ correo +"  la verificación</h2>");
        return mapping.findForward(EXITOSO);
    }

    private String rpHash(String value) {
        int hash = 5381;
        value = value.toUpperCase();
        for (int i = 0; i < value.length(); i++) {
            hash = ((hash << 5) + hash) + value.charAt(i);
        }
        return String.valueOf(hash);
    }
    
    
    private void enviarVerificacionDeCuenta(String correo) throws SQLException, MessagingException{
        String mensaje = "";
        String nombre = "";
        String url = "http://elfrentecr.org/confirmar_cuenta.do?c=";
       for (UsuarioNormal uN : dUsuario.selectUsuarios()) {

            if (uN.getCorreo().equalsIgnoreCase(correo)) {

               url = url + uN.getUrl();
               nombre = uN.getNombre();
               
            }
            
        }
       
       mensaje = "Bienvenido "+ nombre + "al elfrentecr.org, "
               + "solo queda un paso para finalizar la inscripción"
               + ""
               + "-----------------------------"
               + "Click en el link para confirmar la cuenta"
               + "-----------------------------"
               + ""
               + url;
       
       
           Mail m = new Mail("", "", "");
           m.enviar(correo, mensaje, "Confirmación de cuenta");
    
    
    }
}
