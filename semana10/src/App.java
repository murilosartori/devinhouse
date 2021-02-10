import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Mundo!");

        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(2));
    }
}
