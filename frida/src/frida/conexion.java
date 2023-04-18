package frida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexion {
	private static final String controlador = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/p1";
	private static final String user = "root";
	private static final String password = "";
	
	public Connection conectar() {
		Connection cx = null;
		try {
			cx = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Succes");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cx;
	}
	
	public static void main(String[] args) {
		conexion dp = new conexion();
		dp.conectar();
	}


}
