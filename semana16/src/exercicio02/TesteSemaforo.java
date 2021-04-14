package exercicio02;

public class TesteSemaforo {

	public static void main(String[] args) {
		Semaforo verde = Semaforo.VERDE;
        Semaforo amarelo = Semaforo.AMARELO;
        Semaforo vermelho = Semaforo.VERMELHO;

        Semaforo[] semaforos = new Semaforo[3];
        semaforos[0] = verde;
        semaforos[1] = amarelo;
        semaforos[2] = vermelho;

        for (Semaforo semaforo : semaforos) {
            System.out.printf("Sinal: %s%nDuração: %d milisegundos%n%n", semaforo, semaforo.getDuracao());
        }
	}

}
