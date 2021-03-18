package exercicio5;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Fulano de Tal";
		pessoa.idade = 20;
		System.out.println(String.format("%s tem %d anos.", pessoa.nome, pessoa.idade));
		pessoa.fazAniversario();
		System.out.println(String.format("%s fez aniversário, agora ele tem %d anos.", pessoa.nome, pessoa.idade));
	}

}
