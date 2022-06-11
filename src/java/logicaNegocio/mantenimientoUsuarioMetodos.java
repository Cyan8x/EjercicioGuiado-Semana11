/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

import java.sql.*;
import accesoDatos.miClaseConexion;

/**
 *
 * @author Jeanpierre-Fernandez
 */
public class mantenimientoUsuarioMetodos {

    public static boolean agregarUsuario(mantenimientoUsuarioClase usuario) {
        boolean agregado = false;
        try {
            miClaseConexion c = new miClaseConexion();
            Connection con = c.getConnection();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                st.executeUpdate("INSERT INTO tbusuario2(`codigo`, `usuario`,`password`,`nombres`,`apellidos`) "
                        + "VALUES ('"+usuario.getVarCodigo()+"','"+usuario.getVarUsuario()+"','"+usuario.getVarPassword()+"'  "
                        + ",'" + usuario.getVarNombres()+"','"+usuario.getVarApellidos()+ "')");
                
               
                
            
                agregado = true;
                st.close();
            }
        } catch (SQLException e) {
            agregado = false;
            e.printStackTrace();
        }
        return agregado;
    }

    public static mantenimientoUsuarioClase consultarUsuario(String Usuario) {
        mantenimientoUsuarioClase busuario = null;
        try {
            miClaseConexion c = new miClaseConexion();
            Connection con = c.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from tbusuario2 where usuario'" + usuario + "'");
            while (rs.next()) {
                busuario = new mantenimientoUsuarioClase(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
            rs.close();
            st.close();

        } catch (SQLException se) {

            se.printStackTrace();
        }
        return busuario;
    }
}
