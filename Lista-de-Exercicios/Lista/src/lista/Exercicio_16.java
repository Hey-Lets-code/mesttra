package lista;
import java.util.Scanner;
/*
* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno
* durante o semestre. Calcular a sua média (aritmética),
* informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9);
* */
public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        System.out.print("Digite sua primeira nota: ");
//        double nota1 = entrada.nextDouble();
//        System.out.print("Digite sua segunda nota: ");
//        double nota2 = entrada.nextDouble();
//        System.out.print("Digite sua terceira nota: ");
//        double nota3 = entrada.nextDouble();
        double totalNota = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite sua " + (i) + "ª nota: ");
            double nota = entrada.nextDouble();
            totalNota += nota;
        }

        double media = totalNota/3;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media > 5){
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
