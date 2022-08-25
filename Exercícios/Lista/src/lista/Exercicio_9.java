package lista;
import java.util.Scanner;
/*
Faça um algoritmo que receba um valor que foi depositado e exiba o valor
com rendimento após um
mês. Considere fixo o juro da poupança em 0,07% a. m;
*/
public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorDepositado = entrada.nextDouble();
        double valorComRendimento = valorDepositado + (valorDepositado * 0.007);
        System.out.println("Valor com rendimento R$ " + valorComRendimento);
    }
}
