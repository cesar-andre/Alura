package br.com.caelum.fj11.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.fj11.banco.conta.Conta;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new Conta("Cesar", 1, 1000.0);
		Conta c2 = new Conta("Cesar", 2, 2000.0);
		
		Map<String, Conta> mapadeContas = new HashMap<>();
		
		mapadeContas.put("diretor", c1);
		mapadeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapadeContas.get("diretor");
		
		System.out.println(contaDoDiretor.getSaldo());
		
		
		
	}
}
