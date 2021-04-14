package exercicio02;

public enum Semaforo {
	VERDE(10000),
	AMARELO(1000),
	VERMELHO(15000);
	
	private final int DURACAO;
	
	private Semaforo(int duracao) {
		this.DURACAO = duracao;
	}
	
	public int getDuracao() {
		return this.DURACAO;
	}
}
