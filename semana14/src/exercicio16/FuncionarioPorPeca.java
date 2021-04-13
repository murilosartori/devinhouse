package exercicio16;

public class FuncionarioPorPeca extends Funcionario {
	private int qtdPecas;
	private double salarioPorPeca;
	
	public FuncionarioPorPeca(String nome, String sobrenome, String CPF, String nascimento, int qtdPecas, double salarioPeca) {
		super(nome, sobrenome, CPF, nascimento);
		this.qtdPecas = qtdPecas;
		this.salarioPorPeca = salarioPeca;
	}
	
	public int getQtdPecas() {
		return this.qtdPecas;
	}
	public void setQtdPecas(int qtdPecas) {
		this.qtdPecas = qtdPecas;
	}
	
	public double getSalarioPorPeca() {
		return this.salarioPorPeca;
	}
	public void setQtdPecas(double salarioPeca) {
		this.salarioPorPeca = salarioPeca;
	}
	
	@Override
	public double calcularSalarioMensal() {
		return this.getQtdPecas() * this.getSalarioPorPeca();
	}
	
	@Override
	public String toString() {
		return String.format("%s%nQuantidade Peças: %d%nSalário por peça: R$ %.2f", super.toString(), this.getQtdPecas(), this.getSalarioPorPeca());
	}
}
