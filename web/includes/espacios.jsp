
<script type="text/javascript">
           function sugerencias() {

        NuevaVentana = window.open('', '', 'width=1350,height=700');
        NuevaVentana.location.assign("http://localhost/RecuperacionContrasenia/web/app_dev.php/elfrente/");
    }
</script>
                                    
            <section id="seccion-inferior">

                <div id="contendor-interno">

                    <a href="./directorio.jsp" ><div id="s-izquierdo">
                        <img src="./assets/img/guitarra-icon.png"/>
                        <h1>Directorio</h1>

                    </div></a>

                    <a href="<%=request.getContextPath()%>/ver_programas.do"><div  id="s-centro">
                        
                        <img src="./assets/img/radio-icon.png" />
                        <h1>Programas</h1>
                           
                  
                    </div></a>

                    <div id="s-derecho">

                        <a  onclick="sugerencias()" > 
                            <img src="./assets/img/idea-icon.png"/>
                            <h1>Ideas</h1>
                        </a>
                    </div> 

                    <p>Dedicado al bienestar y Crecimiento Cultural 
                        y Ambiental del Cant�n de Pococi y otros aleda�os para divulgar y extender proyectos de Crecimiento Humano , Expresi�n Art�stica de todo �mbito y Entretenimiento Popular , Recreaci�n , Familia y Arte.</p>
                    <br><br>

                </div>


            </section>


<section id="seccion-media">


    <div id="contendor-interno"> 

        <section id="publicidad">
            <img id="icono" src="./assets/img/anuncio-icon.png" width="60">
            <h3>Publicidad</h3>

        </section>
         <a href="<%=request.getContextPath()%>/ver_eventos.do">
        <section id="eventos">

           <img id="icono" src="./assets/img/evento-icon.png" width="60">
            <h3>Agenda</h3>

        </section>
         </a>

    </div> 


</section>