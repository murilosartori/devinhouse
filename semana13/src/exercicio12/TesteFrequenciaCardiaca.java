package exercicio12;

import java.util.Scanner;

public class TesteFrequenciaCardiaca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        FrequenciaCardiaca cliente = new FrequenciaCardiaca();

        System.out.print("Informe seu primeiro nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Agora informe seu sobrenome: ");
        cliente.setSobrenome(scanner.nextLine());
        System.out.print("Nascimento (dd/mm/aaaa):");
        cliente.setDataNascimento(scanner.nextLine());

        System.out.printf("%n%s, voc� tem %d anos. Sua frequ�ncia card�aca m�xima � %d e sua frequ�ncia ideal � %d",
        		cliente.getNome(),
                cliente.getIdade(),
                cliente.getFrequenciaMaxima(),
                cliente.getFrequenciaAlvo());
	}

}
