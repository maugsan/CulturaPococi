/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.evento;

import com.culturaPococi.dominio.Evento;
import com.culturaPococi.negocio.NegocioCategoria;
import com.culturaPococi.negocio.NegocioEvento;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Pedro
 */
public class GuardarEventoAction extends DispatchAction {

    private int idCategoria;
    private String lugar;
    private String nombre;
    private String nombreCategoria;
    private Time tiempo;
    private String fecha;
    private String informacion;
    private String correo;
    private boolean accionRealizada;
    private NegocioEvento nEvento = new NegocioEvento();
    private NegocioCategoria nCategoria = new NegocioCategoria();
    private static final String EXITOSO = "correcto";
    private static final String DENEGADO = "incorrecto";

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        EventoForm eform = (EventoForm) form;

        idCategoria = Integer.parseInt(request.getParameter("idCategoria"));
        lugar = eform.getLugar();
        nombre = eform.getNombre();
        fecha = (String) request.getParameter("fecha");
        tiempo = new Time(Integer.parseInt(request.getParameter("hora")),
                Integer.parseInt(request.getParameter("minutos")), 0);
        informacion = eform.getInformacion();
        correo = (String) request.getSession().getAttribute("c");

//        nEvento.listarEventosDB();
//        for (Categoria c : nCategoria.selectCategorias()){
//            if (idCategoria == c.getIdCategoria())
//             nombreCategoria = c.getNombreCategoria();
//        
//        }
        accionRealizada = nEvento.crearEventosDB(new Evento(0, idCategoria, nombreCategoria, lugar, nombre, tiempo,
                fecha, informacion, correo,  subirImagenEvento(mapping, eform)));

        
      
        if (!accionRealizada) {
            request.setAttribute("mensaje", "<h2 id='incorrecto'>Oops!, No es posible crear este evento!</h2>");
            return mapping.findForward(DENEGADO);
        }//fin if
        request.setAttribute("mensaje", "<h2 id='correcto'>Evento Creado Correctamente! </h2>");
         return mapping.findForward(EXITOSO);
    }

    public String subirImagenEvento(ActionMapping mapping, EventoForm fileUploadForm) throws FileNotFoundException, IOException {


        FormFile file = fileUploadForm.getFile();

        //Get the servers upload directory real path name
        String filePath =
                getServlet().getServletContext().getRealPath("/") + "/assets/img/eventos";

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


        return "/eventoDefault.png";


    }
}
