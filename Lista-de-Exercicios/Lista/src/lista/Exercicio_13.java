package lista;
import java.util.Scanner;
/*
*13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número
* seja maior que 10;
* */
public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();
        if (numero > 10) {
            System.out.println("O número é maior do que 10");
        } else {
            System.out.println("O número é igual ou menor que 10");
        }

    }
}
