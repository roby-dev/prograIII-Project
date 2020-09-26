package Negocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class clsSolicitudes {

    public int getId() {
        return id;
    }

    //atributos
    public void setId(int id) {
        this.id = id;
    }
    public int id;
    public String nombre;
    public String apellido;
    public String dni;
    public String archivo;
    public String telefono;
    public String email;
    public int idTrabajo;
    public Date fechaCreacion;
    public Object estado;

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
    public String categoria;
    public String lugar;

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    public String trabajo;

    //gettersysetters
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Object getEstado() {
        return estado;
    }

    public void setEstado(Object estado) {
        this.estado = estado;
    }

    //contructor
    public clsSolicitudes() {
    }

    
    public ArrayList buscarPalabra(String palabra){
        ArrayList<clsSolicitudes> postulantes = new ArrayList<>();

        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        //BASE DE DATOS
        try {

            CallableStatement insert = cc.prepareCall("{call buscarPalabra(?)}");
            insert.setString(1, palabra);
            rs = insert.executeQuery();
            while (rs.next()) {
                clsSolicitudes postulante = new clsSolicitudes();
                postulante.setId(rs.getInt("id"));
                postulante.setNombre(rs.getString("personName"));
                postulante.setApellido(rs.getString("lastname"));
                postulante.setDni(rs.getString("dni"));
                postulante.setArchivo(rs.getString("file"));
                postulante.setTelefono(rs.getString("phone"));
                postulante.setEmail(rs.getString("email"));
                postulante.setIdTrabajo(rs.getInt("job_id"));
                postulante.setFechaCreacion(rs.getDate("created_at"));
                postulante.setEstado(rs.getObject("status"));
                postulante.setTrabajo(rs.getString("jobName"));
                postulante.setLugar(rs.getString("placeName"));
                postulante.setCategoria(rs.getString("categoryName"));
                postulantes.add(postulante);
                // System.out.println(postulantes.get(i).getId());               
            }

            cn.conexion().close();
            return postulantes;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
            return postulantes;

        }
    }
    
    //metodos
    public ArrayList ListarPostulantes() {
        ArrayList<clsSolicitudes> postulantes = new ArrayList<>();
        clsConexion cn = new clsConexion();
        Statement st;
        ResultSet rs;
        int i = 0;
        try {
            st = cn.conexion().createStatement();
            rs = st.executeQuery("SELECT person.id,person.name as personName,person.lastname,person.dni,person.job_id,person.file,person.phone,person.email,job.name as jobName,person.created_at,person.status,place.name AS placeName,category.name AS categoryName from person INNER JOIN job on job.id=person.job_id INNER JOIN category ON job.category_id=category.id INNER JOIN place on place.id=job.place_id;");
            while (rs.next()) {

                clsSolicitudes postulante = new clsSolicitudes();
                postulante.setId(rs.getInt("id"));
                postulante.setNombre(rs.getString("personName"));
                postulante.setApellido(rs.getString("lastname"));
                postulante.setDni(rs.getString("dni"));
                postulante.setArchivo(rs.getString("file"));
                postulante.setTelefono(rs.getString("phone"));
                postulante.setEmail(rs.getString("email"));
                postulante.setIdTrabajo(rs.getInt("job_id"));
                postulante.setFechaCreacion(rs.getDate("created_at"));
                postulante.setEstado(rs.getObject("status"));
                postulante.setTrabajo(rs.getString("jobName"));
                postulante.setLugar(rs.getString("placeName"));
                postulante.setCategoria(rs.getString("categoryName"));
                postulantes.add(postulante);
                // System.out.println(postulantes.get(i).getId());
                i++;
            }
            cn.conexion().close();
            return postulantes;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return postulantes;
        }
    }

    public ArrayList ListarPostulante(int id) {

        ArrayList<clsSolicitudes> postulantes = new ArrayList<>();

        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        //BASE DE DATOS
        try {

            CallableStatement insert = cc.prepareCall("{call buscarTrabajo(?)}");
            insert.setInt(1, id);
            rs = insert.executeQuery();
            while (rs.next()) {

                clsSolicitudes postulante = new clsSolicitudes();
                postulante.setId(rs.getInt("id"));
                postulante.setNombre(rs.getString("personName"));
                postulante.setApellido(rs.getString("lastname"));
                postulante.setDni(rs.getString("dni"));
                postulante.setArchivo(rs.getString("file"));
                postulante.setTelefono(rs.getString("phone"));
                postulante.setEmail(rs.getString("email"));
                postulante.setIdTrabajo(rs.getInt("job_id"));
                postulante.setFechaCreacion(rs.getDate("created_at"));
                postulante.setEstado(rs.getObject("status"));
                postulante.setTrabajo(rs.getString("jobName"));
                postulante.setLugar(rs.getString("placeName"));
                postulante.setCategoria(rs.getString("categoryName"));
                postulantes.add(postulante);
                // System.out.println(postulantes.get(i).getId());               
            }

            cn.conexion().close();
            return postulantes;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
            return postulantes;

        }

    }

    public boolean AgregarPostulante(clsSolicitudes obj) {
        boolean envio = false;
        //BASE DE DATOS
        try {

        } catch (Exception e) {
        }
        return envio;
    }

    public boolean ModificarPostulante(clsSolicitudes obj, int opcion) {
        boolean modificacion = false;
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;
        //BASE DE DATOS
        try {
            CallableStatement insert = cc.prepareCall("{call reiniciarPostulante(?,?)}");
            insert.setInt(1, obj.getId());
            insert.setInt(2, opcion);
            System.out.println(obj.getId());
            rs = insert.executeQuery();
            modificacion = true;
            cn.conexion().close();
        } catch (Exception e) {
        }
        return modificacion;
    }

    public boolean EliminarPostulante(clsSolicitudes obj) {
        boolean eliminacion = false;
        //BASE DE DATOS
        try {

        } catch (Exception e) {
        }
        return eliminacion;
    }
}
