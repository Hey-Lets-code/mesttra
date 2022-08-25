package calculoSimples;
import java.util.Scanner;
import java.text.DecimalFormat;
/*
[1] ok
Neste problema, deve-se
1- ler o código de uma peça 1, int
2- o número de peças 1, int
3- o valor unitário de cada peça 1 double

[2] ok
1 - o código de uma peça 2; int
2 - o número de peças 2; int
3- o valor unitário de cada peça 2; double

[3]
1 - calcule e mostre o valor a ser pago; double

[OBS]
 1 --> Em cada linha haverá 3 valores,
 2 --> respectivamente dois inteiros
 3 --> e um valor com 2 casas decimais.
*/

public class CalculoSimples {
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
