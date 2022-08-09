package salario;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimalDuasCasas = new DecimalFormat("0.00");

        String vendedor = entrada.nextLine();

        double salarioFixo = entrada.nextDouble();
        double totalDeVendas = entrada.nextDouble();

        double valorFinal = salarioFixo + (totalDeVendas * 0.15);

        System.out.println("TOTAL = R$ " + decimalDuasCasas.format(valorFinal));
    }
}
