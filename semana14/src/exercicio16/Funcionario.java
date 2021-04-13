package exercicio16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Funcionario {
	private String nome;
    private String sobrenome;
    private String CPF;
    private LocalDate nascimento;

    public Funcionario(String nome, String sobrenome, String CPF, String nascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.nascimento = parseNascimento(nascimento);
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
    
    public LocalDate getNascimento() {
    	return this.nascimento;
    }
    public void setNascimento(String data) {
    	this.nascimento = parseNascimento(data);
    }
    private LocalDate parseNascimento(String data) {
    	return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nSobrenome: %s%nCPF: %s", this.nome, this.sobrenome, this.CPF);
    }
    
    public abstract double calcularSalarioMensal();
}
