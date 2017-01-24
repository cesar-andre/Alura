package br.com.caelum.fj11.conta;

public class GuardadorDeObjetos {
	private Object[] contas;
	private int posicaoLivre;
		
	public GuardadorDeObjetos() {
		this.contas = new Object[100];
	}

	public void adiciona (Object nova) {	
		contas[posicaoLivre] = nova;
		posicaoLivre++;
	}
	
	public Object pega(int posicao) {
		return contas[posicao];
	}
}
