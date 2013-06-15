<%-- 
    Document   : dashboard
    Created on : 22/04/2013, 07:30:17 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>


        <%

            HttpSession sesion = request.getSession();
            String correo = (String) request.getAttribute("correo");
            String tipo = (String) request.getAttribute("tipo");

            sesion.setAttribute("c", correo);
            sesion.setAttribute("tipo", tipo);

            if (correo == null) {

                 String pageToForward = request.getContextPath();
  
    response.sendRedirect(pageToForward+"/invalidar"); 
               
            }


        %>             


    </head>
    <body>
        <header>

            <div id="contendor-interno">
                <a href="<%=request.getContextPath()%>/nuevologin.do"><div id="header-logo"> </div></a>


                <div id="header-opciones">
                    <section id="controles">
                        <a href="./invalidar.jsp"><button id="boton-salir">Salir</button></a>

                        <button id="boton-usuario"><%=sesion.getAttribute("c")%></button>
                    </section>

                </div>

                <%@include file="../includes/menu.jsp" %>

            </div>

        </header>

        <div id="contendor">


            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <h1>Sitio administrativo</h1>

                    <h2>  <%=sesion.getAttribute("tipo")%></h2>



                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./mostrar_usuario.do"><section class="modulo">
                            <img id="icono" src="assets/img/user-icon.png" width="60">
                            <h2>Usuarios</h2>
                        </section></a>
                    <a href="./mostrarperfiles.do"><section class="modulo">
                            <img id="icono" src="assets/img/perfil-icon.png" width="60">
                            <h2>Perfiles</h2>
                        </section></a>

                    <a href="./listar_evento.do"><section class="modulo">
                            <img id="icono" src="assets/img/evento-icon.png" width="60">
                            <h2>Eventos</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./listar_categorias.do"><section class="modulo">
                            <img id="icono" src="assets/img/category-icon.png" width="60">
                            <h2>Categorias</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./listar_boletines.do"><section class="modulo">
                            <img id="icono" src="assets/img/boletin-icon.png" width="60">
                            <h2>Boletínes</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./listar_anuncios.do"> <section class="modulo">
                            <img id="icono" src="assets/img/anuncio-icon.png" width="60">
                            <h2>Anuncios</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./listar_programa_radio.do"> <section class="modulo">
                            <img id="icono" src="assets/img/radio-icon.png" width="60">
                            <h2>Programas de Radio</h2>
                        </section></a>

                    <%--<a  href="./publicacion/index.jsp"> <section class="modulo">--%>
                            <a  href="./mostrar_perfil_seleccionado.do?nomPerfil=Caro"> <section class="modulo">
                            <%--<a  href="./usuarioNormal/inicio_usuario_normal.jsp"> <section class="modulo">
                            
                            <%--<a  href="./cargar_categorias_perfil.do"> <section class="modulo">--%>
                            <%--<a  href="./usuarioNormal/inicio_usuario_normal.jsp"> <section class="modulo">--%>
                            
                           <img id="icono" src="assets/img/publicacion-icon.png" width="60">
                            <h2>Publicaciones</h2>
                        </section></a>




                </div> 

            </section>


            <%@include file="/includes/footer.jsp" %>


        </div>

    </body>
</html>
