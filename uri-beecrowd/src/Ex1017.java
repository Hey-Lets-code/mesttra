import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        int travelTime, averageSpeed;
        double fuelExpense;

        DecimalFormat df = new DecimalFormat("0.000");
        Scanner input = new Scanner(System.in);

        travelTime = input.nextInt();
        averageSpeed = input.nextInt();

        fuelExpense = (travelTime * averageSpeed);

        System.out.println(df.format(fuelExpense/12));
        input.close();
    }
}
