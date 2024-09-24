package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Clase principal de la aplicacion
 * 24/09/2024
 * @author irodhan
 */
public class Main {

	/*
	 * Método principal de la aplicacion
	 * 24/09/2024
	 * @author irodhan
	 */
	
	//Variables
	public static String url="jdbc:postgresql://localhost:5432/prueba_conexion";
	public static String user="postgres";
	public static String password="_Ivanrodriiguez04";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conexion();
	}
	 public static Connection conexion() {
	        Connection conexion = null;
	        try {
	            // Registrar el driver JDBC de PostgreSQL
	            Class.forName("org.postgresql.Driver");
	            
	            // Establecer la conexión usando DriverManager
	            conexion = DriverManager.getConnection(url, user, password);
	            
	            System.out.println("Conexión establecida con éxito.");
	            
	        } catch (SQLException e) {
	            System.out.println("Error de conexión: " + e.getMessage());
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            System.out.println("Error al cargar el driver: " + e.getMessage());
	            e.printStackTrace();
	        }
	        
	        return conexion; // Retorna la conexión establecida
	    }

}