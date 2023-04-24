package Frida;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void testInsertar() {
	Fri cc =new Fri();
	cc.setId("f");
	cc.setNombre("f");
	cc.setDireccion("f");
	cc.setTelefono("f");
	cc.setEmail("f");
	assertEquals(cc.Insertar(), true);
	}

	@org.junit.jupiter.api.Test
	void testCargar() {
		Fri cc =new Fri();
		cc.setId("f");
		assertEquals(cc.Cargar(), true);
	}

	@org.junit.jupiter.api.Test
	void testEliminar() {
		Fri cc =new Fri();
		cc.setId("2");
	assertEquals(cc.Eliminar(), true);
		
	}

	@org.junit.jupiter.api.Test
	void testActualizar() {
		Fri cc =new Fri();
		cc.setNombre("f");
		cc.setDireccion("f");
		cc.setTelefono("f");
		cc.setEmail("f");
		cc.setId("f");
		assertEquals(cc.Actualizar(), true);
	}

}
