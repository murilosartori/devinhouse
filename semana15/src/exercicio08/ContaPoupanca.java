package exercicio08;

public class ContaPoupanca extends Conta {
	public void renderJurosDePoupanca() {
		this.saldo = super.verificaSaldo() * 1.001;
	}
	
	// não é possível comentar esse métodos, pois o método abstrato da classe Conta não foi implementado
	public String getTipo () {
        return "Conta Poupança";
    }
}
