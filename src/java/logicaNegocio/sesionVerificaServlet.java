package logicaNegocio;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class sesionVerificaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest objetoPeticion1, HttpServletResponse objetoRespuesta1)
            throws ServletException, IOException {
        objetoRespuesta1.setContentType("text/html;charset=UTF-8");
        PrintWriter out = objetoRespuesta1.getWriter();
        try{
            String varUsuario = objetoPeticion1.getParameter("txtUsuario");
            String varPassword = objetoPeticion1.getParameter("txtPassword");
            String[] datos = sesionClase.getFila("select * from mibase1.tbusuario2 where usuario='"+varUsuario+"' and password='"+varPassword+"'");
            if (datos == null) {
                out.println("<html>");
                out.println("Error, el usuario");
                out.println("<b>"+varUsuario+"</b>");
                out.println(", no cumple con los datos solicitados, Para reingresar de clic <a href='index.jsp'>Aqui</a>");
                out.println("</html>");
            }else{
                String varCodigo = datos[0];
                String varNombres = datos[3];
                String varApellidos = datos[4];
                HttpSession session = objetoPeticion1.getSession(true);
                session.setAttribute("varCodigoSesion", varCodigo);
                session.setAttribute("varNombresSesion", varNombres);
                session.setAttribute("varApellidosSesion", varApellidos);
                objetoRespuesta1.sendRedirect("menuPrincipal.jsp");
            }
        }finally{
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
