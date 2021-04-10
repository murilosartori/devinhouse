package exercicio15;

public class Quadrilatero {
	protected Ponto pontoA;
    protected Ponto pontoB;
    protected Ponto pontoC;
    protected Ponto pontoD;

    public Quadrilatero(Ponto pontoA, Ponto pontoB, Ponto pontoC, Ponto pontoD) {
        this.pontoA = pontoA;
        this.pontoB = pontoB;
        this.pontoC = pontoC;
        this.pontoD = pontoD;
    }

    public double getSegmento(Ponto ponto1, Ponto ponto2) {
        return Math.sqrt(Math.pow((ponto2.getCoordenadaX() - ponto1.getCoordenadaX()),2) + Math.pow((ponto2.getCoordenadaY() - ponto1.getCoordenadaY()), 2));
    }

    public double calculaArea() {
        return getSegmento(pontoA, pontoB) * getSegmento(pontoB, pontoC);
    }
}
