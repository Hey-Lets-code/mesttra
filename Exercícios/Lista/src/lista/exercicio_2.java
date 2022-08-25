package lista;
import java.util.Scanner;
// Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
//dos dois números lidos;
public class exercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        // float a = 20f --> o float é menor;
        float a = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        float b = entrada.nextFloat();

        float soma = a + b;
        float subtracao = a - b;
        float multiplicacao = a * b;
        float divisao = (a / b);

        System.out.println("A soma é = " + soma);
        System.out.println("A subratração é = " + subtracao);
        System.out.println("A multiplicação é = " + multiplicacao);
        System.out.println("A divisão é = " + divisao);

    }
}
