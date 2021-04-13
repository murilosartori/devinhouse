package exercicio08;

public class ManipuladorDeTributaveis {
	private double total;
	
	public double getTotal() {
		return this.total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void calculaImpostos(Tributavel[] tributaveis) {
		double soma = 0;
        for (Tributavel tributavel : tributaveis) {
            soma += tributavel.getValorImposto();
        }
        this.setTotal(soma);
    }
}
