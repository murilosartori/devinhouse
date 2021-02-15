// import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
// import java.util.Random;
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
        // Scanner dados = new Scanner(System.in);
        // System.out.print("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        // int numero = dados.nextInt();
        // if (numero >= 1 && numero <= 5) {
        //     Random aleatorio = new Random();
        //     int numAleatorio = aleatorio.nextInt(6);
        //     if (numAleatorio == numero) {
        //         System.out.print("Você acertou!");
        //     } else {
        //         System.out.printf("Você errou, o número correto era %d", numAleatorio);
        //     }
        // } else {
        //     System.out.print("Solicitei um número entre 1 e 5!");
        // }

        //Exercicio 11
        // Scanner dados = new Scanner(System.in);
        // System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        // String dataNascimento = dados.nextLine();
        // DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Date dataNascInput = null;
        // try {
        //     dataNascInput= sdf.parse(dataNascimento);
        // } catch (Exception e) {}
        // Calendar dateOfBirth = new GregorianCalendar();
        // dateOfBirth.setTime(dataNascInput);
        // Calendar today = Calendar.getInstance();
        // int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        // dateOfBirth.add(Calendar.YEAR, age);
        // if (today.before(dateOfBirth)) {
        //     age--;
        // }
        // System.out.printf("Você tem %d anos", age);

        //Exercicio 12
        // Scanner dados = new Scanner(System.in);
        // System.out.print("Insira um número inteiro: ");
        // int numero = dados.nextInt();
        // System.out.printf("O número informado é %s", (numero % 2 == 0 ? "PAR" : "ÍMPAR"));

        //Exercicio 13
        // Scanner dados = new Scanner(System.in);
        // System.out.println("Insira as 3 notas do aluno abaixo (separar por ponto as casas decimais)");
        // System.out.print("Insira a primeira Nota: ");
        // double nota1 = Double.parseDouble(dados.nextLine());
        // System.out.print("Insira a segunda Nota: ");
        // double nota2 = Double.parseDouble(dados.nextLine());
        // System.out.print("Insira a terceira Nota: ");
        // double nota3 = Double.parseDouble(dados.nextLine());
        // double mediaFinal = (nota1 + nota2 + nota3) / 3;
        // System.out.printf("Média final do aluno: %.2f", mediaFinal);

        //Exercicio 14
        // Scanner dados = new Scanner(System.in);
        // System.out.println("Em \"Operação\" escreva uma das opções a seguir: somar, subtrair, multiplicar ou dividir");
        // System.out.print("Número 1: ");
        // double num1 = Double.parseDouble(dados.nextLine());
        // System.out.print("Número 2: ");
        // double num2 = Double.parseDouble(dados.nextLine());
        // System.out.print("Operação: ");
        // String operacao = dados.nextLine();
        // double resultado = 0;
        // boolean erro = false;
        // if (operacao.equals("somar")) {
        //     resultado = num1 + num2;
        // } else if (operacao.equals("subtrair")) {
        //     resultado = num1 - num2;
        // } else if (operacao.equals("multiplicar")) {
        //     resultado = num1 * num2;
        // } else if (operacao.equals("dividir")) {
        //     if (num2 > 0) {
        //         resultado = num1 / num2;
        //     } else {
        //         erro = true;
        //         System.out.print("Não é possível dividir por 0(zero).");
        //     }
        // } else {
        //     erro = true;
        //     System.out.print("Operação não encontrada.");
        // }
        // if (!erro) {
        //     System.out.printf("Média final do aluno: %.2f", resultado);
        // }

        //Exercicio 16
        // Scanner dados = new Scanner(System.in);
        // System.out.println("Calculadora de PA ou PG");
        // System.out.print("Insira o valor inicial: ");
        // int num = Integer.parseInt(dados.nextLine());
        // System.out.print("Insira o valora da raiz: ");
        // int raiz = Integer.parseInt(dados.nextLine());
        // System.out.print("Você deseja calcular os 10 primeiros resultados de uma PA ou PG: ");
        // String operacao = dados.nextLine();
        // String resultado = String.valueOf(num);
        // if (operacao.equalsIgnoreCase("PA")) {
        //     for (int pa = 1; pa < 10; pa++){
        //         num = num + raiz;
        //         resultado += ", " + String.valueOf(num);
        //     }
        // } else if (operacao.equalsIgnoreCase("PG")) {
        //     for (int pa = 1; pa < 10; pa++){
        //         num = num * raiz;
        //         resultado += ", " + String.valueOf(num);
        //     }
        // }
        // System.out.printf("O resultado da operação \"%s\" foi: %s", operacao, resultado);

        //Exercicio 17
        Scanner dados = new Scanner(System.in);
        System.out.println("Vamos calcular o fatorial de um número de 0 a 10");
        System.out.print("Insira um número inteiro de 0 a 10: ");
        int num = Integer.parseInt(dados.nextLine());
        int decremento = 1;
        String resultado = "";
        if (num >= 0 && num <= 10) {
            if (num == 0 || num == 1) {
                resultado = "1";
            } else {
                for (int d = num; d > 1; d--) {
                    decremento *= d;
                }
                resultado = String.valueOf(decremento);
            }
        }
        System.out.printf("O fatorial do número \"%d!\" é: %s", num, resultado);

    }
}
