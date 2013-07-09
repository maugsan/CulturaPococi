<footer> 

    <div id="contendor-interno">
    
        <div id="busqueda-contenedor">
        <form  method="post" id="busqueda" action="<%=request.getContextPath()%>/buscar.do">

            <input name="q" id="tags">
            <select name="tipo">
        <form  method="post" id="busqueda" action="<%=request.getContextPath()%>/buscar.do">
                
                <option value="1">Perfiles</option>
                 <option value="2">Articulos</option>
                  <option value="3">Eventos</option>
            </select>
            <input type="submit" value="Buscar">


        </form>

 </div> 


        <div id="footer-izquierdo">

            <ul>
                <li><a href="#">REFORESTACIÓN</a></li>
                <li><a href="#">EDUCACION AMBIENTAL</a></li>
                <li><a href="#">LIMPIEZA DE RÍOS Y PLAYAS</a></li>
                <li><a href="#">VIDA SILVESTRE</a></li>

            </ul>

        </div> 

        <div id="footer-centro">

            <ul>
                <li><a href="#">DEPORTES</a></li>
                <li><a href="#">MONTAÑISMO</a></li>
                <li><a href="#">CAMINATAS</a></li>
                <li><a href="#">MOTORES</a></li>
                <li><a href="#">MONTAIN BIKE</a></li>

            </ul>

        </div> 

        <div id="footer-derecho">
            <ul>
                <li><a href="#">LITERATURA</a></li>
                <li><a href="#">PLÁSTICAS</a></li>
                <li><a href="#">MÚSICA</a></li>
                <li><a href="#">DANZA</a></li>
                <li><a href="#">TEATRO</a></li>
                <li><a href="#">ARTE URBANO</a></li>
            </ul>

        </div> 

        <div id="footer-inferior">

            <p>El frente.org</p>
            <p  id="footer-terms">Términos de uso</p>

        </div> 


    </div> 


</footer>