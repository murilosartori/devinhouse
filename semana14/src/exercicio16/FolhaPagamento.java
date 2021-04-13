package exercicio16;

import java.time.LocalDate;

public class FolhaPagamento {

	public static void main(String[] args) {
		FuncionarioAssalariado assalariado = new FuncionarioAssalariado("Almir", "Silva", "1", "12/04/1980", 2500);
		FuncionarioHorista horista = new FuncionarioHorista("Rosamaria", "Lima", "2", "01/01/1993", 113, 50);
		FuncionarioComissionado comissionado = new FuncionarioComissionado("Antonio", "Carlos", "3", "25/09/1989", 25000, 0.5);

		System.out.printf("Assalariado: %s%nSalário: R$ %.2f.%n%n", assalariado, assalariado.calcularSalarioMensal());
		System.out.printf("Horista: %s%nSalário: R$ %.2f.%n%n", horista, horista.calcularSalarioMensal());
		System.out.printf("Comissionado: %s%nSalário: R$ %.2f.%n%n", comissionado, comissionado.calcularSalarioMensal());

		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = assalariado;
		funcionarios[1] = horista;
		funcionarios[2] = comissionado;

		double totalFolha = 0;
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getNascimento().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
				totalFolha += funcionario.calcularSalarioMensal() + 100.00;
            } else {
            	totalFolha += funcionario.calcularSalarioMensal();
            }
		}
		System.out.printf("Total de gasto com Folha: R$ %.2f", totalFolha);
	}

}
