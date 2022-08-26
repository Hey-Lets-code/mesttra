import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;

        Scanner entrada = new Scanner(System.in);

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        diferenca = ((a * b) - (c * d));

        System.out.println("DIFERENCA = " + diferenca);
    }
}
