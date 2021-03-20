package exercicio11;

public class Funcionario {
	String nome;
    String sobrenome;
    double salarioMes;

    public Funcionario(String nome, String sobrenome, double salarioMes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMes = salarioMes > 0 ? salarioMes : 0;
    }

    public double salarioAnual() {
        return this.salarioMes * 12;
    }
    
    public void aumentoSalario(double porcentagem) {
    	this.salarioMes *= porcentagem;
    }
}
