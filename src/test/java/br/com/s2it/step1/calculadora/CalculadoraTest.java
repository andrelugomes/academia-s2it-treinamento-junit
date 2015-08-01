package br.com.s2it.step1.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.s2it.calculadora.Calculadora;

/**
 * 
 * @author agomes
 *
 * [] Convenções de testes
 * [] Apresentação @Test
 * [] Assert.assertEquals (Mensagens: explicação do esperado, esperado, atual:retorno)
 * [] Assert.assertTrue 
 * [] Realizar testes de métodos simples explorando as 4 operações
 */
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
		
		assertEquals("Deve fazer a divisão de 2 / 2 = 1 ",1, calculadora.divide(2,2));
	}
	
	/**
	 * Iniciando com TDD
	 * [] Criar método que calcula calcula passando a operação. Ex.: cancula(a,b,"soma")
	 */
	@Test
	public void deveRetornarSeCalculou(){
		
		
		assertTrue(false);
	}
}
