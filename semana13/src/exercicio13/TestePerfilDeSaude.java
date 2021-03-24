package exercicio13;

public class TestePerfilDeSaude {

	public static void main(String[] args) {
        PerfilDeSaude cliente = new PerfilDeSaude("Fulano", "de Tal", "masculino", "01/01/1980", 1.85, 85);

        System.out.printf("Nome completo: %s %s%n", cliente.getNome(), cliente.getSobrenome());
        System.out.printf("Data de nascimento: %s%n", cliente.getDataNascimento());
        System.out.printf("Idade: %d anos%n", cliente.getIdade());
        System.out.printf("Sexo: %s%n", cliente.getSexo());
        System.out.printf("Peso: %.2f Kg%n", cliente.getPeso());
        System.out.printf("Altura: %.2f%n", cliente.getAltura());
        System.out.printf("IMC: %.1f%n", cliente.getIMC());
        System.out.printf("Frequência cardíaca máxima: %d%n", cliente.getFrequenciaMaxima());
        System.out.printf("Frequência cardíaca ideal: %s", cliente.getFaixaFrequenciaAlvo());
	}

}
