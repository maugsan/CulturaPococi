
<%String e = (String) request.getSession().getAttribute("c");
    if (e == null) {%>



<header>
   <div id="aviso"><b>SITIO EN CONSTRUCCIÓN, CONSULTAS A SOPORTE@ELFRENTECR.ORG</b></div>

    <div id="contendor-interno">
       

      

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



