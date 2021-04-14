package exercicio17;

public class Moto implements PegadaCarbono {
	private Combustivel combustivel;
	
	public Moto(Combustivel tipoCombustivel) {
		this.combustivel = tipoCombustivel;
	}

	@Override
	public double getPegadaCarbono() {
		if (combustivel == Combustivel.ELETRICA) {
            return 12.5;
        } else if (combustivel == Combustivel.ETANOL) {
            return 18.25;
        } else if (combustivel == Combustivel.GASOLINA) {
            return 25.00;
        } else {
            return 0.00;
        }
	}
}
