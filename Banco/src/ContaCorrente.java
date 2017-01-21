
public class ContaCorrente extends Conta implements Tributavel {
		
	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}
