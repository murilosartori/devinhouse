package exercicio10;

public class TesteFatura {

	public static void main(String[] args) {
        Fatura fatura = new Fatura("FT0001", "Fatura de Michael Nascimento", 20, 22.90);

        System.out.printf("Número: %s%n", fatura.getNumero());
        System.out.printf("Descrição: %s%n", fatura.getDescricao());
        System.out.printf("Quantidade de Itens: %d%n", fatura.getItemQuantidade());
        System.out.printf("Valor por item: %.2f%n%n", fatura.getItemPreco());

        fatura.setItemPreco(0.00);
        System.out.printf("Fatura: %.2f%n", fatura.getValorFatura());
        fatura.setItemPreco(-1);
        System.out.printf("Fatura: %.2f%n%n", fatura.getValorFatura());
        fatura.setItemPreco(22.90);

        fatura.setItemQuantidade(0);
        System.out.printf("Fatura: R$ %.2f%n", fatura.getValorFatura());
        System.out.printf("Fatura: R$ %.2f%n%n", fatura.getValorFatura());
        fatura.setItemQuantidade(20);

        System.out.printf("Fatura: %.2f%n", fatura.getValorFatura());
	}

}
