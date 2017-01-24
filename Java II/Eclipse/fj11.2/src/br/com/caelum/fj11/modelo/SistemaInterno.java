package br.com.caelum.fj11.modelo;
public class SistemaInterno {
	
	public void autentica(Autenticavel f) {
		int senha = 123; // veio do teclado
		
		if (f.autentica(senha) == true) {
			System.out.println("Bem-vindo ao sistema");
		} else {
			System.out.println("Senha incorreta");
		}
	}

}
