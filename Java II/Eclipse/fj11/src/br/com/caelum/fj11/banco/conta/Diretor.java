package br.com.caelum.fj11.banco.conta;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public double getBonus() {
		return this.salario * 0.35;
	}
	
	public void cobraRelatorios() {
		System.out.println("Preciso dos relat�rios");
	}
	
	@Override
	public boolean autentica(int senha) {
		// L�gica de autentica��o
		return false;
	}

}
