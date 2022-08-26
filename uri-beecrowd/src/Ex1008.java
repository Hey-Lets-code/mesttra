import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1008 {
    public static void main(String[] args) {
        int numeroDoFuncionario, valorPorHora;
        double horasTrabalhadas, salarioDoFuncionario;

        Scanner entrada = new Scanner(System.in);
        DecimalFormat decimalDuasCasas = new DecimalFormat("0.00");

        numeroDoFuncionario = entrada.nextInt();
        valorPorHora = entrada.nextInt();
        horasTrabalhadas = entrada.nextDouble();
        salarioDoFuncionario = valorPorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + numeroDoFuncionario + "\nSALARY = U$ " + decimalDuasCasas.format(salarioDoFuncionario));
    }
}

