package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int
                primeiroNumero,
                segundoNumero,
                maior = 0,
                menor = 0;
        float
                resultadoDaDivisao = 0;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        primeiroNumero = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        segundoNumero = scanner.nextInt();

        if (segundoNumero <= 0 || primeiroNumero <= 0) {
            System.out.println("A operação não pode ser realizada");
        } else if (primeiroNumero > segundoNumero) {
            maior = primeiroNumero;
            menor = segundoNumero;

            resultadoDaDivisao = (float) maior / menor;
        } else if (segundoNumero > primeiroNumero) {
            maior = segundoNumero;
            menor = primeiroNumero;

            resultadoDaDivisao = (float) maior / menor;
        } else {
            resultadoDaDivisao = (primeiroNumero / segundoNumero);
        }

        System.out.println("A divisão de "
                + maior
                + " por "
                + menor
                + " é: "
                + df.format(resultadoDaDivisao));
    }
}
