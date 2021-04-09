package exercicio7;

public class ContaPoupanca extends ContaBancaria {
	public void renderJurosDePoupanca() {
		this.saldo = super.verificaSaldo() * 1.001;
	}
	
	public String getTipo () {
        return super.getTipo() + " Poupança";
    }
}
