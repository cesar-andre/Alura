package br.com.caelum.fj11.banco;

import java.util.ArrayList;
import java.util.Collections;

import br.com.caelum.fj11.banco.conta.ContaCorrente;

public class TestaColecoes {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Cesar");
		nomes.add("André");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		Collections.sort(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		ContaCorrente c1 = new ContaCorrente("Cesar", 123, 1500.00);
		ContaCorrente c2 = new ContaCorrente("Cesar", 123, 900.00);
		contas.add(c1);
		contas.add(c2);
		
		for (ContaCorrente c : contas) {
			System.out.println(c);
		}
		
		Collections.sort(contas);
		
		for (ContaCorrente c : contas) {
			System.out.println(c);
		}
		

	}

}
