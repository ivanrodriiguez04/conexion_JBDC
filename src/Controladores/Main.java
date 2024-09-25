package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import org.postgresql.ds.PGSimpleDataSource;

/*
 * Clase principal de la aplicacion
 * 24/09/2024
 * @author irodhan
 */
public class Main {
	// Variables
	//private static Connection conexion = null;
	public static String url = "jdbc:postgresql://localhost:5432/prueba_conexion";
	public static String user = "postgres";
	public static String password = "_Ivanrodriiguez04";

	/*
	 * Metodo principal de la aplicacion 24/09/2024
	 * 
	 * @author irodhan
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conectar1();
		//conectar2();
	}

	/*
	 * Metodo de conexion a la base de datos 24/09/2024
	 * 
	 * @author irodhan
	 */
	public static Connection conectar1() {
		Connection conexion = null;
		try {
			// Registrar el driver JDBC de PostgreSQL
			Class.forName("org.postgresql.Driver"); 

			// Establecer la conexión usando DriverManager
			conexion = DriverManager.getConnection(url, user, password);

			System.out.println("Conexión establecida con éxito.[java]");

		} catch (SQLException e) {
			System.out.println("Error de conexión: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver: " + e.getMessage());
			e.printStackTrace();
		}

		return conexion; // Retorna la conexión establecida
	}
/*
	public static Connection conectar2() {
		if (conexion == null) {
			try {
				// Configuración de la base de datos
				PGSimpleDataSource dataSource = new PGSimpleDataSource();
				dataSource.setServerName("localhost"); // Host del servidor PostgreSQL
				dataSource.setDatabaseName("prueba_conexion"); // Nombre de la base de datos
				dataSource.setPortNumber(5432); // Puerto por defecto de PostgreSQL
				dataSource.setUser("postgres"); // Usuario de PostgreSQL
				dataSource.setPassword("_Ivanrodriiguez04"); // Contraseña de PostgreSQL

				// Estableciendo la conexión
				conexion = dataSource.getConnection();
				System.out.println("Conexión establecida con éxito.[javax]");

			} catch (SQLException e) {
				System.out.println("Error de conexión: " + e.getMessage());
				e.printStackTrace();
			}
		}
		return conexion;
	}
*/
}