package exercicio6;

public class Porta {
	String cor;
	double largura;
	double altura;
	double profundidade;
	boolean aberta;
	
	public void abre() {
		this.aberta = true;
	}
	
	public void fecha() {
		this.aberta = false;
	}
	
	public void pinta(String cor) {
		this.cor = cor;
	}
	
	public boolean estaAberta() {
		return this.aberta;
	}
}
