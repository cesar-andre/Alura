package br.com.caelum.fj11.banco;

import br.com.caelum.fj11.banco.conta.Conta;
import br.com.caelum.fj11.banco.conta.ContaCorrente;
import br.com.caelum.fj11.banco.conta.SaldoInsuficienteException;

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente("Cesar", 123, 400.5);
		try {
			conta.saca(500.0);
		}
		catch (SaldoInsuficienteException e) {
			System.out.println("Saldo est� insuficiente: " + e.getSaldoAtual());
		}
		catch (Exception e) {
			System.out.println("Um outro erro");
		}
		System.out.println(conta.getSaldo());
	}

}
