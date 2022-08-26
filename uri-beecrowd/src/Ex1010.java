import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimalDuasCasas = new DecimalFormat("0.00");

        int peca1 = entrada.nextInt();
        int quantidadePecas1 = entrada.nextInt();
        double valorUnitarioPeca1 = entrada.nextDouble();

        int peca2 = entrada.nextInt();
        int quantidadePecas2 = entrada.nextInt();
        double valorUnitarioPeca2 = entrada.nextDouble();

        double totalPeca1 = quantidadePecas1 * valorUnitarioPeca1;
        double totalPeca2 = quantidadePecas2 * valorUnitarioPeca2;

        double total = totalPeca1 + totalPeca2;

        System.out.println("VALOR A PAGAR: R$ " + decimalDuasCasas.format(total));
    }
}
