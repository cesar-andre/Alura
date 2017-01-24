package br.com.caelum.fj11.modelo;

public class DBA extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}

}
