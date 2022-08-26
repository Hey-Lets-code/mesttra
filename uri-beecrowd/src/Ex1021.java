import java.util.Scanner;
import java.util.Locale;

public class Ex1021 {
    public static void main (String[] args) {
        int integerValue;
        double doubleValue;

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US); // pesquisar sobre esse assunto
        // serve para poder digitar com ponto;

        doubleValue = input.nextDouble();
        integerValue = 0;

        /* %.0f mostrar o valor inteiro, se for decimal ele irá arredondar
         %n é uma quebra de linha
        printf imprime uma string formatada
        %d reservando esse espaço para um número inteiro*/

        // pesquisar sobre: técnica casting, seleciona apenas a parte inteira;
        // downcast precisa ser explícito;

        System.out.println("NOTAS:");

        integerValue = (int) doubleValue / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n", integerValue);
        doubleValue = doubleValue % 100.0;

        integerValue = (int) doubleValue / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n", integerValue);
        doubleValue = doubleValue % 50.0;

        integerValue = (int) doubleValue / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n", integerValue);
        doubleValue = doubleValue % 20.0;

        integerValue = (int) doubleValue / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n", integerValue);
        doubleValue = doubleValue % 10.0;

        integerValue = (int) doubleValue / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n", integerValue);
        doubleValue = doubleValue % 5.0;

        integerValue = (int) doubleValue / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n", integerValue);
        doubleValue = doubleValue % 2;

        doubleValue = doubleValue * 100.0;

        System.out.println("MOEDAS:");
        integerValue = (int) doubleValue / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n", integerValue);
        doubleValue = doubleValue % 100.0;

        integerValue = (int) doubleValue / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", integerValue);
        doubleValue = doubleValue % 50.0;

        integerValue = (int) doubleValue / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", integerValue);
        doubleValue = doubleValue % 25.0;

        integerValue = (int) doubleValue / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", integerValue);
        doubleValue = doubleValue % 10.0;

        integerValue = (int) doubleValue / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", integerValue);
        doubleValue = doubleValue % 5.0;

        integerValue = (int) doubleValue / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", integerValue);

        input.close();


    }
}