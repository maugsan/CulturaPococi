<%-- 
    Document   : nuevo_login
    Created on : 18/04/2013, 10:24:01 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
    <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
    </head>
    <body>
        
        <html:errors/>
        <html:form action="" focus="">
            
  <table border="0" width="100%">
    <tr>
        <th class="right">
            <bean:message key="prompt.username"/>
        </th>
        <td class="left">
            <html:text  property="" size="16"/>
        </td>
    </tr>
    <tr>
        <th class="right">
            <bean:message key=""/>
        </th>
        <td class="left">
            <html:password property="" size="16"/>
        </td>
    </tr>
    <tr>
        <td class="right">
            <html:submit>
                <bean:message key=""/>
            </html:submit>
        </td>
        <td class="right">
            <html:reset>
                <bean:message key=""/>
            </html:reset>
        </td>
    </tr>
</table>

</html:form>
          
    </body>
</html>
