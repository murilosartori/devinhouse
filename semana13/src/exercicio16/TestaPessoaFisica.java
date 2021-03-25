package exercicio16;

public class TestaPessoaFisica {

	public static void main(String[] args) {
		PessoaFisica pessoa = new PessoaFisica("Alberto Roberto", "1", "Rua A");
		System.out.printf("Nome: %s%n", pessoa.getNome());
		System.out.printf("CPF: %s%n", pessoa.getCpf());
		System.out.printf("Endereço: %s%n%n", pessoa.getEndereco());
		
		PessoaFisica pessoa2 = new PessoaFisica("Joana Assis", "", "Rua B");
		System.out.printf("Nome: %s%n", pessoa2.getNome());
		System.out.printf("CPF: %s%n", pessoa2.getCpf());
		System.out.printf("Endereço: %s%n", pessoa2.getEndereco());
	}

}
