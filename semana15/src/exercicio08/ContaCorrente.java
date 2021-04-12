package exercicio08;

public class ContaCorrente extends Conta {
	@Override
	public boolean sacar(double valor) {
		return super.sacar(valor + 0.1);
	}
	
	public String getTipo () {
        return "Conta Corrente";
    }
}
