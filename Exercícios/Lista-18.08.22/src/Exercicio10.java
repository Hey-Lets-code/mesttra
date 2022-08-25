import java.util.Scanner;
/*
10. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual,
calcule e mostre.
a) a idade dessa pessoa em anos;
b) a idade dessa pessoa em meses;
c) a idade dessa pessoa em dias; considere todos os meses com 30 dias
d) a idade dessa pessoa em semanas, considere que todos os messes possuem 4
semanas
*/
public class Exercicio10 {
    public static void main(String[] args) {
    int anoInicial, anoFinal, idadeEmAnos, idadeEmMeses, idadeEmDias, idadeEmSemanas;

    Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano incial: ");
        anoInicial = input.nextInt();
        System.out.print("Digite o ano final: ");
        anoFinal = input.nextInt();

        idadeEmAnos = anoFinal - anoInicial;
        idadeEmMeses = (anoFinal - anoInicial) * 12;
        idadeEmDias = ((anoFinal - anoInicial) * 12) * 30;
        idadeEmSemanas = ((((anoFinal - anoInicial) * 12) * 30) / 30) * 4;

        System.out.println();

        System.out.println("A idade dessa pessoa em");
        System.out.println("anos é: " + idadeEmAnos);
        System.out.println("meses é: " + idadeEmMeses);
        System.out.println("dias é : " + idadeEmDias);
        System.out.println("semanas é : " + idadeEmSemanas);
    }
}
