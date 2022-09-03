package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio04 {
    public static void main(String[] args) {
        int
                quantidadeDeFerraduras,
                quantidadeDeCavalos,
                quantidadeFinalDeFerraduras;
        double
                valorDaFerradura,
                valorFinalDasFerraduras;


        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Informe a quantidade de cavalos: ");
        quantidadeDeCavalos = scanner.nextInt();

        System.out.print("Informe o valor de cada ferradura: ");
        valorDaFerradura = scanner.nextDouble();

        // Cálculos:
        quantidadeFinalDeFerraduras = quantidadeDeCavalos * 4;
        valorFinalDasFerraduras = quantidadeFinalDeFerraduras * valorDaFerradura;

        // Condições:
        if (valorFinalDasFerraduras > 15000 && valorFinalDasFerraduras <= 20000) {
            valorFinalDasFerraduras -= (0.1 * valorFinalDasFerraduras);
        } else if (valorFinalDasFerraduras > 20000 && valorFinalDasFerraduras <= 25000) {
            valorFinalDasFerraduras -= (0.12 * valorFinalDasFerraduras);
        } else if (valorFinalDasFerraduras > 25000 && valorFinalDasFerraduras <= 30000) {
            valorFinalDasFerraduras = valorFinalDasFerraduras - (0.15 * valorFinalDasFerraduras);
        } else if (valorFinalDasFerraduras > 30000) {
            valorFinalDasFerraduras -= (0.2 * valorFinalDasFerraduras);
        }

        // Saída
        System.out.println("A quantidade de ferraduras necessárias: " + quantidadeFinalDeFerraduras);
        System.out.println("Valor total para a compra de ferraduras: R$ " + df.format(valorFinalDasFerraduras));
    }
}
