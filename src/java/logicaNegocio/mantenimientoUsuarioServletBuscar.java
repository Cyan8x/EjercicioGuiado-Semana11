
package logicaNegocio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import logicaNegocio.mantenimientoUsuarioMetodos;
import logicaNegocio.mantenimientoUsuarioClase;

public class mantenimientoUsuarioServletBuscar extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out= response.getWriter();
        try{
            String usuario=request.getParameter("txtUsuarioB");
            mantenimientoUsuarioClase busuario=mantenimientoUsuarioMetodos.consultarUsuario(usuario);
            if(busuario != null){
                request.setAttribute("busuario", busuario);
                request.getRequestDispatcher("mantenimientoUsuarioBuscar.jsp").forward(request, response);
            }else{
                out.println("Error, no se encontro el usuario");
                
            }
        }finally{out.close();
    }
    }
   }   
}