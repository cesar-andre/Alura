package fj11;

public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaCorrente("Cesar", 123, 100.0);
		try {
			cp.deposita(-200);	
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
