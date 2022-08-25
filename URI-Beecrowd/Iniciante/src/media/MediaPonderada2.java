package media;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MediaPonderada2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double media = ((a * 2) + (b * 3) + (c * 5))/10;

        System.out.println("MEDIA = " + decimal.format(media));
    }
}
