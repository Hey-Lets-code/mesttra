package areaDoCirculo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo_2 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.000");

        float n = 3.14159f;
        double raio = entrada.nextDouble();
        double area = n * (raio * raio);

        System.out.println("A = " + decimal.format(area));
    }
}
