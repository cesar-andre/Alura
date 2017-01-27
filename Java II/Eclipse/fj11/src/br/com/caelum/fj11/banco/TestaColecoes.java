package br.com.caelum.fj11.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.fj11.banco.conta.Conta;

public class TestaColecoes {

	public static void main(String[] args) {
					
		Map<String, Conta> contas = new HashMap<String, Conta>();
		Conta c1 = new Conta("Cesar", 123, 200.0);
		Conta c2 = new Conta("André", 123, 500.0);
		contas.put("diretor", c1);
		contas.put("gerente", c2);
		
		System.out.println(contas.get("diretor").getSaldo());
		System.out.println(contas.size());
		
		

	}

}
