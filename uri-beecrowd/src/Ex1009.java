import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1009 {
    public static void main(String[] args) {
        double salarioFixo, totalDeVendas;
        String vendedor;

        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimalDuasCasas = new DecimalFormat("0.00");

        vendedor = entrada.nextLine();

        salarioFixo = entrada.nextDouble();
        totalDeVendas = entrada.nextDouble();

        double valorFinal = salarioFixo + (totalDeVendas * 0.15);

        System.out.println("TOTAL = R$ " + decimalDuasCasas.format(valorFinal));
    }
}
