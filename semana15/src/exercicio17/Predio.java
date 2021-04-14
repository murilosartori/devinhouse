package exercicio17;

public class Predio implements PegadaCarbono {
	private Combustivel combustivel;
	
	public Predio(Combustivel tipoCombustivel) {
		this.combustivel = tipoCombustivel;
	}

	@Override
	public double getPegadaCarbono() {
		if (combustivel == Combustivel.ELETRICA) {
            return 12.5;
        } else {
            return 0.00;
        }
	}
}
