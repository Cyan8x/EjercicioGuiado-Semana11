package logicaNegocio;

import accesoDatos.miClaseConexion;
import java.sql.*;
import java.util.Vector;

public class sesionClase {

    static public String ejecuta(String parametroSql) {
        String varMensaje = null;
        try {
            miClaseConexion miObjetoClaseConexionCN = new miClaseConexion();
            Connection miObjetoConexionCN = miObjetoClaseConexionCN.getConnection();
            if (miObjetoConexionCN == null) {
                varMensaje = "No existe conexion";
            } else {
                Statement declararObjetoBdsT = miObjetoConexionCN.createStatement();
                declararObjetoBdsT.execute(parametroSql);
                declararObjetoBdsT.close();
                miObjetoConexionCN.close();
            }
        } catch (SQLException e) {
            varMensaje = e.getMessage();
        } catch (Exception e) {
            varMensaje = e.getMessage();
        }
        return varMensaje;
    }

    static public Vector consulta(String parametroSql) {
        Vector registrosVector = new Vector();
        try {
            miClaseConexion miObjetoClaseConexionCN = new miClaseConexion();
            Connection miObjetoConexionCN = miObjetoClaseConexionCN.getConnection();
            if (miObjetoConexionCN == null) {
                registrosVector = null;
            } else {
                Statement declararObjetoBdsT = miObjetoConexionCN.createStatement();
                ResultSet datosObtenicosRs = declararObjetoBdsT.executeQuery(parametroSql);
                ResultSetMetaData identificaDatosObtenidos = datosObtenicosRs.getMetaData();
                int numeroColumnas = identificaDatosObtenidos.getColumnCount();
                String[] tituloColumnas = new String[numeroColumnas];
                for (int i = 0; i < numeroColumnas; i++) {
                    tituloColumnas[i] = identificaDatosObtenidos.getColumnName(i + 1);
                }
                registrosVector.add(tituloColumnas);
                while (datosObtenicosRs.next()) {
                    String[] registroIdentificado = new String[numeroColumnas];
                    for (int i = 0; i < numeroColumnas; i++) {
                        registroIdentificado[i] = datosObtenicosRs.getString(i + 1);
                    }
                    registrosVector.add(registroIdentificado);
                }
                datosObtenicosRs.close();
                declararObjetoBdsT.close();
                miObjetoConexionCN.close();
            }
        } catch (SQLException e) {
            registrosVector = null;
        } catch (Exception e) {
            registrosVector = null;
        }
        return registrosVector;
    }

    static public String[] getFila(String parametroSql) {
        Vector registrosVectorConsultados = consulta(parametroSql);
        String[] fila = null;
        if (registrosVectorConsultados != null) {
            if (registrosVectorConsultados.size() > 1) {
                fila = (String[]) registrosVectorConsultados.get(1);
            }
        }
        return fila;
    }

    static public String getCampo(String parametroSql) {
        String[] fila = getFila(parametroSql);
        String campo = null;
        if (fila != null) {
            campo = fila[0];
        }
        return campo;
    }
}
