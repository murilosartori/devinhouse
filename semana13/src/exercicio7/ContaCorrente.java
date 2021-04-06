package exercicio7;

public class ContaCorrente extends ContaBancaria {
	
	@Override
	public boolean sacar(double valor) {
		return super.sacar(valor + 0.1);
	}
}
