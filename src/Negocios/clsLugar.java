package Negocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class clsLugar {

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
    public clsLugar() {
    }
    //metodos
    public ArrayList ListarLugares() {
        
        ArrayList<clsLugar> lugares = new ArrayList<>();

        clsConexion cn = new clsConexion();
        Statement st;
        ResultSet rs;

        try {
            st = cn.conexion().createStatement();
            rs = st.executeQuery("SELECT * from place order by name;");
            while (rs.next()) {
                clsLugar lugar = new clsLugar();
                lugar.setId(rs.getInt("id"));                
                lugar.setNombre(rs.getString("name"));                
                lugares.add(lugar);
            }
            cn.conexion().close();
            return lugares;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return lugares;
        }
    }

    public ArrayList ListarLugar() {
        ArrayList<clsLugar> lugar = new ArrayList<>();
        //BASE DE DATOS

        return lugar;
    }

    public boolean AgregarLugar(clsLugar obj){
        boolean envio = false;
        //BASE DE DATOS
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call agregarLugar(?)}");
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

    public boolean ModificarLugar(clsLugar obj){
        boolean modificacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call modificarLugar(?,?)}");
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

    public boolean EliminarLugar(clsLugar obj){
        boolean eliminacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call eliminarLugar(?)}");
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
