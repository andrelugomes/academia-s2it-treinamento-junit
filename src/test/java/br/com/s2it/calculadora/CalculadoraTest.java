package br.com.s2it.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

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
		
		assertEquals("Deve fazer a divisao de 2 / 2 = 1 ",1, calculadora.divide(2,2));
	}
}
