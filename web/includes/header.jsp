
<%String e = (String) request.getSession().getAttribute("c");
if (e == null) {%>


<header>

    <div id="contendor-interno">

        <a href="<%=request.getContextPath()%>"><div id="header-logo"><h1>El Frente CR</h1></div></a>


        <div id="header-opciones">
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



