/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaNegocio;

/**
 *
 * @author Jeanpierre-Fernandez
 */
public class mantenimientoUsuarioClase {
    private String varCodigo;
    private String varUsuario;
    private String varPassword;

    public String getVarCodigo() {
        return varCodigo;
    }

    public void setVarCodigo(String varCodigo) {
        this.varCodigo = varCodigo;
    }

    public String getVarUsuario() {
        return varUsuario;
    }

    public void setVarUsuario(String varUsuario) {
        this.varUsuario = varUsuario;
    }

    public String getVarPassword() {
        return varPassword;
    }

    public void setVarPassword(String varPassword) {
        this.varPassword = varPassword;
    }

    public String getVarNombres() {
        return varNombres;
    }

    public void setVarNombres(String varNombres) {
        this.varNombres = varNombres;
    }

    public String getVarApellidos() {
        return varApellidos;
    }

    public void setVarApellidos(String varApellidos) {
        this.varApellidos = varApellidos;
    }
    private String varNombres;
    private String varApellidos;

    public mantenimientoUsuarioClase(String varCodigo, String varUsuario, String varPassword, String varNombres, String varApellidos) {
        this.varCodigo = varCodigo;
        this.varUsuario = varUsuario;
        this.varPassword = varPassword;
        this.varNombres = varNombres;
        this.varApellidos = varApellidos;
    }
    
}
