package br.com.caelum.fj11.banco.conta;

public class FazDeposito implements Runnable {
	
	private final Conta conta;
	
	public FazDeposito(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void run() {
		this.conta.deposita(100.0);
	}

}
