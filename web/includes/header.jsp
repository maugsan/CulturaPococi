
<%String e = (String) request.getSession().getAttribute("c");
    if (e == null) {%>

<script type="text/javascript">
    function sugerencias() {

        NuevaVentana = window.open('', '', 'width=1500,height=700');
        NuevaVentana.location.assign("");
    }
</script>



<header>

    <div id="contendor-interno">

        <a href="<%=request.getContextPath()%>"><div id="header-logo"><h1><b>ElFrenteCR.org</b></h1></div></a>


        <div id="header-opciones">


            <a href="<%=request.getContextPath()%>/usuarioNormal/crear_usuarionormal.jsp"><button id="boton-entrar">Únete</button></a>


            <a href="<%=request.getContextPath()%>/login/nuevo_login.jsp"><button id="boton-entrar">ENTRAR</button></a>
        </div>


        <%@include file="../includes/menu.jsp" %>

    </div>

</header>


<%} else {%>



<header>

    <div id="contendor-interno">
        <a href="<%=request.getContextPath()%>/nuevologin.do"><div id="header-logo"><h1>El Frente.org</h1></div></a>


        <div id="header-opciones">
            <section id="controles">
                <a href="<%=request.getContextPath()%>/invalidar.jsp"><button id="boton-salir">Salir</button></a>

                <%



                    if (request.getSession().getAttribute("c") == null) {

                        request.getSession().invalidate();
                    }

                %>     



                <button id="boton-usuario"><%=request.getSession().getAttribute("c")%></button>
            </section>


        </div>
        <%@include file="../includes/menu.jsp" %>
    </div>
</header>


<%  }%>



