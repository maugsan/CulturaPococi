<%-- 
    Document   : player
    Created on : 18-jun-2013, 17:56:59
    Author     : MAU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="/includes/head.jsp" %>
        <title>Radio Frente Cultura</title>
    </head>
    <body>
        <script>
  audiojs.events.ready(function() {
    var as = audiojs.createAll();
  });
</script>
        <audio src="s23.myradiostream.com:3078/;" preload="auto" />

    </body>
</html>
