package lista;
import java.util.Scanner;
/*
* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
* Sabe-se que o preço de custo receberá um acréscimo de acordo com um
* percentual informado pelo usuário;
* */
public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o preço de custo? R$ ");
        double precoDeCusto = entrada.nextDouble();
        System.out.println("Qual o percentual do preço de custo?");
        double percentual = entrada.nextDouble();
        double valorDeVenda = precoDeCusto + ((precoDeCusto/100) * percentual);
        System.out.println("O valor da venda é R$" + valorDeVenda);
    }
}
