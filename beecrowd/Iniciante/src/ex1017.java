import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1017 {
    public static void main(String[] args) {
        DecimalFormat decimalThreeSpace = new DecimalFormat("0.000");
        Scanner input = new Scanner(System.in);

        int travelTime = input.nextInt();
        int averageSpeed = input.nextInt();

        double fuelExpense = (travelTime * averageSpeed);

        System.out.println(decimalThreeSpace.format(fuelExpense/12));
    }
}
