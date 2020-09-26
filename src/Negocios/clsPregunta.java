package Negocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class clsPregunta {
    //atributos
    public int id;
    public String descripcion;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    public String respuesta;
    
    //gettersysetters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //contructor
    public clsPregunta() {
    }
    //metodos
    public ArrayList ListarPreguntas(){
        ArrayList<clsPregunta> preguntas = new ArrayList<>();

        clsConexion cn = new clsConexion();
        Statement st;
        ResultSet rs;

        try {
            st = cn.conexion().createStatement();
            rs = st.executeQuery("SELECT * from question");
            while (rs.next()) {
                clsPregunta pregunta = new clsPregunta();
                pregunta.setId(rs.getInt("id_question"));                
                pregunta.setDescripcion(rs.getString("description"));                
                preguntas.add(pregunta);
            }
            cn.conexion().close();
            return preguntas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return preguntas;
        }
    }
    public ArrayList ListarPregunta(int id){
        ArrayList<clsPregunta> pregunta = new ArrayList<>();
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        ResultSet rs;        
        try {
            CallableStatement insert = cc.prepareCall("{call listarPregunta(?)}");
            insert.setInt(1, id);
            rs = insert.executeQuery();
            while (rs.next()) {
                clsPregunta cliente = new clsPregunta();                
                cliente.setDescripcion(rs.getString("description"));
                cliente.setRespuesta(rs.getString("answer"));                
                pregunta.add(cliente);
            }
            cn.conexion().close();
            return pregunta;
        } catch (SQLException e) {
           return pregunta;
        }
    }
    public boolean AgregarPregunta(clsPregunta obj){
        boolean envio = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call agregarPregunta(?)}");
            insert.setString(1, obj.getDescripcion());
            rs = insert.executeQuery();
            envio=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            envio=false;
        }
        return envio;
    }
    public boolean ModificarPregunta(clsPregunta obj){
        boolean modificacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call modificarPregunta(?,?)}");
            insert.setInt(1, obj.getId());
            insert.setString(2, obj.getDescripcion());
            rs = insert.executeQuery();
            modificacion=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            modificacion=false;
        }
        return modificacion;
    }
    public boolean EliminarPregunta(clsPregunta obj){
        boolean eliminacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call eliminarPregunta(?)}");
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
