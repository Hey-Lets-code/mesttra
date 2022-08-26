import java.util.Scanner;

public class Ex1012 {
    public static void main (String[] args) {
        final float n;
        double raio, area;

        Scanner entrada = new Scanner(System.in);

        n = 3.14159f;
        raio = entrada.nextDouble();
        area = n * (raio * raio);

        System.out.format("A=%.4f\n" , area);

        entrada.close();
    }
}
