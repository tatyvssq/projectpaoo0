package paoo_aula0_atvpolimorf;

public class Empregado {

	public int tipo;
	public double salario;
	public double percentualComissao;
	public double bonus;
	public double valorfinal;

	public Empregado() {

	}

	public Empregado(int tipo) {
		// construtor inicializando a variável tipo
		// sombreamento: parâmetro com mesmo nome da var
		this.tipo = tipo;
		// operador de autoreferência
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getValorAReceber() {
		return valorfinal;
	}

	public void setValorAReceber() {
		this.valorfinal = valorfinal;
	}

}


