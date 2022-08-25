import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
/*Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o
início do ano. Esqueça a questão dos anos bissextos e considere sempre que um mês
possui 30 dias. */
        int dia, mes, quantidadeDeMeses, quantidadeDeDias;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        dia = input.nextInt();
        System.out.print("Digite o mês: ");
        mes = input.nextInt();

        quantidadeDeDias = (mes * 30) + dia;

        System.out.println("A quantidade de dias que se passaram foi: " + quantidadeDeDias);
    }
}
