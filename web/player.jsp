<%-- 
    Document   : player
    Created on : 08-may-2013, 14:44:28
    Author     : Mac
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <title>Radio Frente Cultura</title>
       
    </head>
    <body  onload="moveTo(0,0); resizeTo(400,300);">

       
            <audio controls="controls" autoplay> 

                <source src="http://s23.myradiostream.com:3078/;stream.nsv" type="audio/mpeg" /> 

                <object type="application/x-shockwave-flash" data="player.swf?soundFile=archivo.mp3">
                    <param name="movie" value="player.swf?soundFile=archivo.mp3" />
                    <a href="archivo.mp3">Descarga el archivo de audio</a>
                </object>
            </audio>

      

    </body>
</html>
