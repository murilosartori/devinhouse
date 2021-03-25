package exercicio14;

public class Retangulo {
	private double comprimento;
	private double largura;
	
	public Retangulo() {
		this.comprimento = 1;
		this.largura = 1;
	}
	
	public double getComprimento() {
		return this.comprimento;
	}
	public void setComprimento(double comp) {
		if (comp > 0 && comp < 20) {
			this.comprimento = comp;
		}
	}
	
	public double getLargura() {
		return this.largura;
	}
	public void setLargura(double larg) {
		if (larg > 0 && larg < 20) {
			this.largura = larg;
		}
	}
	
	public double calculaArea() {
		return this.comprimento * this.largura;
	}
	
	public double calculaPerimetro() {
		return 2 * (this.comprimento + this.largura);
	}
}
