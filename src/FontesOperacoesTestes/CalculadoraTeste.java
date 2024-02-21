package FontesOperacoesTestes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import FontesOperacoes.Calculadora;

public class CalculadoraTeste {

	Calculadora calc = new Calculadora();
	
	@Test
	public void testeSomar3com5(){
		int resultado = calc.somar(3, 5);
		assertEquals(resultado, 8);
	}
	
	@Test
	public void testeSomar3com3(){
		int resultado = calc.somar(3, 3);
		assertEquals(resultado, 6);
	}
	
	@Test
	public void testeSubtrair3com3(){
		int resultado = calc.subtrair(3, 3);
		assertEquals(resultado, 0);
	}

	@Test
	public void testeSubtrair3com8(){
		int resultado = calc.subtrair(3, 8);
		assertEquals(resultado, 5);
	}
	
	@Test
	public void testeDividir8por2(){
		double resultado = calc.divisao(8, 2);
		assertEquals(resultado, 4, 0);
	}
	
	@Test
	public void testeDividir8por3(){
		double resultado = calc.divisao(8, 3);
		assertEquals(resultado, 2.6, 0.7);
	}
	
	@Test
	public void testeDividir5por2(){
		double resultado = calc.divisao(5, 2);
		assertEquals(resultado, 2.5, 0.5);
	}
	
}
