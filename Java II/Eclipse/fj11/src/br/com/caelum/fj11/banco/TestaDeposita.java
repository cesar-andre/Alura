package br.com.caelum.fj11.banco;

import br.com.caelum.fj11.banco.conta.Conta;
import br.com.caelum.fj11.banco.conta.ContaCorrente;
import br.com.caelum.fj11.banco.conta.ValorInvalidoException;

public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaCorrente("Cesar", 123, 100.0);
		try {
			cp.deposita(-200);	
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
