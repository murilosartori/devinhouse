package exercicio16;

import java.time.LocalDate;

public class FolhaPagamento {

	public static void main(String[] args) {
		FuncionarioAssalariado assalariado = new FuncionarioAssalariado("Almir", "Silva", "1", "12/04/1980", 2500);
		FuncionarioHorista horista = new FuncionarioHorista("Rosamaria", "Lima", "2", "01/01/1993", 113, 50);
		FuncionarioComissionado comissionado = new FuncionarioComissionado("Antonio", "Carlos", "3", "25/09/1989", 25000, 0.5);
		FuncionarioPorPeca porpeca = new FuncionarioPorPeca("José", "Antonio", "4", "23/07/2000", 10, 25);

		System.out.printf("Assalariado%n%s%nSalário: R$ %.2f.%n%n", assalariado, assalariado.calcularSalarioMensal());
		System.out.printf("Horista%n%s%nSalário: R$ %.2f.%n%n", horista, horista.calcularSalarioMensal());
		System.out.printf("Comissionado%n%s%nSalário: R$ %.2f.%n%n", comissionado, comissionado.calcularSalarioMensal());
		System.out.printf("Por Peça%n%s%nSalário: R$ %.2f.%n%n", porpeca, porpeca.calcularSalarioMensal());

		Funcionario[] funcionarios = new Funcionario[4];
		funcionarios[0] = assalariado;
		funcionarios[1] = horista;
		funcionarios[2] = comissionado;
		funcionarios[3] = porpeca;

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
