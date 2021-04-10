package exercicio15;

public class Ponto {
	private double coordenadaX;
	private double coordenadaY;
	
	public Ponto(double x, double y) {
		this.coordenadaX = x;
		this.coordenadaY = y;
	}
	
	public double getCoordenadaX() {
		return this.coordenadaX;
	}
	public void setCoordenadaX(double x) {
		this.coordenadaX = x;
	}
	
	public double getCoordenadaY() {
		return this.coordenadaY;
	}
	public void setCoordenadaY(double y) {
		this.coordenadaY = y;
	}
}
