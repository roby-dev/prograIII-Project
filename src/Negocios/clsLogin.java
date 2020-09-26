    package Negocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class clsLogin {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    private String id;
    private String name;
    private String lastname;
    private String username;
    private String email;
    private String image;
    private String status;
    private String kind;
    private String created_at;

    public ArrayList logear(String user, String pass) throws SQLException {
        ArrayList <clsLogin> usuario = new ArrayList();
        clsConexion cn = new clsConexion();
        Connection cc = cn.conexion();
        Statement st;
        ResultSet rs;    
        boolean existe = false;
        try {
            CallableStatement insert = cc.prepareCall("{call logearUsuario(?,?)}");
            insert.setString(1, user);
            insert.setString(2, pass);
            rs = insert.executeQuery();
            while (rs.next()) {
                this.id= rs.getString("id");
                this.name= rs.getString("name");
                this.lastname= rs.getString("lastname");
                this.username= rs.getString("username");
                this.email = rs.getString("email");
                this.image = rs.getString("image");
                this.status= rs.getString("status");
                this.kind = rs.getString("kind");
                this.created_at = rs.getString("created_at");
                if (getUsername().equals("")){
                    existe = true;
                    break;
                }
                usuario.add(this);
            }
            return usuario;
        } catch (Exception e) {
           return usuario;
        }
    }
}