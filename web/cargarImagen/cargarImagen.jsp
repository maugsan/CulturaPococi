<%-- 
    Document   : cargarImagen
    Created on : 19/06/2013, 07:54:34 PM
    Author     : Personal
--%>

<%@page import="com.culturaPococi.negocio.NegocioBanner"%>
<%@page import="com.culturaPococi.negocio.NegocioArticulo"%>
<%@page import="com.culturaPococi.negocio.NegocioAnuncio"%>
<%@page import="com.culturaPococi.negocio.NegocioEvento"%>
<%@page import="javax.swing.JOptionPane"%>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="org.apache.commons.io.*" %>
<%@ page import="java.io.*" %>




<%
    String nombre = "";
    String accion = "";
    int cont = 0;
    String nombreArchivo = "";

    String destination = "/assets/img";
    String destinationRealPath = application.getRealPath(destination);
    JOptionPane.showMessageDialog(null, "HOLA");
    DiskFileItemFactory factory = new DiskFileItemFactory();
    factory.setSizeThreshold(1024);
    //fileItemTemp.getName() nombre

    factory.setRepository(new File(destinationRealPath));

    ServletFileUpload uploader = new ServletFileUpload(factory);
    NegocioEvento nEvento = new NegocioEvento();
    NegocioAnuncio nAnuncio = new NegocioAnuncio();
    NegocioArticulo nArticulo = new NegocioArticulo();
    NegocioBanner nBanner = new NegocioBanner();


    try {

        List items = uploader.parseRequest(request);
        String optionalFileName = "";
        FileItem fileItem = null;
        Iterator iterator = items.iterator();

        while (iterator.hasNext()) {
            FileItem fileItemTemp = (FileItem) iterator.next();
            if (fileItemTemp.isFormField()) {
%> 
<b>Name-value Pair Info:</b><br/> 
Field name: <%= fileItemTemp.getFieldName()%><br/> 
Field value: <%= nombre += fileItemTemp.getString() + "-"%><br/><br/> 
<%
            if (cont == 0) {
                
                accion = fileItemTemp.getString();

                cont++;
                if (accion.equalsIgnoreCase("/crear_evento.do")) {
                    nombreArchivo = "" + nEvento.selectIdEventoDB();
                } else if (accion.equalsIgnoreCase("/crear_anuncio.do")) {
                    nombreArchivo = "" + nAnuncio.selectIdAnuncioDB();
                    JOptionPane.showMessageDialog(null, "idAnuncio " + nombreArchivo);
                } else if (accion.equalsIgnoreCase("../crear_banner.do")) {
                    nombreArchivo = "banner1111";
                    out.write("<script>alert('An alert message');</script>");
                    JOptionPane.showMessageDialog(null, nombreArchivo);
                } else {
                    nombreArchivo = "" + nArticulo.selectIdArticuloDB();

                }
            }

            if (fileItemTemp.getFieldName().equals("filename")) {
                optionalFileName = fileItemTemp.getString();
            }
        } else {
            fileItem = fileItemTemp;
            fileItemTemp.getContentType();

            String extension = fileItemTemp.getContentType();
            String ext[] = extension.split("/");
            extension = ext[1];

            if (extension.equalsIgnoreCase("png") || (extension.equalsIgnoreCase("jpg"))
                    || (extension.equalsIgnoreCase("jpeg"))) {

                nombre = nombre + "/assets/img/" + nombreArchivo + ".png" + "-";
                File file = new File(destinationRealPath, nombreArchivo + ".png");
                fileItemTemp.write(file);
                JOptionPane.showMessageDialog(null, "<p>" + fileItemTemp.getContentType() +" ---  "+ file.getParentFile() + " was uploaded successfully</p>");

                //out.close(); 
            } else {
                nombre = nombre + "null-";

                JOptionPane.showMessageDialog(null, "La extensi�n no es permitida");
                out.write("<script>alert('An alert message');</script>");
            }//fin else
        }

    }


%>

<%

    } catch (FileUploadException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        out.write("<p>FileUploadException was thrown..." + e.getMessage() + "</p>");
                    }%>  


%>

<jsp:forward page= "<%=accion%>" >
    <jsp:param name="datos" value="<%=nombre%>" /> 
</jsp:forward>