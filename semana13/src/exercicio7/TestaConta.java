package exercicio7;

public class TestaConta {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.nomeDoTitular = "Nome do Titular";
		conta.numero = 1;
		conta.agencia = 2;
		conta.saldo = 100;
		conta.limite = 50;
		conta.dataAbertura = "19/03/2021";
		
		conta.depositar(300);
		System.out.println(String.format("O saldo em conta é %.2f%n", conta.verificaSaldo()));
		
		conta.sacar(126.53D);
		System.out.println(String.format("O saldo em conta é %.2f%n%n", conta.verificaSaldo()));
		
		System.out.println(conta.recuperaDadosParaImpressao());
	}

}
