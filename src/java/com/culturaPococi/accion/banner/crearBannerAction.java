/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.banner;

import com.culturaPococi.dominio.Banner;
import com.culturaPococi.negocio.NegocioBanner;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.util.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.io.*;
import java.io.*;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Pedro
 */
public class crearBannerAction extends DispatchAction {

    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";
    NegocioBanner nb = new NegocioBanner();

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

            BannerForm fileUploadForm = (BannerForm)form ;
	    FormFile file = fileUploadForm.getFile();
 
	    //Get the servers upload directory real path name
	    String filePath = 
               getServlet().getServletContext().getRealPath("/") +"assets/img/banners";
         
	    //create the upload folder if not exists
	    File folder = new File(filePath);
	    if(!folder.exists()){
	    	folder.mkdir();
	    }
 
	    String fileName = file.getFileName();
 
	    if(!("").equals(fileName)){  
 
	        
	        File newFile = new File(filePath, fileName);
                
                
                 String extension = file.getContentType();
            String ext[] = extension.split("/");
            extension = ext[1];
            if (extension.equalsIgnoreCase("png") || (extension.equalsIgnoreCase("jpg"))
                    || (extension.equalsIgnoreCase("jpeg"))) {

	        if(!newFile.exists()){
	          FileOutputStream fos = new FileOutputStream(newFile);
	          fos.write(file.getFileData());
	          fos.flush();
	          fos.close();
	        }  
            }   else {
                
                return mapping.findForward(DENEGADO);
            
            }
             nb.crearBanner(new Banner(0, ""+newFile.getName(),""+newFile.getAbsoluteFile(), fileUploadForm.getDescripcion()));
//	        request.setAttribute("uploadedFilePath",newFile.getAbsoluteFile());
//	        request.setAttribute("uploadedFileName",newFile.getName());
	    }
		

       
        return mapping.findForward(EXITOSO);
    }

 
}
