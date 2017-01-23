package fj11;

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente("Cesar", 123, 400.5);
		try {
			conta.saca(500.0);
		}
		catch (SaldoInsuficienteException e) {
			System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		}
		catch (Exception e) {
			System.out.println("Um outro erro");
		}
		System.out.println(conta.getSaldo());
	}

}
