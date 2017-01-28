package br.com.caelum.fj11.banco.conta;

public class BarraDeProgresso implements Runnable {

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("barra de progresso");
		}
	}
}
