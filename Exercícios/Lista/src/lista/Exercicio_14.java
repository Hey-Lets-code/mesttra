package lista;
import java.util.Scanner;
/*
* Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
* */
public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = entrada.nextDouble();

        if (valor1 > valor2) {
            System.out.println("O maior valor é " + valor1);
        } else {
            System.out.println("O maior valor é " + valor2);
        }
    }
}
