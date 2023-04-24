package Frida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			ps.setString(3, np.getDireccion());
			ps.setString(4, np.getTelefono());
			ps.setString(5, np.getEmail());
			ps.executeUpdate();
			return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
	
			return false;
		}
		}	
	
	public boolean Actualizar(Fri np) {
		PreparedStatement ps=null;
		try {
			Fri np2= new Fri();
			np2.setId(np.getId());
			if(np2.Cargar()) {
			ps=conectar().prepareStatement("UPDATE cliente SET "
					+ "Nombre=?, "
					+ "Direccion=?, "
					+ "Telefono=?, "
					+ "Email=? "
					+"WHERE ID=? ");
			
			ps.setString(1, np.getNombre());
			ps.setString(2, np.getDireccion());
			ps.setString(3, np.getTelefono());
			ps.setString(4, np.getEmail());
			ps.setString(5, np.getId());
			ps.executeUpdate();
			return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return false;
		}
}
	public boolean Eliminar(String Id) {
		PreparedStatement ps=null;
		try {
			Fri np=new Fri();
			np.setId(Id);
			if(np.Cargar()) {
			ps=conectar().prepareStatement("DELETE FROM cliente WHERE Id=?");
			ps.setString(1,Id);
			ps.executeUpdate();
			return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return false;
		}
}
	public boolean Cargar(Fri np) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=conectar().prepareStatement("SELECT * FROM cliente WHERE Id=?");
			ps.setString(1,np.getId());
			rs=ps.executeQuery();
			if(rs.next()) {
				np.setId(rs.getString(1));
				np.setNombre(rs.getString(2));
				np.setDireccion(rs.getString(3));
				np.setTelefono(rs.getString(4));
				np.setEmail(rs.getString(5));
			return true;	
			}else {
				return false;
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			return false;
		}
}

}
