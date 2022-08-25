package salario;
import java.util.Scanner;
import java.text.DecimalFormat;

public class salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimalDuasCasas = new DecimalFormat("0.00");

        int numeroDoFuncionario = entrada.nextInt();
        int valorPorHora = entrada.nextInt();
        double horasTrabalhadas = entrada.nextDouble();
        double salarioDoFuncionario = valorPorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + numeroDoFuncionario + "\nSALARY = U$ " + decimalDuasCasas.format(salarioDoFuncionario));
    }
}
