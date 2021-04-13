package exercicio16;

public class FuncionarioHorista extends Funcionario {
	private double horasTrabalhadas;
    private double salarioHora;

    public FuncionarioHorista(String nome, String sobrenome, String CPF, double horasTrabalhadas, double salarioHora) {
        super(nome, sobrenome, CPF);
        this.horasTrabalhadas = validaHoras(horasTrabalhadas);
        this.salarioHora = validaSalario(salarioHora);
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = validaHoras(horasTrabalhadas);
    }

    public double getSalarioHora() {
        return this.salarioHora;
    }
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = validaSalario(salarioHora);
    }

    private double validaSalario(double salario) {
        return Math.max(salario, 0.00);
    }

    private double validaHoras(double horas) {
        if(horas >=0 && horas <= 168) {
            return horas;
        } else {
            return 0;
        }
    }

    public double ganhos() {
        return horasTrabalhadas * salarioHora;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nSobrenome: %s%nCPF: %s%nHoras Trabalhadas: %.2f%nSalário (por hora): R$ %.2f", this.getNome(), this.getSobrenome(), this.getCPF(), this.horasTrabalhadas, this.salarioHora);
    }
    
    @Override
    public double calcularSalarioMensal() {
    	return this.getHorasTrabalhadas() * this.getSalarioHora();
    }
}
