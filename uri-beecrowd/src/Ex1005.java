import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1005 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            DecimalFormat decimal = new DecimalFormat("0.00000");

            double a = entrada.nextDouble();
            double b = entrada.nextDouble();

            double media = ((a * 3.5) + (b * 7.5)) / 11; // erro de interpretação: media ponderada;

            System.out.println("MEDIA = " + decimal.format(media));
            // System.out("\n");
        }
    }
