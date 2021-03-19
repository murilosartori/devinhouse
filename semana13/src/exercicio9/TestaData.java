package exercicio9;

public class TestaData {

	public static void main(String[] args) {
		Data data = new Data(19, 3, 2021);
		
		System.out.println(String.format("Dia: %d", data.getDia()));
		System.out.println(String.format("Mês: %d", data.getMes()));
		System.out.println(String.format("Ano: %d%n", data.getAno()));
		
		data.setDia(20);
		data.setMes(3);
		data.setAno(2021);
		
		System.out.println(String.format("Data: %s", data.exibirData()));
	}

}
