import java.util.Scanner;
/*
6. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar
todos os cavalos comprados para um haras. O usuário devera informar a quantidade de
cavalos adquiridos.
*/
public class Exercicio6 {
    public static void main(String[] args) {
        int quantidadeDeCavalos, quantidadeDeFerraduras;
        double valorIndividualFerradura, totalCompraFerraduras;
        Scanner input = new Scanner(System.in);

        quantidadeDeCavalos = input.nextInt();
        valorIndividualFerradura = input.nextDouble();

        System.out.println("Informe a quantidade de cavalos: " + quantidadeDeCavalos);
        System.out.println("Informe o valor de cada ferradura: R$ \n" + valorIndividualFerradura);

        quantidadeDeFerraduras = quantidadeDeCavalos * 4;
        totalCompraFerraduras = quantidadeDeFerraduras * valorIndividualFerradura;

        System.out.println("A quantidade de ferraduras necessárias: " + quantidadeDeFerraduras);
        System.out.printf("Valor total para compra das ferraduras: R$ %.2f", totalCompraFerraduras);
    }
}
