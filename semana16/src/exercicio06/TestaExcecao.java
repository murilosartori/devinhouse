package exercicio06;

import java.io.IOException;

public class TestaExcecao {

	public static void main(String[] args) {

		try {
            throw new ExceptionA("Exceção A");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExceptionB("Exceção A");
        } catch (ExceptionB e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new IOException("Valor Nulo");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new NullPointerException("Valor Nulo");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

	}

}
