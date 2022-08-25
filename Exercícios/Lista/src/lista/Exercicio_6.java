package lista;
import java.util.Scanner;
/*
Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma
que a variável A passe a possuir o valor da variável B e a variável B passe a
possuir o valor da variável A. Apresentar os valores trocados;
 */
public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = entrada.nextDouble();
        System.out.print("Digite o outro valor de B: ");
        double b = entrada.nextDouble();
        double c = a;
        a = b;
        b = c;

        System.out.println("Os valores trocadas: \nA = " + a + " \nB = " + b);
    }

}
