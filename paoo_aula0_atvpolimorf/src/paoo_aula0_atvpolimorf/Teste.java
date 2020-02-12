package paoo_aula0_atvpolimorf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {
	
	public static void main(String[] args) {
		//Trecho 1 - Listagem 2
		List <Empregado> empregados = new ArrayList <> ();
		//variável primitiva fica no local de método(stack), a não ser que estejam dentro de um objeto
		//variável local fica no stack
		//vetores sempre são objetos
		Random gerador = new Random();
		//gerador de valores aleatórios
		//Stack: empregados e gerador
		
		//Trecho 1 - Listagem 3
		for (int i = 0; i < 10; i++) {
			int tipo = 1 + gerador.nextInt(4);
			//gerador independente de for
			//incluso números de 0 a (2 elevado a 32 - 1)
			//incluso de 1 a 4
			//empregados.add(new Empregado(tipo));
			
			if(tipo == 1) {
				empregados.add(new Empregado1(tipo));
				double salario = 1500 + gerador.nextDouble() * 3500;
				empregados.get(i).setSalario(salario);
				empregados.get(i).setValorAReceber();
			}
			
			else if(tipo == 2) {
				empregados.add(new Empregado2(tipo));
				double salario = 1200 + gerador.nextDouble() * 1000;
				double percentualComissao = gerador.nextDouble();
				empregados.get(i).setSalario(salario);
				empregados.get(i).setPercentualComissao(percentualComissao);
				empregados.get(i).setValorAReceber();
			}
			
			else if(tipo == 3) {
				empregados.add(new Empregado3(tipo));
				double salario = 1100 + gerador.nextDouble() * 700;
				double percentualComissao = 0.2 + gerador.nextDouble() * 0.5;
				double bonus = 100;
				empregados.get(i).setSalario(salario);
				empregados.get(i).setPercentualComissao(percentualComissao);
				empregados.get(i).setBonus(bonus);
				empregados.get(i).setValorAReceber();
			}
			
			else if(tipo == 4) {
				empregados.add(new Empregado4(tipo));
				double bonus = 2000 + gerador.nextDouble() * 2500;
				empregados.get(i).setBonus(bonus);
				empregados.get(i).setValorAReceber();
			}
			
		}
		
		
		//Trecho 2 - Listagem 8
		for (Empregado e : empregados){
			System.out.println("Valor a receber: " + e.getValorAReceber());
		}
		
		
	}

}
