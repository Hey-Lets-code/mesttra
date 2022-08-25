import java.util.Scanner;
import java.text.DecimalFormat;
/*
1 pão = 0,12
1 broa = 1,60
pães + broas = total
poupançaReforma = 10% de total
paraManterOFaturamento = Math.floor(x);
ler: valorDaReforma
let: qtd paes e broas
*/
public class Exercicio17 {
    public static void main(String[] args) {
        double quantidadeDePaes, quantidadeDeBroas, valorDaReforma, faturamentoDiario,
                depositoDiarioDaPoupancaParaReforma, totalDeDiasParaReforma;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de pães vendidos: ");
        quantidadeDePaes = input.nextDouble() * 0.12;
        System.out.print("Digite a quantidade de broas vendidas: ");
        quantidadeDeBroas = input.nextDouble() * 1.60;
        System.out.print("Digite o valor da reforma: ");
        valorDaReforma = input.nextDouble();

        faturamentoDiario = quantidadeDeBroas + quantidadeDePaes;
        depositoDiarioDaPoupancaParaReforma = faturamentoDiario * 0.1;
        totalDeDiasParaReforma = Math.round(valorDaReforma / depositoDiarioDaPoupancaParaReforma);

        System.out.println();

        System.out.println("Faturamento com venda de broas: " + df.format(quantidadeDeBroas));
        System.out.println("Faturamento com a venda de pães: " + df.format(quantidadeDePaes));
        System.out.println("Faturamento diário (pães + broas): " + df.format(faturamentoDiario));
        System.out.println("Valor do depósito na poupança: " + df.format(depositoDiarioDaPoupancaParaReforma));
        System.out.printf("Para pagar a reforma serão necessários: %.0f", totalDeDiasParaReforma);
    }
}
