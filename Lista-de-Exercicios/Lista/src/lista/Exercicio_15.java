package lista;
import java.util.Scanner;
/*
*Faça um algoritmo que receba um número e diga se este número está no
* intervalo entre 100 e 200;
* */
public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = entrada.nextDouble();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200");
        } else {
            System.out.println("O número não está no intervalo entre 100 e 200");
        }
    }
}
