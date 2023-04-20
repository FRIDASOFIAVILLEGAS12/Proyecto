package Frida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Conexion {
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
		Conexion dp = new Conexion();
		dp.conectar();
	}
	
	public boolean Insertar(Fri np) {
		PreparedStatement ps=null;
		try {
			ps=conectar().prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?)");
			ps.setString(1, np.getId());
			ps.setString(2, np.getNombre());
			ps.setString(3, np.Direccion);
			ps.setString(4, np.Telefono);
			ps.setString(5, np.Email);
			ps.executeUpdate();
			return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		}	
	
	public boolean Actualizar(Fri np) {
		return true;
}
	public boolean Eliminar(String Id) {
		return true;
}
	public boolean Cargar(Fri np) {
		return true;
}

}
