<%-- 
    Document   : mantenimientoUsuario
    Created on : 11 jun. 2022, 12:44:48
    Author     : Jeanpierre-Fernandez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="verificaSesion.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/segmentoEstilos.jspf"%>

        <title>Mantenimiento de datos del Usuario</title>

    </head>
    <body>
        <%@include file="WEB-INF/jspf/segmentoSuperior2.jspf"%>
        <p ALIGN="right"> Bienvenido, <%=varNombresMostrar%>
            <a href="sesionCerrar.jsp">Cerrar Sesion</a></p>   
        <div class="ubicacion">
            <form class="form-signin">
                Mantenimiento de datos del Usuario
                <a href="mantenimientoUsuarioNuevo.jsp" class="btn btn-small btn-success ">Nuevo</a>
            </form><br>
            <form method="post" action="mantenimientoUsuarioServletBuscar" class="form-signin">
                Ingrese datos del usuario a buscar:
                <input type="text" name="txtUsuarioB" class="input-small" placeholder="Usuario" required autofocus/><p>
                    <input type="submit" class="btn btn-small btn-success" value="Consultar"/>
            </form><br><center>
                <a href="menuPrincipal.jsp" class="btn btn-small btn-danger ">Regresar</a>
            </center>  
        </div>
          <%@include file="WEB-INF/jspf/segmentoInferior.jspf"%>
    </body>
</html>
