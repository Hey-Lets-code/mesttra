package diferenca;
import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        // DIFERENCA = (A * B - C * D).
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        int diferenca = ((a *  b) - (c * d));

        System.out.println("DIFERENCA = " + diferenca);
    }
}
