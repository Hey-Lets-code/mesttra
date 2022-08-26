import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1036 {
    public static void main (String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        delta = Math.sqrt((b * b) -  4 * a * c);

        x1 = (-b + delta) / (2 * a);
        x2 = (-b - delta) / (2 * a);


        if ((a == 0) || (b * b - 4 * a * c < 0)) {
            System.out.println("Impossivel calcular");
        } else  {
//            System.out.println(String.format("R1 = %.5f", x1));
//            System.out.println(String.format("R2 = %.5f", x2));
            System.out.println("R1 = " + df.format(x1));
            System.out.println("R2 = " + df.format(x2));
        }
        input.close();
    }
}


