package exercicio08;

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public boolean sacar(double valor) {
		return super.sacar(valor + 0.1);
	}
	
	public String getTipo () {
        return "Conta Corrente";
    }
	
	@Override
	public double getValorImposto() {
		return super.verificaSaldo() * 0.01;
	}
}
