package exercicio6;

public class TestaPorta {

	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.cor = "marrom";
		porta.aberta = false;
		porta.largura = 0.80D;
		porta.altura = 1.70D;
		porta.profundidade = 0.20D;
		
		porta.abre();
		System.out.println(String.format("A porta está %s", (porta.estaAberta() ? "Aberta" : "Fechada")));
		porta.fecha();
		System.out.println(String.format("A porta está %s%n", (porta.estaAberta() ? "Aberta" : "Fechada")));
		
		porta.pinta("branca");
		System.out.println(String.format("A cor da porta é %s", porta.cor));
		porta.pinta("cinza");
		System.out.println(String.format("A cor da porta é %s%n", porta.cor));

		porta.largura = 0.70D;
		System.out.println(String.format("A largura da porta é %.2f", porta.largura));
		porta.altura = 1.90D;
		System.out.println(String.format("A largura da porta é %.2f", porta.altura));
		porta.profundidade = 0.30D;
		System.out.println(String.format("A largura da porta é %.2f%n", porta.profundidade));
		
		porta.largura = 0.90D;
		System.out.println(String.format("A largura da porta é %.2f", porta.largura));
		porta.altura = 2.00D;
		System.out.println(String.format("A largura da porta é %.2f", porta.altura));
		porta.profundidade = 0.25D;
		System.out.println(String.format("A largura da porta é %.2f", porta.profundidade));
	}
}
