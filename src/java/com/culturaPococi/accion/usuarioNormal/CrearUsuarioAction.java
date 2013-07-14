
package com.culturaPococi.accion.usuarioNormal;



import com.culturaPococi.dominio.UsuarioNormal;
import com.culturaPococi.negocio.NegocioUsuarioNormal;
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

   
  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        NegocioUsuarioNormal nun = new NegocioUsuarioNormal();
        String correo = request.getParameter("correo");
        String nombre = request.getParameter("nombre");
        String contrasenia = request.getParameter("contrasenia");
        String colaborador = request.getParameter("colaborador");
        String contraseniaComprobacion=request.getParameter("contraseniaComprobacion");
        if (colaborador == null) {
            colaborador = "n";
        }

    if(contrasenia.equalsIgnoreCase(contraseniaComprobacion)) {
    nun.crearUsuariosDB(new UsuarioNormal(correo,  nombre,
          contrasenia,  colaborador));
    
    }else {
       // fallo crear forward
    }
    return mapping.getInputForward();
       

    }
}
