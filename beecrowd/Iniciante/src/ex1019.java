import java.util.Scanner;

public class ex1019 {
    public static void main (String[] Args) {

        Scanner input = new Scanner(System.in);

        int value = input.nextInt();
        // refazer código
        int hours = value /3600;
        int minutes = (value % 3600) / 60;
        int seconds = (value % 3600) % 60;

//        System.out.println(value / 3600 + ":" + ((value % 3600) / 60) + ":" + (((value % 3600) % 60)));
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
