package soma_simples;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);
    }
}
