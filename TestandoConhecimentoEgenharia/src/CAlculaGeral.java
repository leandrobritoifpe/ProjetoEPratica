
public class CAlculaGeral {

	//Metodos da classe CalculaGeralTeste
	public int somar(int a, int b) {
		return a + b;
	}

	public int subtracao(int b, int c) {
		return b - c;
	}

	public int multiplica(int d, int e) {
		return d * e;
	}

	public int divide(int f, int g) {
		return f / g;
	}
//--------------------------------------------------------------
	
	//Metodos de calculo de imposto do salário da classe CalcularSalario
	public double calcImposto(double salario) {
		
		if (salario <= 2000.0 && salario >= 1000.0) {
			salario = salario * 0.10;
		}
		else if (salario > 2000.0 && salario <= 3000.0) {
			salario = salario * 0.15;
		} 
		else if (salario > 3000.0) {
			salario = salario * 0.20;
		}
		return salario;
	}

	public double calcSalarioLiquido(double salarioLiquido) {		
		return (salarioLiquido - calcImposto(salarioLiquido));
	}

}
