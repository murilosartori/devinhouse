package exercicio7;

public class ContaPoupanca extends ContaBancaria {
	public void renderJurosDePoupanca() {
		this.saldo = super.verificaSaldo() * 1.001;
	}
}
