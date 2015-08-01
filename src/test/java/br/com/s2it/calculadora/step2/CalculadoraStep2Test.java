package br.com.s2it.calculadora.step2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.s2it.calculadora.Calculadora;

/**
 * 
 * @author agomes
 *
 * [] Refatorando para utilizar @Before em new Calculadora();
 * [] Utilizar @BeforeClass para Logar no console o início dos testes. Exemplos
 * [] Utilizar @AfterClass para Logar no console o termino dos testes. Exemplos
 */
public class CalculadoraStep2Test {

	@Test
	public void deveRealizarASoma(){
		Calculadora calculadora = new Calculadora();
		
		assertEquals("Deve fazer a soma de 2 + 2 = 4 ",4, calculadora.soma(2,2));
	}
	
	@Test
	public void deveRealizarASubtracao(){
		Calculadora calculadora = new Calculadora();
		
		assertEquals("Deve fazer a subtração de 2 - 2 = 0 ",0, calculadora.subtrai(2,2));
	}
	
	@Test
	public void deveRealizarAMultiplicacao(){
		Calculadora calculadora = new Calculadora();
		
		assertEquals("Deve fazer a multiplicação de 2 * 2 = 4 ",4, calculadora.multiplica(2,2));
	}
	
	@Test
	public void deveRealizarADivisao(){
		Calculadora calculadora = new Calculadora();
		
		assertEquals("Deve fazer a divisão de 2 / 2 = 1 ",1, calculadora.divide(2,2));
	}
}
