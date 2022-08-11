package lista;

import java.util.Scanner;

public class Exercicio_4 {
    /* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total
    de vendas efetuadas por ele no mês (em dinheiro).
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
     efetuadas, informar o seu nome, o salário fixo e salário no final do mês; */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String vendedor = entrada.nextLine();
        System.out.print("Digite seu salário fixo: R$");
        double salarioFixo = entrada.nextDouble();
        System.out.print("Digite seu  total de vendas no mês: R$");
        double vendaTotal = entrada.nextDouble();
        double salarioFinal = salarioFixo + (vendaTotal * 0.15);
        System.out.println("Vendedor: " + vendedor);
        System.out.print("Salário fixo: R$" + salarioFixo
                + "\nSalário final: R$" + salarioFinal);


        // escrevaL("R$", vendas)
    }


}
