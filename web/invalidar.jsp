<%-- 
    Document   : invalidar
    Created on : 29-may-2013, 7:18:02
    Author     : MAU
--%>

<%
    HttpSession sesion=request.getSession();
    sesion.setAttribute("c",null);
    sesion.invalidate();
    response.sendRedirect("./login/nuevo_login.jsp"); 

%>