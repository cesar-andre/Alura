package br.com.caelum.fj11.banco;

import br.com.caelum.fj11.banco.conta.Cliente;
import br.com.caelum.fj11.banco.conta.Conta;
import br.com.caelum.fj11.banco.conta.ContaCorrente;
import br.com.caelum.fj11.conta.GuardadorDeObjetos;

public class TestaJavaLang {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("Cesar", 123, 500.0);
		ContaCorrente c2 = new ContaCorrente("André", 123, 500.0);
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		armario.adiciona(c1);
		armario.adiciona(c2);
		
		Cliente joao = new Cliente();
		armario.adiciona(joao);
		
		Conta c1NoArmario = (Conta) armario.pega(0);
		Cliente joaoNoArmario = (Cliente) armario.pega(2);
		
		System.out.println(c1);
		
		if (c1.equals(c2)) {
			System.out.println("Mesmo saldo");
		} else {
			System.out.println("Saldo diferente");
		}
	}
}
