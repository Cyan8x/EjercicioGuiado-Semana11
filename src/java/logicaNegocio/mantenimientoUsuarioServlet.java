package logicaNegocio;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;
import logicaNegocio.mantenimientoUsuarioMetodos;
import logicaNegocio.mantenimientoUsuarioClase;

public class mantenimientoUsuarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String varCodigo = request.getParameter("txtCodigo");
            String varUsuario = request.getParameter("txtUsuario");
            String varPassword = request.getParameter("txtPassword");
            String varNombres = request.getParameter("txtNombres");
            String varApellidos = request.getParameter("txtApellidos");
            if (!varCodigo.equalsIgnoreCase("") && !varUsuario.equalsIgnoreCase("") && !varPassword.equalsIgnoreCase("")
                    && !varNombres.equalsIgnoreCase("") && !varApellidos.equalsIgnoreCase("")) {
                mantenimientoUsuarioClase busuario = new mantenimientoUsuarioClase(varCodigo, varUsuario, varPassword, varNombres, varApellidos);
                boolean sw = mantenimientoUsuarioMetodos.agregarUsuario(busuario);
                if (sw) {
                    request.getRequestDispatcher("mantenimientoUsuario.jsp").forward(request, response);
                } else {
                    // Print Writerout=response.getWriter(); 
                    out.println("Error.");
                }
            }
        } finally {
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
