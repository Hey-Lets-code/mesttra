import java.util.Scanner;
import java.text.DecimalFormat;

public class ex1036 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fiveDecimalPlaces = new DecimalFormat("0.00000");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = Math.sqrt((b * b) -  4 * a * c);

        double x1 = (-b + delta) / (2 * a);
        double x2 = (-b - delta) / (2 * a);


        if ((a == 0) || (b * b - 4 * a * c < 0)) {
            System.out.println("Impossivel calcular");
        } else  {
//            System.out.println(String.format("R1 = %.5f", x1));
//            System.out.println(String.format("R2 = %.5f", x2));
            System.out.println("R1 = " + fiveDecimalPlaces.format(x1));
            System.out.println("R2 = " + fiveDecimalPlaces.format(x2));
        }


    }
}
