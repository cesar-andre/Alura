package br.com.caelum.fj11.banco;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		long startInsert = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long endInsert = System.currentTimeMillis();
		
		long timeInsert = endInsert - startInsert;
		
		long startSearch = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long endSearch = System.currentTimeMillis();
		
		long timeSearch = endSearch - startSearch;
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempo);
		System.out.println("Tempo de inserção: " + timeInsert);
		System.out.println("Tempo de pesquisa: " + timeSearch);
		
	}

}
