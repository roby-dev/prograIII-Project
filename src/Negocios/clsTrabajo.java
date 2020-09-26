package Negocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class clsTrabajo {
    //atributos
    public int id;
    public String nombre;
    public String descripcion;
    public String requerimientos;
    public Date fechaCreacion;
    public Date fechaLimite;
    public Object estado;
    public int idCategoria;
    public int idLugar;
    public String imagen;
    public String categoria;
    public String lugar;
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
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getRequerimientos() {
        return requerimientos;
    }
    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaLimite() {
        return fechaLimite;
    }
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    public Object getEstado() {
        return estado;
    }
    public void setEstado(Object estado) {
        this.estado = estado;
    }
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public int getIdLugar() {
        return idLugar;
    }
    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {    
        this.lugar = lugar;
    }
    //contructor
    public clsTrabajo() {
    }
    //metodos
    public ArrayList ListarTrabajos(){
        ArrayList<clsTrabajo> trabajos = new ArrayList<>();
        clsConexion cn = new clsConexion();
        Statement st;
        ResultSet rs;
        
        try{            
            st=cn.conexion().createStatement();
            rs=st.executeQuery("SELECT job.id,job.name,job.description,job.category_id,job.place_id,job.img,job.requirements,job.limit_at,job.created_at,job.status,category.name as category ,place.name as place  FROM job INNER JOIN category on job.category_id=category.id INNER JOIN place on job.place_id=place.id;");
            while(rs.next()){        
                clsTrabajo trabajo = new clsTrabajo();
                trabajo.setId(rs.getInt("id"));
                trabajo.setNombre(rs.getString("name"));
                trabajo.setDescripcion(rs.getString("description"));
                trabajo.setRequerimientos(rs.getString("requirements"));
                trabajo.setFechaLimite(rs.getDate("limit_at"));
                trabajo.setFechaCreacion(rs.getDate("created_at"));
                trabajo.setEstado(rs.getObject("status"));
                trabajo.setIdCategoria(rs.getInt("category_id"));
                trabajo.setIdLugar(rs.getInt("place_id"));
                trabajo.setCategoria(rs.getString("category"));
                trabajo.setLugar(rs.getString("place"));
                trabajo.setImagen(rs.getString("img"));                
                trabajos.add(trabajo);
            }
            cn.conexion().close();
            return trabajos;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());            
            return trabajos;
        }                
        
    }
    public ArrayList ListarTrabajo(int id){
        ArrayList<clsTrabajo> trabajo = new ArrayList<>();
        //BASE DE DATOS
        
        return trabajo;
    }
    public boolean AgregarTrabajo(clsTrabajo obj){
        boolean envio = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call agregarVacante(?,?,?,?,?,?,?,?)}");
            insert.setString(1, obj.getNombre());
            insert.setString(2, obj.getDescripcion());
            insert.setString(3, obj.getRequerimientos());
            java.util.Date fechaLimite = obj.getFechaLimite();
            java.sql.Date fechalimitesql = new java.sql.Date(fechaLimite.getTime());
            insert.setDate(4, fechalimitesql);
            insert.setObject(5, obj.getEstado());
            insert.setInt(6, obj.getIdCategoria());
            insert.setInt(7, obj.getIdLugar());
            insert.setString(8, obj.getImagen());
            rs = insert.executeQuery();
            envio=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            envio=false;
        }
        return envio;
    }
    public boolean ModificarTrabajo(clsTrabajo obj){
        boolean modificacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call modificarVacante(?,?,?,?,?,?,?,?,?)}");
            insert.setInt(1, obj.getId());
            insert.setString(2, obj.getNombre());
            insert.setString(3, obj.getDescripcion());
            insert.setString(4, obj.getRequerimientos());
            java.util.Date fechaLimite = obj.getFechaLimite();
            java.sql.Date fechalimitesql = new java.sql.Date(fechaLimite.getTime());
            insert.setDate(5, fechalimitesql);
            insert.setObject(6, obj.getEstado());
            insert.setInt(7, obj.getIdCategoria());
            insert.setInt(8, obj.getIdLugar());
            insert.setString(9, obj.getImagen());
            rs = insert.executeQuery();
            modificacion=true;
            cn.conexion().close();
        } catch (SQLException e) {
            System.out.println("Error: " +e.toString());
            modificacion=false;
        }
        return modificacion;
    }
    public boolean EliminarTrabajo(clsTrabajo obj){
        boolean eliminacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        try {
            CallableStatement insert = cc.prepareCall("{call eliminarVacante(?)}");
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