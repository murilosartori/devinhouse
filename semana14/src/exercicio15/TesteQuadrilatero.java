package exercicio15;

public class TesteQuadrilatero {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(
				new Ponto(2, 2),
                new Ponto(2, 4),
                new Ponto(6, 2),
                new Ponto(6, 4)
        );

        Quadrado quadrado = new Quadrado(
                new Ponto(2, 2),
                new Ponto(2, 4),
                new Ponto(4, 2),
                new Ponto(4, 4)
        );

        Trapezio trapezio = new Trapezio(
                new Ponto(2, 2),
                new Ponto(2, 6),
                new Ponto(3, 4),
                new Ponto(5, 4)
        );

        Paralelogramo paralelogramo = new Paralelogramo(
                new Ponto(1, 1),
                new Ponto(3, 5),
                new Ponto(7, 5),
                new Ponto(5, 1)
        );

        System.out.printf("Área do Retângulo: %.2f.%n", retangulo.calculaArea());
        System.out.printf("Área do Quadrado: %.2f.%n", quadrado.calculaArea());
        System.out.printf("Área do Trapézio: %.2f.%n", trapezio.calculaArea());
        System.out.printf("Área do Paralelogramo: %.2f.%n", paralelogramo.calculaArea());
	}

}
