package br.com.caelum.fj11.banco.conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
	}
	
	public ContaCorrente(String nome, int agencia, double saldo, int numero) {
		super(nome, agencia, saldo, numero);
	}
	
	@Override
	public void atualiza(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa * 2);
	}
	
	@Override
	public void setAgencia(int agencia) {
		super.setAgencia(agencia);
	}
	
	

}
