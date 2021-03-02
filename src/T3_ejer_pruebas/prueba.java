package T3_ejer_pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class prueba {

			
	 CCuenta mia=new CCuenta("mia", "casa", 1000, 5);
	

	@Test
	void test() {
	
	try {
		mia.ingresar(1500);
	} catch (Exception e) {
		
	}	
	
	assertEquals(2500, mia.estado());

	}
	
	
	@Test
	void test1() {
			
		try {
			mia.retirar(500);
		} catch (Exception e) {
			
		}
		assertEquals(500, mia.estado());
	}
	
	
	 @Test
	void test2 () {
				
		try {
			mia.ingresar(4000);
		} catch (Exception e) {
	
		}
		try {
			mia.retirar(1000);
		} catch (Exception e) {
		
		}
		assertEquals(4000, mia.estado()); 
		
	} 

}
