<%@page contentType="text/html" session="true" pageEncoding="UTF-8"%>
<%@include file="verificaSesion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/segmentoEstilos.jspf" %>
        <title>Bienvenidos</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/segmentoSuperior2.jspf" %>
        <P ALIGN="right">Bienvenido, <%=varNombresMostrar%>
        <a href="sesionCerrar.jsp" >Cerrar Session</a></P>
        
        <center><h4>MENU PRINCIPAL</h4></center>
        MENTENIMIENTO DE DATOS<p>
            <a href="mantenimientoUsuario.jsp">Usuario</a><p>
            <a href="" >Area</a><p>
            <a href="" >Puesto</a><p>
            <a href="" >Epp</a><p>
            <a href="" >Asignacion Epp por Puesto</a><p><BR>
            REGISTRO DE ENTREGA<p>
            <a href="" >RegistroEntregaEpp</a><p><BR>
            REPORTES<p>
            <a href="" >Usuario</a><p>
            <a href="" >Area</a>
<%@include file="WEB-INF/jspf/segmentoInferior.jspf" %>
    </body>
</html>
