import static org.junit.Assert.*;


import org.junit.Test;


public class CalcularSalario {
	
	//Teste de Calculo de Imposto
	
	@Test
	public void imposto1 () throws Exception {
		
		CAlculaGeral calculaImposto1 = new CAlculaGeral();
		double resultado = calculaImposto1.calcImposto(2000.0);
		
		assertEquals(200.0,resultado,0.1);
	}
	@Test
	public void imposto2 () throws Exception {
		
		CAlculaGeral calcImposto2 = new CAlculaGeral();
		double resultado = calcImposto2.calcImposto(2500.0);
		
		assertEquals(375.0,resultado,0.1);
		
	}
	@Test
	public void imposto3 () throws Exception {
		
		CAlculaGeral calcImposto3 = new CAlculaGeral();
		double resultado = calcImposto3.calcImposto(4000.0);
		
		assertEquals(800.0,resultado,0.1);
	}
	
	@Test
	public void salarioLiquido1 () throws Exception {
		
		CAlculaGeral param = new CAlculaGeral();
		double salarioLiquido = param.calcSalarioLiquido(2000.0);
		
		assertEquals(1800.0,salarioLiquido,0.1);
	}
	@Test
	public void salarioLiquido2 () throws Exception {
		
		CAlculaGeral param = new CAlculaGeral();
		double salarioLiquido = param.calcSalarioLiquido(2500.0);
		
		assertEquals(2125.0,salarioLiquido,0.1);
	}
	@Test
	public void salarioLiquido3 () throws Exception {
		
		CAlculaGeral param = new CAlculaGeral();
		double salarioLiquido = param.calcSalarioLiquido(4000.0);
		
		assertEquals(3200.0,salarioLiquido,0.1);
	}
}
