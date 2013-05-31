<%-- 
    Document   : invalidar
    Created on : 29-may-2013, 7:18:02
    Author     : MAU
--%>

<%@page import="org.apache.commons.logging.LogFactory"%>
<%
    HttpSession sesion=request.getSession();

         sesion.removeAttribute("c");
        sesion.invalidate();                               
        String pageToForward = request.getContextPath();
  
    response.sendRedirect(pageToForward);   

%>

<script>
    alert("se borraron");
    $.cookie("c", null);
</script>