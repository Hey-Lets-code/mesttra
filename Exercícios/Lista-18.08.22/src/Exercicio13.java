import java.util.Scanner;
/*
A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350
ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada
quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante
ele compro
*/
public class Exercicio13 {
    public static void main(String[] args) {
        int lata350Ml, garrafa600Ml, garrafa2Lts, quantidadeTotalDeLitros;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas de 350ml: ");
        lata350Ml = input.nextInt() * 350;

        System.out.print("Digite a quantidade de garrafas de 600ml: ");
        garrafa600Ml = input.nextInt() * 600;

        System.out.print("Digite a quantidade de garrafas de 2 litros: ");
        garrafa2Lts = input.nextInt() * 2000;

        quantidadeTotalDeLitros = (lata350Ml + garrafa600Ml + garrafa2Lts) / 1000;

        System.out.println("A quantidade total de litros é: " + quantidadeTotalDeLitros);
    }
}
