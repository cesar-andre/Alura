package br.com.caelum.fj11.banco.conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa);
	}
}
