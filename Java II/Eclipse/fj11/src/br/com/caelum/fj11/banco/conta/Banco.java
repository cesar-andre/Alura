package br.com.caelum.fj11.banco.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	List<Conta> contas = new ArrayList<>();
	Map<String, Conta> map = new HashMap<>();
	
	void adiciona(Conta c) {
		this.contas.add(c);
		map.put(c.getNome(), c);
	}
	
	Conta pega(int x) {
		return this.contas.get(x);
	}
	
	int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	Conta buscaPorNome(String nome) {
		return map.get(nome);
	}
}
