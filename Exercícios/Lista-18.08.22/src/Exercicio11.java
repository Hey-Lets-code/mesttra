import java.text.DecimalFormat;
import java.util.Scanner;
/*
11. Um tonel de refresco é feito com 80% de água mineral e 20%  de suco de
maracujá. Faça um algoritmo para calcular quantos litros de água e de suco são
necessários para se fazer uma certa quantidade de litros de refresco informados pelo
usuário.
*/
public class Exercicio11 {
    public static void main(String[] args) {
        double quantidadeDeLitrosDeSuco, aguaMineral, sucoDeMaracuja;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de litros de suco necessárias: ");
        quantidadeDeLitrosDeSuco = input.nextDouble();

        aguaMineral = quantidadeDeLitrosDeSuco * 0.8;
        sucoDeMaracuja = quantidadeDeLitrosDeSuco * 0.2;

        System.out.println(df.format(aguaMineral) + " litros de água");
        System.out.println(df.format(sucoDeMaracuja) + " suco de maracujá");
    }
}
