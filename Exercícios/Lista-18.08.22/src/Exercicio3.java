import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, mediaPonderada;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        mediaPonderada = (nota1 * 1 + nota2 * 2 + nota3 * 3) / (1 + 2 + 3);
        System.out.printf("A média ponderada das notas %.1f, %.1f, %.1f é: %.2f", nota1, nota2, nota3, mediaPonderada);
    }
}
