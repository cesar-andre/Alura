package br.com.caelum.fj11.banco.conta;

public class DBA extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}

}
