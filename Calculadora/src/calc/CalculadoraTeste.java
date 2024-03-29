package calc;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculadoraTeste {

	public static class CalculadoraTest {
		public CalculadoraTest() {
		}

		@BeforeClass
		public static void setUpClass() throws Exception {
		}

		@AfterClass
		public static void tearDownClass() throws Exception {
		}

		@Before
		public void setUp() {
		}

		@After
		public void tearDown() {
		}

		/**
		 * Testando metodo dividir calculadora
		 */
		@Test
		public void testDividir() {
			System.out.println("dividir");
			int n1 = 5;
			int n2 = 2;
			Calculadora instance = new Calculadora();
			double expResult = 2.5;
			double result = Calculadora.dividir(n1, n2);
			assertEquals(expResult, result, 0);
		}

		/**
		 * Testando multiplicar calculadora
		 */
		@Test
		public void testMultiplicar() {
			System.out.println("multiplicar");
			int n1 = 2;
			int n2 = 3;
			Calculadora instance = new Calculadora();
			double expResult = 6;
			double result = Calculadora.multiplicar(n1, n2);
			assertEquals(expResult, result, 0);
		}

		/**
		 * Testando Subtra��o da calculadora
		 */
		@Test
		public void testSubtrair() {
			System.out.println("subtrair");
			int n1 = 5;
			int n2 = 3;
			double expResult = 2;
			double result = Calculadora.subtrair(n1, n2);
			assertEquals(expResult, result, 0);
		}

		/*
		 * Testando a SOma na calculadora
		 */
		@Test
		public void testSoma() {
			System.out.println("somar");
			int n1 = 5;
			int n2 = 5;
			double expResult = 10.0;
			double result = Calculadora.adicionar(n1, n2);
			assertEquals(expResult, result, 0);
		}
		
		/*
		 *  Testando Impar ou par
		 */
		@Test 
		public void testImpar(){
			System.out.println("Tem impar");
			int val1 = 1;
			double val2 = 40;
			double expResult = 40;
			
			double resultado = Calculadora.temImpar(val1, val2);
			assertEquals(expResult, resultado, 0);
		}
		
		/*
		 * Testando Poligono
		 */
		
		@Test
		public void testPoligono() {
			System.out.println("Poligono");
			double val1 = 4;
			double val2 = 4;
			double val3 = 100;
			double vet[] = new double [3];
			vet[0] = val1;
			vet[1] = val2;
			vet[2] = val3;
			
			double expResult = 25;
			double resultado = Calculadora.poligono(vet);
			assertEquals(expResult, resultado, 0);
		}
	}
}
