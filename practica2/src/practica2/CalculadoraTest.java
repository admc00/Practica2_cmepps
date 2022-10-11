package practica2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private int a;
	private int b;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		a=4;
		b=5;
	}

	@AfterEach
	void tearDown() throws Exception {
		a=0;
		b=0;
	}

	@Test
	void testSuma() {
		int total=9;
		int suma = Calculadora.suma (a,b);
		assertEquals(suma,total);
	}

	@Test
	void testResta() {
		int total=-1;
		int resta = Calculadora.resta(a,b);
		assertEquals(resta,total);
	}

	@Test
	void testMultiplica() {
		int total=20;
		int multi = Calculadora.multiplica(a,b);
		assertEquals(multi,total);
	}

	@Test
	void testDivide() {
		int total=0;
		int div = Calculadora.divide(a,b);
		assertEquals(div,total);
	}

}
