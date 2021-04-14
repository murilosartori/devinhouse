package exercicio17;

public class TestaCarbono {

	public static void main(String[] args) {
		Carro car = new Carro(Combustivel.GASOLINA);
		Moto moto = new Moto(Combustivel.GASOLINA);
		Predio predio = new Predio(Combustivel.ELETRICA);

		PegadaCarbono[] emissores = new PegadaCarbono[3];
        emissores[0] = car;
        emissores[1] = moto;
        emissores[2] = predio;

        for (PegadaCarbono emissor : emissores) {
            System.out.printf("Pegada Carbono: %.2f.%n", emissor.getPegadaCarbono());
        }
	}

}
