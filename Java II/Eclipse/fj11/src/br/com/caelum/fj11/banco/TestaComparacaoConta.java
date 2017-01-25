package br.com.caelum.fj11.banco;

import br.com.caelum.fj11.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente("cesar", 123, 500.0, 15);
		ContaCorrente cc2 = new ContaCorrente("cesar", 123, 500.0, 15);
		
		
		if (cc1 == cc2) {
			System.out.println("Igual com ==");
		} else {
			System.out.println("Diferente com ==");
		}
		
		if (cc1.equals(cc2)) {
			System.out.println("Igual com equals");
		} else {
			System.out.println("Diferente com equals");
		}
		
	}
}
