package paoo_aula0_atvpolimorf;

public class Empregado2 extends Empregado{
	
	public Empregado2() {
		
	}
	
	public Empregado2(int tipo) {
		this.tipo = tipo;
	}
	
	public Empregado2(double salario, double percentualComissao) {
		this.salario = salario;
		this.percentualComissao = percentualComissao;
	}
	
	public void setValorAReceber() {
		this.valorfinal = salario + salario * percentualComissao;
	}

}
