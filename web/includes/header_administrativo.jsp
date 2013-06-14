<%@page import="javax.swing.JOptionPane"%>
<header>

    <div id="contendor-interno">
           <a href="<%=request.getContextPath()%>/nuevologin.do"><div id="header-logo"><h1>El Frente.org</h1></div></a>
          

        <div id="header-opciones">
            <section id="controles">
                <a href="<%=request.getContextPath()%>/invalidar.jsp"><button id="boton-salir">Salir</button></a>

                <%


                    HttpSession sesion = request.getSession();
                    if (sesion.getAttribute("c") == null) {

                       
                        session.invalidate();
                    }

                %>         

                <button id="boton-usuario"><%=sesion.getAttribute("c")%></button>
            </section>


        </div>
            <%@include file="../includes/menu.jsp" %>
    </div>
</header>
