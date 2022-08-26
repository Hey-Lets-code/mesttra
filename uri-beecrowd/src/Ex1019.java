import java.util.Scanner;

public class Ex1019 {
    public static void main (String[] Args) {
        int value, hours, minutes, seconds;

        Scanner input = new Scanner(System.in);

        value = input.nextInt();
        // refazer código
        hours = value /3600;
        minutes = (value % 3600) / 60;
        seconds = (value % 3600) % 60;

//        System.out.println(value / 3600 + ":" + ((value % 3600) / 60) + ":" + (((value % 3600) % 60)));
        System.out.println(hours + ":" + minutes + ":" + seconds);

        input.close();
    }
}
