import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraGeralTese {
	
	@Test
	public void somaDoisValores () throws Exception {
		
		int a =2, b =2, soma;
		
		CAlculaGeral calculadora = new CAlculaGeral();
		
		soma = calculadora.somar(a,b);
		
		assertEquals(4,soma);
	}
	@Test
	public void subtraiDoisValores () throws Exception{
		int b = 3, c = 1, subtrai;
		
		CAlculaGeral calcSubtrai = new CAlculaGeral();
		subtrai = calcSubtrai.subtracao(b,c);
		
		assertEquals(2,subtrai);
	}
	@Test
	public void multiplicaDoisValores () throws Exception{
		int d = 2, e = 3, resultado;
		
		CAlculaGeral calcMultiplica = new CAlculaGeral();
		resultado = calcMultiplica.multiplica(d,e);
		
		assertEquals(6,resultado);
	}
	@Test
	public void divideDoisValores () throws Exception {
		int f = 4, g = 2, resul;
		
		CAlculaGeral calcDivisao = new CAlculaGeral();
		resul = calcDivisao.divide(f,g);
		
		assertEquals(2,resul);
	}
	
	
	
}
