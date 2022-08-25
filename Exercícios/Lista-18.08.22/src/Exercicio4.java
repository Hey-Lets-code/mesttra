import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            double numero;
            String divisaoPorZero;

            System.out.print("Informe o número para o cálculo da tabuada: ");
            numero = entrada.nextDouble();
            System.out.println();

            divisaoPorZero = "não existe divisão por zero";


            System.out.printf("Tabuada do + e - para o número %.0f \n", numero);
            System.out.printf("%.0f + 0 = %.0f \t \t", numero, (numero - numero));
            System.out.printf("%.0f - 0 = %.0f \n", numero, Math.abs((numero - numero)));

            System.out.printf("%.0f + 1 = %.0f \t \t", numero, (numero + 1));
            System.out.printf("%.0f - 1 = %.0f \n", numero, Math.abs((numero - 1)));

            System.out.printf("%.0f + 2 = %.0f \t \t", numero, (numero + 2));
            System.out.printf("%.0f - 2 = %.0f \n", numero, Math.abs((numero - 2)));

            System.out.printf("%.0f + 3 = %.0f \t \t", numero, (numero + 3));
            System.out.printf("%.0f - 3 = %.0f \n", numero, Math.abs((numero - 3)));

            System.out.printf("%.0f + 4 = %.0f \t \t", numero, (numero + 4));
            System.out.printf("%.0f - 4 = %.0f \n", numero, Math.abs((numero - 4)));

            System.out.printf("%.0f + 5 = %.0f \t \t", numero, (numero + 5));
            System.out.printf("%.0f - 5 = %.0f \n", numero, Math.abs((numero - 5)));

            System.out.printf("%.0f + 6 = %.0f \t \t", numero, (numero + 6));
            System.out.printf("%.0f - 6 = %.0f \n", numero, Math.abs((numero - 6)));

            System.out.printf("%.0f + 7 = %.0f \t \t", numero, (numero + 7));
            System.out.printf("%.0f - 7 = %.0f \n", numero, Math.abs((numero - 7)));

            System.out.printf("%.0f + 8 = %.0f \t \t", numero, (numero + 8));
            System.out.printf("%.0f - 8 = %.0f \n", numero, Math.abs((numero - 8)));

            System.out.printf("%.0f + 9 = %.0f \t \t", numero, (numero + 9));
            System.out.printf("%.0f - 9 = %.0f \n \n", numero, Math.abs((numero - 9)));


            System.out.printf("Tabuada de * e / para o número: %.0f \n", numero);
            System.out.printf("%.0f * 0 = %.0f \t \t", numero, (numero * 0));
            System.out.printf("%.0f / 0 = ", numero);
            System.out.println("não existe divisão por zero");

            System.out.printf("%.0f * 1 = %.0f \t \t", numero, (numero * 1));
            System.out.printf("%.0f / 1 = %.2f \n", numero, (numero / 1));

            System.out.printf("%.0f * 2 = %.0f \t \t", numero, (numero * 2));
            System.out.printf("%.0f / 2 = %.2f \n", numero, (numero / 2));

            System.out.printf("%.0f * 3 = %.0f \t \t", numero, (numero * 3));
            System.out.printf("%.0f / 3 = %.2f \n", numero, (numero / 3));

            System.out.printf("%.0f * 4 = %.0f \t \t", numero, (numero * 4));
            System.out.printf("%.0f / 4 = %.2f \n", numero, (numero / 4));

            System.out.printf("%.0f * 5 = %.0f \t \t", numero, (numero * 5));
            System.out.printf("%.0f / 5 = %.2f \n", numero, (numero / 5));

            System.out.printf("%.0f * 6 = %.0f \t \t", numero, (numero * 6));
            System.out.printf("%.0f / 6 = %.2f \n", numero, (numero / 6));

            System.out.printf("%.0f * 7 = %.0f \t \t", numero, (numero * 7));
            System.out.printf("%.0f / 7 = %.2f \n", numero, (numero / 7));

            System.out.printf("%.0f * 8 = %.0f \t \t", numero, (numero * 8));
            System.out.printf("%.0f / 8 = %.2f \n", numero, (numero / 8));

            System.out.printf("%.0f * 9 = %.0f \t \t", numero, (numero * 9));
            System.out.printf("%.0f / 9 = %.2f \n \n", numero, (numero / 9));


    }
}
