package lista;
import java.util.Scanner;
/*
10. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
*/
public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da sua compra R$ ");
        double valorDaCompra = entrada.nextDouble();
        double parcelaDe5 = valorDaCompra/5;
        System.out.println("O valor da sua compra, foi dividido em 5 parcelas. O valor de cada parcela é: R$ " + parcelaDe5);
    }
}
