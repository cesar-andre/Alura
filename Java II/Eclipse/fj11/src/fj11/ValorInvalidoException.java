package fj11;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException() {
		super("Valor não está correto");
	}
	
	public ValorInvalidoException(double valor) {
		super("O valor inválido foi: " + valor);
	}

}
