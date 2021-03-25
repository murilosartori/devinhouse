package exercicio16;

public class PessoaFisica {
	private String nome;
	private String cpf;
	private String endereco;
	
	public PessoaFisica(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		if (!cpf.isEmpty()) {
			this.cpf = cpf;
		} else {
			this.cpf = "0";
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if (!cpf.isEmpty()) {
			this.cpf = cpf;
		}
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
