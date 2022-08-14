import java.util.Scanner;
import java.text.DecimalFormat;

public class ex1015 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimalQuatroCasas = new DecimalFormat("0.0000");

        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        double p1 = Math.pow((x2 - x1), 2);
        double p2 = Math.pow((y2 - y1), 2);

        double sumOfNumbers = Math.sqrt(p1 + p2);

        System.out.println(decimalQuatroCasas.format(sumOfNumbers));


        
    }
}
