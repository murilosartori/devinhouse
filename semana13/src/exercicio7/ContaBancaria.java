package exercicio7;

public class ContaBancaria {
	String nomeDoTitular;
	int numero;
	int agencia;
	double saldo;
	double limite;
	String dataAbertura;
	private static int totalContas;
	int identificador;
	
	public ContaBancaria() {
		ContaBancaria.totalContas++;
		this.identificador = totalContas;
	}
	
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
	
	//Exercicio 8
	String recuperaDadosParaImpressao() {
        return String.format("Nome do Titular: %s%nConta: %d%nAgencia: %d%nSaldo: %.2f%nLimite: %.2f%nData Abertura: %s",
        					this.nomeDoTitular, this.numero, this.agencia, this.saldo, this.limite, this.dataAbertura);
    }
	
	//Exercicio 15
	public int getIdentificador() {
		return this.identificador;
	}
	
	public String getTipo() {
		return "Conta";
	}
}
