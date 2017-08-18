
package com.proyecto.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class Usuario {
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private String Usuario;
    private String password;
    private int idRol;
    private String estado;

    public Usuario() {
    }
    
    public Usuario(int idUsuario, String nombres, String apellidos, String Usuario, String password, int idRol, String estado) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.Usuario = Usuario;
        this.password = password;
        this.idRol = idRol;
        this.estado = estado;
    }
    public static Usuario load(ResultSet rs) throws SQLException{
        Usuario objUsuario = new Usuario();
         objUsuario.setIdUsuario(rs.getInt(1));
         objUsuario.setNombres(rs.getString(2));
         objUsuario.setApellidos(rs.getString(3));
         objUsuario.setUsuario(rs.getString(4));
         objUsuario.setPassword(rs.getString(5));
         objUsuario.setIdRol(rs.getInt(6));
         objUsuario.setEstado(rs.getString(7));
         return objUsuario;
         
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
        
}
