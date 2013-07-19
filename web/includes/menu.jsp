
<%String e = (String) request.getSession().getAttribute("c");
    if (e == null) {%>

<!--
<nav>
    <ul>
        <li ><a  href="#" id="radio">RADIO</a>

            <ul>

                <li><a href="<%=request.getContextPath()%>/listar_programas_radio.do">PROGRAMAS</a></li>


            </ul>
        </li>

        <li id="cultura"><a href="<%=request.getContextPath()%>/cultura.jsp">CULTURA</a>

            <ul>


                <li><a  href="<%=request.getContextPath()%>/ver_boletines.do">BOLETÍN</a>

                </li>

                <li><a href="<%=request.getContextPath()%>/ecologia.jsp">ECOLOGÍA</a>


                    <ul>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=reforestacion">REFORESTACIÓN</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=educacionambiental">EDUCACION AMBIENTAL</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=limpiezaderiosyplaya">LIMPIEZA DE RÍOS Y PLAYAS</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=vidasilvestre">VIDA SILVESTRE</a></li>

                    </ul>

                </li>
                <li><a href="<%=request.getContextPath()%>/publicidad.jsp">PUBLICIDAD</a></li>
                <li><a href="<%=request.getContextPath()%>/bien_social.jsp">BIEN SOCIAL</a></li>
                <li><a href="<%=request.getContextPath()%>/recreacion.jsp">RECREACIÓN</a>

                    <ul>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=deportes">DEPORTES</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=montanismo">MONTAÑISMO</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=caminatas">CAMINATAS</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=motores">MOTORES</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=montainbike">MONTAIN BIKE</a></li>

                    </ul>

                </li>


            </ul>
        </li>





        <li><a href="<%=request.getContextPath()%>/arte.jsp">ARTE</a>

            <ul>
                <li><a href="<%=request.getContextPath()%>/artistas.jsp">ARTISTAS</a>

                    <ul>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=literatura">LITERATURA</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=plasticas">PLÁSTICAS</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=musica">MÚSICA</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=danza">DANZA</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=teatro">TEATRO</a></li>
                        <li><a href="<%=request.getContextPath()%>/ver_perfiles.do?c=arteurbano">ARTE URBANO</a></li>

                    </ul>
                </li>



             <li><a href="<%=request.getContextPath()%>/ver_nuestro_arte.do">NUESTRO ARTE</a></li> 


            </ul>

        </li>

        <li><a href="<%=request.getContextPath()%>/ver_eventos.do">AGENDA</a></li>

    </ul>

</nav> 
        
        

<a class="toggleMenu" href="#">MENU</a>
<ul class="nav">
    

         <li class="test">
            
               <a href="<%=request.getContextPath()%>">
                 <b>ElFrenteCR.org</b>
                  
               </a>
            

         </li>
    
    
    
	<li  >
		<a  href="#" id="radio">RADIO</a>
		<ul>
			<li>
				<a href="<%=request.getContextPath()%>/listar_programas_radio.do">Programacion</a>
				<ul>
					<li><a href="#">Sandals</a></li>
					<li><a href="#">Sneakers</a></li>
					<li><a href="#">Wedges</a></li>
					<li><a href="#">Heels</a></li>
					<li><a href="#">Loafers</a></li>
					<li><a href="#">Flats</a></li>
				</ul>
			</li>
			<li>
				<a href="#">Mens</a>
				<ul>
					<li><a href="#">Loafers</a></li>
					<li><a href="#">Sneakers</a></li>
					<li><a href="#">Formal</a></li>
				</ul>
			</li>
		</ul>
	</li>
        
        
      
	<li>
		<a href="<%=request.getContextPath()%>/arte.jsp">ARTE</a>
		<ul>
			<li>
				<a href="#">Mens</a>
				<ul>
					<li><a href="#">T-Shirts</a></li>
					<li><a href="#">Dress Shirts</a></li>
					<li><a href="#">Tank Tops</a></li>
				</ul>
			</li>
			<li>
				<a href="#">Womens</a>
				<ul>
					<li><a href="#">T-Shirts</a></li>
					<li><a href="#">Blouses</a></li>
					<li><a href="#">Dress Shirts</a></li>
					<li><a href="#">Tunics</a></li>
					<li><a href="#">Camisoles</a></li>
				</ul>
			</li>
		</ul>
	</li>
	<li>
		<a href="<%=request.getContextPath()%>/cultura.jsp">CULTURA</a>
		<ul>
			<li>
				<a href="#">Mens</a>
				<ul>
					<li><a href="#">Trousers</a></li>
					<li><a href="#">Slacks</a></li>
					<li><a href="#">Jeans</a></li>
				</ul>
			</li>
			<li>
				<a href="#">Womens</a>
				<ul>
					<li><a href="#">Trousers</a></li>
					<li><a href="#">Slacks</a></li>
					<li><a href="#">Jeans</a></li>
					<li><a href="#">Leggings</a></li>
				</ul>
			</li>
		</ul>
	</li>
	
	<li>
		<a href="<%=request.getContextPath()%>/ver_eventos.do">AGENDA</a>
		<ul>
			<li>
				<a href="#">Casual</a>
			</li>
			<li>
				<a href="#">Formal</a>
				<ul>
					<li><a href="#">Wedding</a></li>
					<li><a href="#">Party</a></li>
				</ul>
			</li>
			
		</ul>
	</li>
        <li>
            
 <a href="<%=request.getContextPath()%>/usuarioNormal/crear_usuarionormal.jsp">ÚNETE</a>
        </li>
	   <li>
            
 <a href="<%=request.getContextPath()%>/login/nuevo_login.jsp">ENTRAR</a>
        </li>
        
       
</ul> -->
        

         
<a  href="<%=request.getContextPath()%>"><div id="header-logo"></div></a>   
<nav class="clearfix">
		<ul class="clearfix">
                   
                     <li><a  href="<%=request.getContextPath()%>"><b>ELFRENTECR</b>.ORG</a></li>
	                <li><a  href="#" id="radio">RADIO</a></li>
			<li><a href="<%=request.getContextPath()%>/ver_arte.do">ARTE</a></li>
			<li><a href="<%=request.getContextPath()%>/ver_cultura.do">CULTURA</a></li>
			<li><a href="<%=request.getContextPath()%>/ver_eventos.do">AGENDA</a></li>
                        <li><a id="boton" href="<%=request.getContextPath()%>/usuarioNormal/crear_usuarionormal.jsp">ÚNETE</a></li>
                        <li ><a id="boton-entrar" href="<%=request.getContextPath()%>/login/nuevo_login.jsp">ENTRAR</a></li>
		</ul>
		
</nav>
<a  id="pull"></a>


<%} else {%>


         
<a  href="<%=request.getContextPath()%>"><div id="header-logo"></div></a>   
<nav class="clearfix">
		<ul class="clearfix">
                   
                     <li><a  href="<%=request.getContextPath()%>/nuevologin.do"><b>ELFRENTECR</b>.ORG</a></li>
	                <li><a  href="#" id="radio">RADIO</a></li>
			<li><a href="<%=request.getContextPath()%>/ver_arte.do">ARTE</a></li>
			<li><a href="<%=request.getContextPath()%>/ver_cultura.do">CULTURA</a></li>
			<li><a href="<%=request.getContextPath()%>/ver_eventos.do">AGENDA</a></li>
                        <li><a href="<%=request.getContextPath()%>/nuevologin.do">PANEL</a></li>
                        <li >    <a id="boton-entrar" href="<%=request.getContextPath()%>/invalidar.jsp">SALIR</a></li>
		</ul>
		
</nav>

<a  id="pull"></a>


<%  }%>
