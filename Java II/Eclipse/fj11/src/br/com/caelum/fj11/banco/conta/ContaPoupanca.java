package br.com.caelum.fj11.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
	}
	
	public ContaPoupanca(String nome, int agencia, double saldo, int numero) {
		super(nome, agencia, saldo, numero);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa);
	}
	
	@Override
    public int compareTo(ContaPoupanca outra) {
		return this.getNome().compareTo(outra.getNome());
    }
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
