package br.com.caelum.fj11.banco;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.fj11.banco.conta.ProduzMensagens;

public class RegistroDeMensagens {
	public static void main(String[] args) throws InterruptedException {	
		Set<String> mensagens = new HashSet<>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(0, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(0, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtoras de mensagens finalizadas!");
		
		for (int i = 0; i < 15000; i++) {
			if (!mensagens.contains("Mensagem " + i)) {
				throw new IllegalStateException("Não encontrei a mensagem " + i);
			}
		}
		
		
		if (mensagens.contains(null)) {
			throw new IllegalStateException("Não devia ter null aqui");
		}
		
		System.out.println("Fim");
	}
}
