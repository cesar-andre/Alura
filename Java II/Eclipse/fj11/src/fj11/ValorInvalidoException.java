package fj11;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException() {
		super("Valor n�o est� correto");
	}
	
	public ValorInvalidoException(double valor) {
		super("O valor inv�lido foi: " + valor);
	}

}
