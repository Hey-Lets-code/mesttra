import java.util.Scanner;
import java.text.DecimalFormat;

public class ex1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimalUmaCasa = new DecimalFormat("0.000");

        int x = entrada.nextInt();
        double y = entrada.nextDouble();

        double consumoMedio = x/y;

        System.out.println(decimalUmaCasa.format(consumoMedio) + " km/l");


    }

}
