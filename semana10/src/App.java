// import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
// import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        //Exercicio 2
        // System.out.println("Olá, Mundo!");

        //Exercicio 3
        // Random aleatorio = new Random();
        // System.out.println(aleatorio.nextInt(2));

        //Exercicio 4
        // Calendar data = Calendar.getInstance();
        // int hora = data.get(Calendar.HOUR_OF_DAY);
        // int minuto = data.get(Calendar.MINUTE);
        // if(hora >= 0 && hora < 12){
		// 	System.out.printf("Bom Dia, no momento são %d:%d", hora, minuto);
		// }else if(hora > 12 && hora < 18){
		// 	System.out.printf("Boa Tarde, no momento são %d:%d", hora, minuto);
		// }else{
        //     System.out.println(data);
        //     System.out.printf("Boa Noite, no momento são %d:%d", hora, minuto);
        // }
        
        //Exercicio 5
        // Locale local = Locale.getDefault();
        // System.out.println(local.getDisplayLanguage());

        //Exercicio 7
        // Scanner dados = new Scanner(System.in);
        // System.out.print("Qual o seu sobrenome: ");
        // String sobrenome = dados.nextLine();
        // System.out.print("Qual o seu nome: ");
        // String nome = dados.nextLine();
        // System.out.printf("%nBem vindo %s %s",nome, sobrenome);

        //Exercicio 8
        // Scanner dados = new Scanner(System.in);
        // System.out.print("Informe um número com casas decimais: ");
        // double numDecimal = Double.parseDouble(dados.nextLine());
        // int resultInteiro = (int) numDecimal;
        // System.out.printf("O valor inteiro do número informado: %d", resultInteiro);

        //Exercicio 9
        // Scanner dados = new Scanner(System.in);
        // System.out.print("Informe uma palavra qualquer: ");
        // String palavra = dados.nextLine();
        // System.out.printf("A palavra informada possui %s caracteres", palavra.length());

        //Exercicio 10
        Scanner dados = new Scanner(System.in);
        System.out.print("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        int numero = dados.nextInt();
        if (numero >= 1 && numero <= 5) {
            Random aleatorio = new Random();
            int numAleatorio = aleatorio.nextInt(6);
            if (numAleatorio == numero) {
                System.out.print("Você acertou!");
            } else {
                System.out.printf("Você errou, o número correto era %d", numAleatorio);
            }
        } else {
            System.out.print("Solicitei um número entre 1 e 5!");
        }
    }
}
