package exercicio08;

public class ContaPoupanca extends Conta {
	public void renderJurosDePoupanca() {
		this.saldo = super.verificaSaldo() * 1.001;
	}
	
	// n�o � poss�vel comentar esse m�todos, pois o m�todo abstrato da classe Conta n�o foi implementado
	public String getTipo () {
        return "Conta Poupan�a";
    }
}
