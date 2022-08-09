package areaDoCirculo;
import java.util.Scanner;

public class Circulo_3 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        float n = 3.14159f;
        double raio = entrada.nextDouble();
        double area = n * (raio * raio);

        System.out.format("A=%.4f\n" , area);
    }
}
