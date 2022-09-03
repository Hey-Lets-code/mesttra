package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double valorDoSalarioMinimo,
                valorDoSalarioDoFuncionario,
                quantidadeDeSalariosMinimos;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        // Recebimento dos inputs
        System.out.print("Informe o valor do salário mínimo: R$ ");
        valorDoSalarioMinimo = scanner.nextDouble();

        System.out.print("Informe o valor do salário do funcionário: R$ ");
        valorDoSalarioDoFuncionario = scanner.nextDouble();

        // Cálculo:
        quantidadeDeSalariosMinimos = valorDoSalarioDoFuncionario / valorDoSalarioMinimo;

        // Condição:
        if (quantidadeDeSalariosMinimos < valorDoSalarioMinimo) {
            System.out.println("Funcionário(a) ganha menor que um salário mínimo");
        } else {
            System.out.println("O funcionário recebe "
                    + df.format(quantidadeDeSalariosMinimos)
                    + " salários mínimos!");
        }

        scanner.close();
    }
}
