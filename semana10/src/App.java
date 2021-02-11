// import java.util.Random;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Olá, Mundo!");

        // Random aleatorio = new Random();
        // System.out.println(aleatorio.nextInt(2));

        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int minuto = data.get(Calendar.MINUTE);
        if(hora >= 0 && hora < 12){
			System.out.printf("Bom Dia, no momento são %d:%d", hora, minuto);
		}else if(hora > 12 && hora < 18){
			System.out.printf("Boa Tarde, no momento são %d:%d", hora, minuto);
		}else{
            System.out.println(data);
            System.out.printf("Boa Noite, no momento são %d:%d", hora, minuto);
		}
    }
}
