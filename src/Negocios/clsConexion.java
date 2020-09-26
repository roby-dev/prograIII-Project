
package Negocios;

import java.sql.Connection;
import java.sql.DriverManager;

public class clsConexion {
    
    Connection conectar=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/recrutador","root","");
        }
        catch (Exception e){
            System.err.println("Error: "+e);
            
        }
        return conectar;
    } 
    
}
