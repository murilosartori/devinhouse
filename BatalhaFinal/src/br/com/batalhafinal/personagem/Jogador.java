package br.com.batalhafinal.personagem;

import br.com.batalhafinal.enums.Arma;
import br.com.batalhafinal.enums.Motivacao;

public abstract class Jogador extends Personagem implements Atacante {
	private String nome;
	private Motivacao motivacao;
	private Arma arma;
	private String sexo;
	private final static int SAUDEMAXIMA = 200;

	public Jogador(int saude, int ataque, int defesa, String nome, Motivacao motivacao, Arma arma, String sexo) {
		super(saude, ataque, defesa);
		this.nome = validarNome(nome);
		this.motivacao = motivacao;
		this.arma = arma;
		this.sexo = validarSexo(sexo);
	}

	private static String validarNome(String nome) {
		if (nome.isEmpty()) {
			throw new RuntimeException("Nome inválido.");
		}
		return nome;
	}

	private static String validarSexo(String sexo) {
		if (sexo.isEmpty()) {
			throw new RuntimeException("Informe um sexo válido \"M\" ou \"F\".");
		}
		if (sexo.equals("M") || sexo.equals("F")) {
			return sexo;
		} else {
			throw new RuntimeException("Informe um sexo válido \"M\" ou \"F\".");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = validarNome(nome);
	}
	
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.nome = validarSexo(sexo);
	}
	
	public Motivacao getMotivacao() {
		return this.motivacao;
	}
	public void setMotivacao(Motivacao motivacao) {
		this.motivacao = motivacao;
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
