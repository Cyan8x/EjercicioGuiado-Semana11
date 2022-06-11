<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/segmentoEstilos.jspf"%>
        <title>Bienvenidos</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/segmentoSuperior.jspf"%>
        <div class="ubicacion">
            <form method="post" action="urlXMLServletVerificaSesion" class="form-signin">
                <h3 class="form-signin-heading">Ingrese sus datos</h3>
                <input type="text" name="txtUsuario" class="form-control" placeholder="Usuario" required autofocus>
                <input type="text" name="txtPassword" class="form-control" placeholder="Password" required>
                <label class="checkbox">
                    <input type="checkbox" name="recordarme" id="recordarme" name="recordarme">Recordarme
                </label>
                <button class="btn btn-small btn-primary btn-block" type="submit">Ingresar</button>
            </form>
        </div>
        <%@include file="WEB-INF/jspf/segmentoInferior.jspf"%>
    </body>
</html>
