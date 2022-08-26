import java.util.Scanner;

public class Ex1020 {
    public static void main (String[] Args) {
        int days, years, months;

        Scanner input = new Scanner(System.in);
        // refazer código
        days = input.nextInt(); // valor de entrada

        years = days / 365; // dividindo o total de dias em 365 para armazenar a quantidade de anos
        days = days % 365; //reatribuição de valor, a entrada passa a ser o resto da entrada dividido por 365

        months = days / 30; // agora o resto de 365 é dividido por 30 para representar os meses
        days = days % 30; // agora a entrada passa a ser o resto do número dividido por 30, representando a quantidade de dias

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

        input.close();
    }
}
