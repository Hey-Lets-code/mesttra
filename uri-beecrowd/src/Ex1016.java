import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        int distance, distanceBetween;

        Scanner input = new Scanner(System.in);

        distance = input.nextInt();
        distanceBetween = distance * 2;

        System.out.println(distanceBetween + " minutos");

        input.close();
    }
}
