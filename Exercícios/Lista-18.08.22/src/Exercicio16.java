import java.text.DecimalFormat;
import java.util.Scanner;
/*16. Uma loja de decoração precisa aumentar o seu faturamento para o próximo mês em
       20%. Esta loja deseja atingir este objetivo aumentando a venda de três produtos. O
       produto 1 custa R$ 150 o produto 2 R$ 220,00 e o produto 3 R$ 97.00. Faça um algoritmo
       que receba o valor de faturamento do último mês e apresente:
       a) O faturamento do próximo mês para bater a meta de 20%.
       b) A quantidade de peças apenas do produto 1 necessárias para obter a meta desejada.
       c) A quantidade de peças apenas do produto 2 necessárias para obter a meta desejada.
       d) A quantidade de peças apenas do produto 3 necessárias para obter a meta desejada.*/
public class Exercicio16 {
    public static void main(String[] args) {
        double faturamentoAnterior, metaProximoMes, aumentoDoProximoMes, produto1, produto2,
        produto3;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o faturamento anterior: ");
        faturamentoAnterior = input.nextDouble();
        input.close();

        metaProximoMes = faturamentoAnterior + (faturamentoAnterior * 0.2);
        aumentoDoProximoMes = metaProximoMes - faturamentoAnterior;
        produto1 = aumentoDoProximoMes / 150;
        produto2 = aumentoDoProximoMes / 220;
        produto3 = aumentoDoProximoMes / 97;

        System.out.println();

        System.out.println("A meta do próximo mês é: R$ " + metaProximoMes);
        System.out.println("Um aumento de: R$ " + df.format(aumentoDoProximoMes));
        System.out.println("Quantidade de peças a serem vendidas para atingirmos a meta: ");

        System.out.println();

        System.out.println("Produto 1: " + df.format(produto1) + " peças");
        System.out.println("Produto 2: " + df.format(produto2) + " peças");
        System.out.println("Produto 3: " + df.format(produto3) + " peças");

    }
}
