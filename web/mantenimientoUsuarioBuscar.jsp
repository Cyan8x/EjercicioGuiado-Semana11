<%@page import="logicaNegocio.mantenimientoUsuarioClase"%>
<%@page contentType="text/html" session="true" pageEncoding="UTF-8"%>
<%@include file="verificarSesion.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/segmentoEstilos.jspf"%> %>
        <title>Busqueda de datos del usuario</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/segmentoSuperior2.jspf" %>
        <P ALIGN="right">Bienvenido, <%=varNombresMostrar%>
            <a href="sesionCerrar.jsp" >Cerrar Session</a></P>
        <div class="ubicacion">
            <%mantenimientoUsuarioClase busuario = (mantenimientoUsuarioClase)request.getAttribute("busuario");%>
            <div align="center"> 
                <table>
                    <tr>
                        <td> Codigo: </td>
                        <td>
                            <input type="text" size="20" name="nombre" value="<%= busuario.getVarCodigo() %>"> 
                        </td>
                    </tr> 
                    <tr>
                        <td>Usuario: </td>
                        <td>
                            <input type="text" size="20" name="apellido" value="<%=busuario.getVarUsuario() %>">
                        </td>
                    </tr> 
                    <tr>
                        <td>Password: </td>
                        <td>
                            <input type="text" size="20" name="edad" value="<%=busuario.getVarPassword() %>"> 
                        </td>
                    </tr> 
                    <tr>
                        <td>Nombres: </td>
                        <td>
                            <input type="text" size="20" name="correo" value="<%=busuario.getVarNombres() %>"> 
                        </td>
                    </tr>
                    <tr>
                        <td>Apellidos: </td>
                        <td>
                            <input type="text" size="20" name="usuario" value="<%=busuario.getVarApellidos() %>">
                        </td>
                    </tr> 
                </table> 
            </div>
            <br>
            <center> 
                <a href="mantenimientoUsuario.jsp" class="btn btn-small btn-danger">Regresar</a>
            </center>
        </div>
        <%@include file="WEB-INF/jspf/segmentoInferior.jspf"%> 
    </body> 
</html>
