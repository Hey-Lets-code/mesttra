package lista;
import java.util.Scanner;
/*
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que
ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética);
 */
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a primeira nota: ");
        double notaUm = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double notaDois = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double notaTres = entrada.nextDouble();

        double media = (notaUm + notaDois + notaTres)/3;
        System.out.println("Nome do aluno(a): " + nome + "Sua média foi de:" + media);
    }
}
