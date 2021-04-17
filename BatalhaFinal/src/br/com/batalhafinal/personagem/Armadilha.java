package br.com.batalhafinal.personagem;

import br.com.batalhafinal.enums.Arma;

public class Armadilha implements Atacante {
	private Arma arma;
	private int pontosDeAtaque;

	public Armadilha() {
		this.arma = Arma.ARMADILHA;
		this.pontosDeAtaque = 5;
	}

	public Arma getArma() {
		return this.arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public int getPontoDeAtaque() {
		return this.pontosDeAtaque;
	}
	public void setPontoDeAtaque(int ataque) {
		this.pontosDeAtaque = ataque;
	}
	
	@Override
	public void atacar(Personagem personagem) {
		// Armadilha deve possuir os atributos pontosDeAtaque e arma
		
	}
}
