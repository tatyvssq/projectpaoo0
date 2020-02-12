package paoo_aula0_atvpolimorf;

public class Empregado1 extends Empregado{
	
	public Empregado1(){
			
	}
	
	public Empregado1(int tipo) {
		this.tipo = tipo;
	}
	
	public Empregado1(int tipo, double salario) {
		this.salario = salario;
	}
	
	public double getValorAReceber() {
		return 0;
	}
	
	public void setValorAReceber() {
		this.valorfinal = salario;
	}
}

		
