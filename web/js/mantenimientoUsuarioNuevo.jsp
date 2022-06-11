<%@page contentType="text/html" session="true" pageEncoding="UTF-8"%>
<%@include file="verificarSesion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/segmentoEstilos.jspf"%> %>
        <title>Mantenimiento de datos del usuario</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/segmentoSuperior2.jspf" %>
        <P ALIGN="right">Bienvenido, <%=varNombresMostrar%>
            <a href="sesionCerrar.jsp" >Cerrar Session</a></P>
        <div class="ubicacion">
            <form method="post" action="mantenimientoUsuarioServlet" class="form-signin">
                Ingrese datos del nuevo Usuario
                <input type="text" name="txtCodigo" class="input-small" placeholder="Codigo" required autofocus/><p>
                <input type="text" name="txtUsuario" class="input-small" placeholder="Usuario" required/><p>
                <input type="text" name="txtPassword" class="input-small" placeholder="Password" required/><p>
                <input type="text" name="txtNombres" class="input-small" placeholder="Nombres" required/><p>
                <input type="text" name="txtApellidos" class="input-small" placeholder="Apellidos" required/><p>
                <input type="submit" class="btn btn-small btn-success " value="Guardar" /><p>                    
                    <a href="mantenimientoUsuario.jsp" class="btn btn-small btn-danger ">Cancelar</a>  
            </form>

        </div>
        <%@include file="WEB-INF/jspf/segmentoInferior.jspf"%>
    </body>
</html>
