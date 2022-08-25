import java.util.Scanner;
/*
* 12. A granja Frangotech possui um controle automatizado de cada frango da sua
produção. No pé direito do frango há um anel com um chip de identificação; no pé
esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo
que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo
para calcular o gasto total da granja para marcar todos os seus frangos que deverá ser
informado pelo usuário.
* */
public class Exercicio12 {
    public static void main(String[] args) {
        int quantidadeDeFrangosTechs;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de frangos techs: ");
        quantidadeDeFrangosTechs = input.nextInt();

        System.out.println("O valor total para identificar os frangos: " + (quantidadeDeFrangosTechs * 11));
    }
}
