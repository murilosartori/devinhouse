package br.com.batalhafinal.personagem;

import br.com.batalhafinal.enums.Arma;
import br.com.batalhafinal.enums.Motivacao;

public abstract class Inimigo extends Personagem implements Atacante {
	private Arma arma;

	public Inimigo(int saude, int ataque, int defesa, Arma arma) {
		super(saude, ataque, defesa);
		this.arma = arma;
	}

	public Arma getArma() {
		return this.arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@Override
	public void atacar(Personagem personagem) {
		// TODO Auto-generated method stub
	}
}
