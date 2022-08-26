import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner entrada = new Scanner(System.in);

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        entrada.close();

        if (a >= b && a >= c) {
            System.out.println(a + " eh o maior");
        } else if (b >= a && b >= c) {
            System.out.println(b + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }
    }
}
