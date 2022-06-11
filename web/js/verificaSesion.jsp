<%-- 
    Document   : verificaSesion
    Created on : 11 jun. 2022, 12:30:09
    Author     : Jeanpierre-Fernandez
--%>

<%@page session="true" %>
<!DOCTYPE html>
<%
    String varNombresMostrar="";
HttpSession varSesion2=request.getSession();
if (varSesion2.getAttribute("varNombresSesion")==null) {
       %> 
       <jsp:forward page="index.jsp">
           <jsp:param name="error" value="Ingrese sus datos"/>
               
       </jsp:forward>
       <%
}else {
varNombresMostrar=""+session.getAttribute("varNombresSesion");
}

%>
