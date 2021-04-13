package exercicio16;

public abstract class Funcionario {
	private String nome;
    private String sobrenome;
    private String CPF;

    public Funcionario(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }
    
    public String getNome() {
    	return this.nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getSobrenome() {
    	return this.sobrenome;
    }
    public void setSobrenome(String sobrenome) {
    	this.sobrenome = sobrenome;
    }
    
    public String getCPF() {
    	return this.CPF;
    }
    public void setCPF(String cpf) {
    	this.CPF = cpf;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nSobrenome: %s%nCPF: %s", this.nome, this.sobrenome, this.CPF);
    }
    
    public abstract double calcularSalarioMensal();
}
