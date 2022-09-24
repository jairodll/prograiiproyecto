package clases;
import java.sql.*;

public class conexion {
    //Conexión Local
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Computadora1");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexión local " + e);
        }
        return (null);
    }
}
