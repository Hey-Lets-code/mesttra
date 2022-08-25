import java.util.Scanner;
/*
Ler um número inteiro com até quatro dígitos e
imprimir a saída da seguinte forma:
MILHARES = x
CENTENA = x
DEZENA = x
UNIDADE = x
*/
public class Exercicio20 {
    public static void main(String[] args) {
        double numero;
        int milhar, centena, dezena, unidade;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número de 4 dígitos: ");
        numero = input.nextDouble();

        milhar = (int) numero / 1000;
        centena = (int) (numero % 1000) / 100;
        dezena = (int) ((numero % 1000) % 100) / 10;
        unidade = (int) (((numero % 1000) % 100) % 10) / 1;

        System.out.println("\nMilhares: " + milhar);
        System.out.println("Centenas: " + centena);
        System.out.println("Dezenas: " + dezena);
        System.out.println("Unidades: " + unidade);
    }
}
