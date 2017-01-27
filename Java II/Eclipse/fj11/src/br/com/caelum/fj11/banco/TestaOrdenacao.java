package br.com.caelum.fj11.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.fj11.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		Random r = new Random();
		ContaPoupanca c1 = new ContaPoupanca("Cesar", 123, r.nextInt(5000) , 3);
		ContaPoupanca c2 = new ContaPoupanca("André", 1502, r.nextInt(5000), 5);
		ContaPoupanca c3 = new ContaPoupanca("Eduardo", 8286, r.nextInt(5000), 1);
		ContaPoupanca c4 = new ContaPoupanca("Hanna", 556, r.nextInt(5000), 6);
		ContaPoupanca c5 = new ContaPoupanca("Java", 2323, r.nextInt(5000), 7);
		
		List<ContaPoupanca> lista = new LinkedList<>();
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		
		Collections.sort(lista);
		
		System.out.println(lista);

	}

}
