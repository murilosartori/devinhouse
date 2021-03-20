package exercicio11;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Marlene", "Silva", 4641.48);
		Funcionario func2 = new Funcionario("Antonio", "Souza", 4589.00);
		
		System.out.printf("O salário anual de %s %s é de: R$ %.2f%n", func1.nome, func1.sobrenome, func1.salarioAnual());
		System.out.printf("O salário anual de %s %s é de: R$ %.2f%n%n", func2.nome, func2.sobrenome, func2.salarioAnual());
		
		func1.aumentoSalario(1.10);
		func2.aumentoSalario(1.10);
		System.out.println("Após o aumento de 10%");
		System.out.printf("O salário anual de %s %s é de: R$ %.2f%n", func1.nome, func1.sobrenome, func1.salarioAnual());
		System.out.printf("O salário anual de %s %s é de: R$ %.2f%n", func2.nome, func2.sobrenome, func2.salarioAnual());
	}

}
