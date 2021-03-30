package exercicio08;

public class Gerente extends Funcionario {
	private String senha;
	private int numGerenciados;
	
	public Gerente(String nome, String sobrenome, String cpf, double salario, String senha) {
		super(nome, sobrenome, cpf, salario);
		this.senha = senha;
		this.numGerenciados = 0;
	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getNumGerenciados() {
		return this.numGerenciados;
	}
	public void setNumGerenciados(int numGerenciados) {
		this.numGerenciados = numGerenciados;
	}
}
