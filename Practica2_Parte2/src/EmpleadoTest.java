import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	
	String tipo1;
	String tipo2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		tipo1="Encargado";
		tipo2="Vendedor";
	}

	@AfterEach
	void tearDown() throws Exception {
		tipo1="";
		tipo2="";
	}

	@Test
	void testEncargado() {
		float resultadoEsperado=2900;
		float resultadoPrueba = Empleado.calculoNominaBruta(tipo1,1100,10);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	@Test
	void testVendedor() {
		float resultadoEsperado=2400;
		float resultadoPrueba = Empleado.calculoNominaBruta(tipo2,1100,10);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	@Test
	void testSinPrima() {
		float resultadoEsperado=2800;
		float resultadoPrueba = Empleado.calculoNominaBruta(tipo1,900,10);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	@Test
	void testPrima1() {
		float resultadoEsperado=2900;
		float resultadoPrueba = Empleado.calculoNominaBruta(tipo1,1100,10);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	@Test
	void testPrima2() {
		float resultadoEsperado=3000;
		float resultadoPrueba = Empleado.calculoNominaBruta(tipo1,1500,10);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	@Test
	void testPagaExtra() {
		float resultadoEsperado=2900;
		float resultadoPrueba = Empleado.calculoNominaBruta(tipo1,1100,10);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	@Test
	void testSinPagaExtra() {
		float resultadoEsperado=2600;
		float resultadoPrueba = Empleado.calculoNominaBruta(tipo1,1100,0);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	

	@Test
	void testCalculoNominaNeta0() {
		float resultadoEsperado=2000;
		float resultadoPrueba = Empleado.calculoNominaNeta(2000);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	@Test
	void testCalculoNominaNeta15() {
		float resultadoEsperado=1870;
		float resultadoPrueba = Empleado.calculoNominaNeta(2200);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}
	@Test
	void testCalculoNominaNeta18() {
		float resultadoEsperado=2132;
		float resultadoPrueba = Empleado.calculoNominaNeta(2600);
		assertEquals(resultadoEsperado,resultadoPrueba);
	}

}
