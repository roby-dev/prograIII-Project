package Negocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class clsCategoria {
    //atributos
    public int id;
    public String nombre;
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
    //contructor
    public clsCategoria() {
    }
    //metodos
    public ArrayList ListarCategorias(){
        ArrayList<clsCategoria> categorias = new ArrayList<>();

        clsConexion cn = new clsConexion();
        Statement st;
        ResultSet rs;

        try {
            st = cn.conexion().createStatement();
            rs = st.executeQuery("SELECT * from category");
            while (rs.next()) {
                clsCategoria categoria = new clsCategoria();
                categoria.setId(rs.getInt("id"));                
                categoria.setNombre(rs.getString("name"));                
                categorias.add(categoria);
            }
            cn.conexion().close();
            return categorias;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return categorias;
        }
    }
    public ArrayList ListarCategoria(){
        ArrayList<clsCategoria> categoria = new ArrayList<>();
        //BASE DE DATOS
        
        return categoria;
    }
    public boolean AgregarCategoria(clsCategoria obj){
        boolean envio = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call agregarCategoria(?)}");
            insert.setString(1, obj.getNombre());
            rs = insert.executeQuery();
            envio=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            envio=false;
        }
        return envio;
    }
    public boolean ModificarCategoria(clsCategoria obj){
        boolean modificacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call modificarCategoria(?,?)}");
            insert.setInt(1, obj.getId());
            insert.setString(2, obj.getNombre());
            rs = insert.executeQuery();
            modificacion=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            modificacion=false;
        }
        return modificacion;
    }
    public boolean EliminarCategoria(clsCategoria obj){
        boolean eliminacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call eliminarCategoria(?)}");
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