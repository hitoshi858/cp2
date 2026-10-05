package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import S2.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(3,2));
	}
	@Test
	void testResta() {
		assertEquals(0, Calculadora.resta(2, 2));
	}
	@Test
	void testMultiplicacion() {
		assertEquals(4, Calculadora.multiplicacion(2, 2));
	}
	@Test
	void testDivision() {
		assertEquals(2, Calculadora.division(4, 2));
	}

	@Test
	void testDivisionB0() {
		assertEquals(-1, Calculadora.division(4,0));
	}
}
