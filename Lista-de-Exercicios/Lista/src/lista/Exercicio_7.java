package lista;
import java.util.Scanner;
/*
Leia uma temperatura em graus Celsius
e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F
a temperatura em Fahrenheit e C a temperatura emCelsius;
*/
public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double temperatura = entrada.nextDouble();
        double conversao = (9 * temperatura + 160)/5;

        System.out.println("Temperatura em Celsius: " + temperatura + "º");
        System.out.println("Temperatura em Fahrenheit: " + conversao + "º");

    }
}
