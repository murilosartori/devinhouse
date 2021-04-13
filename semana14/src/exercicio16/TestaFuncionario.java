package exercicio16;

public class TestaFuncionario {

	public static void main(String[] args) {
		//Funcionario funcionario = new Funcionario("Carlos", "Alberto", "1");
        //System.out.println(funcionario.toString());
        //System.out.println("");

        FuncionarioComissionado comissionado = new FuncionarioComissionado("Alberto", "Roberto", "2", "01/01/1980", 50000, 0.5);
        System.out.println(comissionado.toString());
        System.out.printf("Ganhos: R$ %.2f%n", comissionado.ganhos());
        System.out.println("");
        
        FuncionarioHorista horista = new FuncionarioHorista("Rubens", "Braga", "3", "01/01/1980", 113, 50);
        System.out.println(horista.toString());
        System.out.printf("Ganhos: R$ %.2f%n", horista.ganhos());
	}

}
