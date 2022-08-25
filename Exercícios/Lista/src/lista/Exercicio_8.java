package lista;
import java.util.Scanner;
/*
Elabore um algoritmo que efetue a apresentação do valor da conversão em real
(R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e
também aquantidade de dólares
disponíveis com ousuário;
*/
public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor da cotação do dólar?");
        double cotacaoDolar = entrada.nextDouble();
        System.out.println("Qual a quantidade de dólares que você tem?");
        double quantidadeDisponivelDolar = entrada.nextDouble();
        double conversaoParaReal = quantidadeDisponivelDolar/cotacaoDolar;
        System.out.print("A conversão é R$ " + conversaoParaReal);

    }
}
