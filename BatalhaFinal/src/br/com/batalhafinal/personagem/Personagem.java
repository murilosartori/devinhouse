package br.com.batalhafinal.personagem;

public abstract class Personagem {
	private int pontosDeSaude;
	private	int pontosDeAtaque;
	private	int pontosDeDefesa;
	
	public Personagem(int saude, int ataque, int defesa) {
		this.pontosDeSaude = saude;
		this.pontosDeAtaque = ataque;
		this.pontosDeDefesa = defesa;
	}
}
