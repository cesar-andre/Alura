package br.com.caelum.fj11.banco;

import br.com.caelum.fj11.banco.conta.Conta;
import br.com.caelum.fj11.banco.conta.ContaCorrente;

public class TestaInteger {
	public static void main(String[] args) {
		/*Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		String valida = "123";
		String invalida = "ac234";
		
		Integer i1 = Integer.parseInt(valida);
		Integer i2 = Integer.parseInt(invalida);
		
		System.out.println(i1);
		System.out.println(i2);
		
		if (x1.equals(x2)) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}*/
		
		Conta conta = new ContaCorrente("cesar", 123, 500.0);
		System.out.println(conta);
	}
}
