<%@page import="javax.swing.JOptionPane"%>
<header>

    <div id="contendor-interno">
        <a href="../"><div id="header-logo"></div></a>


        <div id="header-opciones">
            <section id="controles">
                <a href="./invalidar.jsp"><button id="boton-salir">Salir</button></a>

                <%


                    HttpSession sesion = request.getSession();
                    if (sesion.getAttribute("c") == null) {

                       
                        session.invalidate();
                    }

                %>         

                <button id="boton-usuario"><%=sesion.getAttribute("c")%></button>
            </section>


        </div>
    </div>
</header>
