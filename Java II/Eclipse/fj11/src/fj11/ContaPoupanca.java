package fj11;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa);
	}
}
