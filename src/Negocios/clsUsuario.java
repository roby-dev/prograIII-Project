package Negocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class clsUsuario {
    //atributos
    public int id;
    public String nombre;
    public String apellido;
    public String username;
    public String email;
    public String clave;
    public String imagen;
    public int estado;
    public int tipo;
    public Date fechaCreacion;
    //gettersysetters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    //contructor
    public clsUsuario() {
    }
    //metodos
    public ArrayList ListarUsuarios(){
        ArrayList<clsUsuario> usuarios = new ArrayList<>();
        clsConexion cn = new clsConexion();
        Statement st;
        ResultSet rs;
        
        try{            
            st=cn.conexion().createStatement();
            rs=st.executeQuery("SELECT * from user;");
            while(rs.next()){        
                clsUsuario usuario = new clsUsuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("name"));
                usuario.setApellido(rs.getString("lastname"));
                usuario.setUsername(rs.getString("username"));
                usuario.setEmail(rs.getString("email"));                
                usuario.setImagen(rs.getString("image"));           
                usuario.setFechaCreacion(rs.getDate("created_at"));
                usuario.setTipo(rs.getInt("kind"));                          
                usuario.setEstado(rs.getInt("status"));                          
                usuarios.add(usuario);
            }
            cn.conexion().close();
            return usuarios;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());            
            return usuarios;
        }                
    }
    public ArrayList ListarUsuario(){
        ArrayList<clsUsuario> usuario = new ArrayList<>();
        //BASE DE DATOS
        
        return usuario;
    }
    public boolean AgregarUsuario(clsUsuario obj){
        boolean envio = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call agregarUsuario(?,?,?,?,?,?)}");
            insert.setString(1, obj.getNombre());
            insert.setString(2, obj.getApellido());
            insert.setString(3, obj.getUsername());
            insert.setString(4, obj.getEmail());
            insert.setString(5, obj.getClave());
            insert.setInt(6, obj.getTipo());
            rs = insert.executeQuery();
            envio=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            envio=false;
        }
        return envio;
    }
    public boolean ModificarUsuario(clsUsuario obj){
        boolean modificacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call modificarUsuario(?,?,?,?,?,?,?,?)}");
            insert.setInt(1, obj.getId());
            insert.setString(2, obj.getNombre());
            insert.setString(3, obj.getApellido());
            insert.setString(4, obj.getUsername());
            insert.setString(5, obj.getEmail());
            insert.setString(6, obj.getClave());
            insert.setInt(7, obj.getEstado());
            insert.setInt(8, obj.getTipo());
            rs = insert.executeQuery();
            modificacion=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            modificacion=false;
        }
        return modificacion;
    }
    public boolean EliminarUsuario(clsUsuario obj){
        boolean eliminacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call eliminarUsuario(?)}");
            insert.setInt(1, obj.getId());
            rs = insert.executeQuery();
            eliminacion=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            eliminacion=false;
        }
        return eliminacion;
    }
}