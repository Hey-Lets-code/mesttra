import java.util.Scanner;
import java.text.DecimalFormat;
/*
8. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o
aumento, desconte 11% de INSS e 8% de FGTS. Imprima o salário inicial, o salário com o
aumento, o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos
(INSS+FGTS).
*/
public class Exercicio8 {
    public static void main(String[] args) {

        double salario, salarioReajustado, descontoINSS, descontoFGTS, totalDescontosInssFgts, salarioFinal;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe o salário: ");
        salario = input.nextDouble();

        System.out.println();

        salarioReajustado = salario + (salario * 0.15);
        descontoINSS = salarioReajustado * 0.11;
        descontoFGTS = salarioReajustado * 0.08;
        totalDescontosInssFgts = descontoFGTS + descontoINSS;
        salarioFinal = salarioReajustado - totalDescontosInssFgts;

        System.out.println("Salário Inicial: " + df.format(salario));
        System.out.println("Salário Reajustado: R$ " + df.format(salarioReajustado));
        System.out.println("Desconto 11% INSS: R$ " + df.format(descontoINSS));
        System.out.println("Desconto 8% FGTS: R$ " + df.format(descontoFGTS));
        System.out.println("Total Descontos INSS + FGTS: R$ " + df.format(totalDescontosInssFgts));
        System.out.println("Salário Final: R$ " + df.format(salarioFinal));
    }
}
