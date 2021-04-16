package exercicio08;

public class TesteConta {
	public static void main(String[] args) {
//		ContaCorrente conta = new ContaCorrente();
//		System.out.println(conta.getTipo());
//		conta.nomeDoTitular = "Nome do Titular";
//		conta.numero = 1;
//		conta.agencia = 2;
//		conta.saldo = 100;
//		conta.limite = 50;
//		conta.dataAbertura = "19/03/2021";
//		System.out.println(String.format("A conta é a de número: %d", conta.getIdentificador()));
//		
//		conta.depositar(300);
//		System.out.println(String.format("O saldo em conta é %.2f", conta.verificaSaldo()));
//
//		conta.sacar(126.53D);
//		System.out.println(String.format("O saldo em conta é %.2f", conta.verificaSaldo()));
//
//		System.out.println(conta.recuperaDadosParaImpressao());
//		
//		System.out.println(String.format("Imposto conta corrente: %.2f%n", conta.getValorImposto()));
//
//		ContaPoupanca conta2 = new ContaPoupanca();
//		System.out.println(conta2.getTipo());
//		conta2.nomeDoTitular = "Nome do Titular";
//		conta2.numero = 1;
//		conta2.agencia = 2;
//		conta2.saldo = 100;
//		conta2.limite = 50;
//		conta2.dataAbertura = "19/03/2021";
//		System.out.println(String.format("A conta2 é a de número: %d", conta2.getIdentificador()));
//		System.out.println(conta2.recuperaDadosParaImpressao());
//		
//
//		SeguroDeVida seguro = new SeguroDeVida(50000,"Gilberto Silva", 123);
//		System.out.println("");
//        System.out.println(seguro);
//        System.out.println("Imposto Seguro: " + seguro.getValorImposto());
//        
//        Tributavel[] tributos = new Tributavel[2];
//        tributos[0] = conta;
//        tributos[1] = seguro;
//
//        ManipuladorDeTributaveis manipulador = new ManipuladorDeTributaveis();
//        manipulador.calculaImpostos(tributos);
//
//        System.out.printf("%n%nTotal de tributos: R$ %.2f", manipulador.getTotal());
		
		ContaCorrente conta = new ContaCorrente();
		conta.nomeDoTitular = "Nome do Titular";
		conta.numero = 1;
		conta.agencia = 2;
		conta.saldo = 100;
		conta.limite = 50;
		conta.dataAbertura = "19/03/2021";
		
		ContaPoupanca conta2 = new ContaPoupanca();
		conta2.nomeDoTitular = "Nome do Titular";
		conta2.numero = 1;
		conta2.agencia = 2;
		conta2.saldo = 100;
		conta2.limite = 50;
		conta2.dataAbertura = "19/03/2021";
		
		Agencia agencia = new Agencia();
		agencia.adiciona(conta);
		agencia.adiciona(conta2);
		
		System.out.printf("Total de contas: %d", agencia.getQuantidadeDeContas());
	}
}
