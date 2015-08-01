package br.com.s2it.calculadora.step3;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

import br.com.s2it.calculadora.Calculadora;

/**
 * 
 * @author agomes
 *
 * [] Apresentação dos Matchers do Hamcrest - https://code.google.com/p/hamcrest/wiki/Tutorial
 * [] import static org.hamcrest.Matchers.*;
 * [] Assert.assertThat (EU AFIRMO QUE...)
 */
public class CalculadoraStep3Test {

	@Test
	public void deveRealizarASoma(){
		Calculadora calculadora = new Calculadora();
		
		assertThat(calculadora.soma(2,2), Matchers.equalTo(4));
	}
	
	@Test
	public void deveRealizarASubtracao(){
		Calculadora calculadora = new Calculadora();
		
		assertThat(calculadora.subtrai(2,2), Matchers.equalTo(0));
	}
	
	@Test
	public void deveRealizarAMultiplicacao(){
		Calculadora calculadora = new Calculadora();
		
		assertThat(calculadora.multiplica(2,2), Matchers.equalTo(4));
	}
	
	@Test
	public void deveRealizarADivisao(){
		Calculadora calculadora = new Calculadora();
		
		assertThat( calculadora.divide(2,2), Matchers.equalTo(1));
	}
}
