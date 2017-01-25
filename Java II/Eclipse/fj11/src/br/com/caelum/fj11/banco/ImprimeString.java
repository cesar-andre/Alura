package br.com.caelum.fj11.banco;

public class ImprimeString {
	public static void main(String[] args) {
		String a = "Socorram-me, subi no ônibus em Marrocos";
		String b = "anotaram a data da maratona";
		
		imprime(a);
		imprime(b);
	}
	
	private static void imprime (String frase) {
	    System.out.print("\t");
	    StringBuilder invertido = new StringBuilder(frase).reverse();
	    System.out.println(invertido);
	}
}
