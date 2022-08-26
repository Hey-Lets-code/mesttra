import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1011 {
    public static void main(String[] args) {
        final double PI;
        double raio, valor;

        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.000");

        PI = 3.14159;

        raio = entrada.nextDouble();

        valor = (4/3.0) * PI * Math.pow(raio, 3);

        System.out.println("VOLUME = " + decimal.format(valor));
    }
}
