class Gerente extends Funcionario implements Autenticavel {
	public double getBonus() {
		return this.salario * 0.3;
	}
	
	public void cobraEntrega() {
		System.out.println("Est� pronto?");
	}

	@Override
	public boolean autentica(int senha) {
		// L�gica de autentica��o
		return false;
	}
}
