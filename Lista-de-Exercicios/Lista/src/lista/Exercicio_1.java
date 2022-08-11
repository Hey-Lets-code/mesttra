package lista;
import java.util.Scanner;
// Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int a = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int b = entrada.nextInt();
        System.out.println("O resultado da soma é: ");
        int soma = a + b;

        System.out.println("Soma = " + soma);

    }
}
