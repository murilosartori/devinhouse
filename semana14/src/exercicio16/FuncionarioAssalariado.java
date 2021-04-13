package exercicio16;

public class FuncionarioAssalariado extends Funcionario {
	private double salario;

    public FuncionarioAssalariado(String nome, String sobrenome, String CPF, double salario) {
        super(nome, sobrenome, CPF);
        this.salario = salario;
    }
    
    public double getSalario() {
    	return this.salario;
    }
    public void setSalario(double salario) {
    	this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nSobrenome: %s%nSalário: %.2f", this.getNome(), this.getSobrenome(), this.salario);
    }


    @Override
    public double calcularSalarioMensal() {
        return this.salario;
    }
}
