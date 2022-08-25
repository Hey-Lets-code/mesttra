import java.sql.SQLOutput;
import java.util.Scanner;
/*
1. Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a
área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário
informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo
metro quadrado
*/
public class Exercicio1 {
    public static void main(String[] args) {
    double frente, lateral, valorDoMetroQuadrado, areaTotal, valorTotalDoTerreno;

    Scanner entrada = new Scanner(System.in);

        frente = entrada.nextDouble();
        lateral = entrada.nextDouble();
        valorDoMetroQuadrado = entrada.nextDouble();

        areaTotal = frente * lateral;
        valorTotalDoTerreno = areaTotal * valorDoMetroQuadrado;

        System.out.printf("Quantos metros o terreno possui de frente: %.2f \n", frente);
        System.out.printf("Quantos metros o terreno possui de lateral: %.2f \n", lateral);
        System.out.printf("Informe o valor do metro quadrado: %.2f \n \n", valorDoMetroQuadrado);
        System.out.printf("Area total do terreno de %.2f mts de frente com %.2f de lateral é: %.2f mts\n", frente, lateral, areaTotal);
        System.out.printf("O valor deste terreno é: %.2f", valorTotalDoTerreno);
    }
}
