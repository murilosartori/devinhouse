package exercicio14;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		
		retangulo.setComprimento(4.56);
		retangulo.setLargura(2.6);
		System.out.println(String.format("A �rea do retangulo �: %.2f", retangulo.calculaArea()));
		System.out.println(String.format("O perimetro do retangulo �: %.2f", retangulo.calculaPerimetro()));
		
		retangulo.setComprimento(15);
		retangulo.setLargura(5);
		System.out.println(String.format("A �rea do retangulo �: %.2f", retangulo.calculaArea()));
		System.out.println(String.format("O perimetro do retangulo �: %.2f", retangulo.calculaPerimetro()));
	}

}
