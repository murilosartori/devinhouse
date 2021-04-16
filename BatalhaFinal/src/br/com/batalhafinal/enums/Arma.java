package br.com.batalhafinal.enums;

public enum Arma {
	ESPADA(8), MACHADO(8), MARTELO(8), CLAVA(8), ARCO(8), BESTA(8), CAJADO(8), LIVRODEMAGIAS(8), ARMADILHA(1),
	MACHADODUPLO(1);

	private int ataque;
	
	private Arma(int ataque) {
		this.ataque = ataque;
	}
	
	public int getAtaque() {
		return this.ataque;
	}
}
