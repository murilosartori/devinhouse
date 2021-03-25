package exercicio17;

public class TesteContaPoupanca {

	public static void main(String[] args) {
		ContaPoupanca poupador1 = new ContaPoupanca(2000);
		ContaPoupanca poupador2 = new ContaPoupanca(3000);
		ContaPoupanca.alterarTaxaAnual(0.04);
		
		for (int mes = 1; mes <= 12; mes++) {
            poupador1.calcularJuroMensal();
            poupador2.calcularJuroMensal();
        }
		System.out.printf("Saldo para o poupador1 em 12 meses é: %.2f%n", poupador1.getSaldo());
		System.out.printf("Saldo para o poupador2 em 12 meses é: %.2f%n%n", poupador2.getSaldo());
		
		ContaPoupanca.alterarTaxaAnual(0.05);
		poupador1.calcularJuroMensal();
        poupador2.calcularJuroMensal();
        
        System.out.printf("Saldo para o poupador1 para o 13º mês seria de: %.2f%n", poupador1.getSaldo());
		System.out.printf("Saldo para o poupador2 para o 13º mês seria de: %.2f%n", poupador2.getSaldo());
	}

}
