package exercicio7;

public class ContaBancaria {
	String nomeDoTitular;
	int numero;
	int agencia;
	double saldo;
	double limite;
	String dataAbertura;
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public double verificaSaldo() {
		return this.saldo;
	}
}
