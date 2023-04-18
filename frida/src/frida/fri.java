package frida;

public class fri {
String  Id;
String Nombre ;
String Direccion ;
String Telefono ;
String Email ;
conexion dp = null;
public fri() {
	dp = new conexion();
}

public fri (String Id, String Nombre, String Direccion, String Telefono, String Email) {
	super();
	this.Id = Id;
	this.Nombre = Nombre;
	this.Direccion = Direccion;
	this.Telefono = Telefono;
	this.Email = Email;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
public String getTelefono() {
	return Telefono;
}
public void setTelefono(String telefono) {
	Telefono = telefono;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}

}
