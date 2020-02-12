package paoo_aula0_atvpolimorf;

public class Empregado3 extends Empregado{
	
	public Empregado3() {
		
	}
	
	public Empregado3(int tipo) {
		this.tipo = tipo;
	}
	
	public Empregado3(double salario, double percentualComissao, double bonus) {
		this.salario = salario;
		this.percentualComissao = percentualComissao;
		this.bonus = bonus;
	}
	
	public void setValorAReceber() {
		this.valorfinal = salario + salario * percentualComissao + bonus;
	}

}
