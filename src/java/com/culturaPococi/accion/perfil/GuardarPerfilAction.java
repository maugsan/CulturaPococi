package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Perfil;
import com.culturaPococi.negocio.NegocioPerfil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.apache.struts.upload.FormFile;

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


        GuardarPerfilActionForm formPerfil = (GuardarPerfilActionForm) form;
        HttpSession sesion = request.getSession();



        String distrito = request.getParameter("distrito");
        String nombre = request.getParameter("nombrePerfil");
        String idPerfil = request.getParameter("idPerfil");
        String nombreCategoria = request.getParameter("idCategoria");
        String biografia = request.getParameter("biografia");
        String correo = (String) sesion.getAttribute("c");
        String correoPerfil = request.getParameter("correoPerfil");
        String facebook = request.getParameter("facebook");
        String twiter = request.getParameter("twiter");
        String youtube = request.getParameter("youtube");


        for (Perfil p : nPerfil.getListaPerfil()) {

            if (nombre.equalsIgnoreCase(p.getNombrePerfil())) {

                request.setAttribute("mensaje", "<h2 id='incorrecto'>Oops!, No es posible crear este Perfi!</h2>");
                return mapping.findForward(DENEGADO);

            }
        }


        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("dd/MM/yyyy");

        nPerfil.crearPerfil(new Perfil(formPerfil.getNombrePerfil(),
                idPerfil, nombreCategoria,
                ft.format(dNow), biografia,
                subirImagenPerfil(mapping, formPerfil), correo, correoPerfil,
                distrito, facebook,
                twiter, youtube));


        request.setAttribute("mensaje", "<h2 id='correcto'>Perfil Creado Correctamente!</h2>");

        return mapping.findForward(EXITOSO);
    }

    public String subirImagenPerfil(ActionMapping mapping, GuardarPerfilActionForm fileUploadForm) throws FileNotFoundException, IOException {


        FormFile file = fileUploadForm.getFile();

        //Get the servers upload directory real path name
        String filePath =
                getServlet().getServletContext().getRealPath("/") + "/assets/img/perfiles";

        //create the upload folder if not exists
        File folder = new File(filePath);
        if (!folder.exists()) {
            folder.mkdir();
        }

        String fileName = file.getFileName();

        if (!("").equals(fileName)) {


            File newFile = new File(filePath, fileName);


            String extension = file.getContentType();
            String ext[] = extension.split("/");
            extension = ext[1];
            if (extension.equalsIgnoreCase("png") || (extension.equalsIgnoreCase("jpg"))
                    || (extension.equalsIgnoreCase("jpeg"))) {

                if (!newFile.exists()) {
                    FileOutputStream fos = new FileOutputStream(newFile);
                    fos.write(file.getFileData());
                    fos.flush();
                    fos.close();
                }
            } else {
            }

            return newFile.getName();
        }


        return "/perfilDefault.png";


    }
}
