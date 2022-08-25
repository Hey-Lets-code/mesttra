import java.util.Scanner;
/*
2. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um
funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse
funcionário.
*/
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

    double salarioMinimo, salarioFuncionario, quantidadeDeSalarios;

    salarioMinimo = entrada.nextDouble();
    salarioFuncionario = entrada.nextDouble();
    quantidadeDeSalarios = salarioFuncionario/salarioMinimo;

        System.out.printf("Informe o valor do salário mínimo: %.2f \n", salarioMinimo);
        System.out.printf("Informe o valor do salário do funcionário: %.2f \n \n", salarioFuncionario);
        System.out.printf("O funcionário recebe %.1f mínimos!", quantidadeDeSalarios);
    }
}
