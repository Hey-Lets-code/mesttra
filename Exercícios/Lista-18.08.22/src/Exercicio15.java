import java.util.Scanner;
import java.text.DecimalFormat;
/*
15. A empresa Hipotheticus paga
R$10,00 por hora normal trabalhada,
R$15,00 por hora extra e
R$ 90 reais por cada dependente menor que 6 anos.

Faça um algoritmo que
solicite a

quantidade de horas normais e
extras trabalhadas no mês além da
quantidade de dependentes menores que 6 anos.

Considere que

o salário líquido é igual ao salário de horas normais descontando-se 11 % de impostos.

O salário final é o salário liquido mais o
valor recebido por cada dependente mais as horas extras
*/
public class Exercicio15 {
    public static void main(String[] args) {
        double quantidadeHorasNormaisTrabalhadas, quantidadeHorasExtrasTrabalhadas,
                quantidadeDeDependentesMenoresQue6Anos, salarioLiquido, salarioFinal;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade total de horas normais: ");
        quantidadeHorasNormaisTrabalhadas = input.nextInt() * 10;

        System.out.print("Digite a quantidade de horas extras: ");
        quantidadeHorasExtrasTrabalhadas = input.nextInt() * 15;

        System.out.print("Digite a quantidade total de dependentes menores que 6 anos: ");
        quantidadeDeDependentesMenoresQue6Anos = input.nextInt() * 90;

        salarioLiquido = quantidadeHorasNormaisTrabalhadas - (quantidadeHorasNormaisTrabalhadas * 0.11);
        salarioFinal =(salarioLiquido + quantidadeHorasExtrasTrabalhadas + quantidadeDeDependentesMenoresQue6Anos);

        System.out.println();

        System.out.println("Horas normais: " + quantidadeHorasNormaisTrabalhadas);
        System.out.println("Adicional de horas Extras: R$ " + quantidadeHorasExtrasTrabalhadas);
        System.out.println("Adicional de dependentes: R$ " + quantidadeDeDependentesMenoresQue6Anos);
        System.out.println("Salário Líquido (horas normais - desconto): R$ " + df.format(salarioLiquido));
        System.out.println("Salário finaç: R$ " + df.format(salarioFinal));
    }
}
