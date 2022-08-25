import java.text.DecimalFormat;
import java.util.Scanner;
/*
14. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas
fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada
fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 120
gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e
a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários
para compra.
*/
public class Exercicio14 {
    public static void main(String[] args) {
        int quantidadeDeSanduiches;
        double fatiaDeQueijo, fatiaDePresunto, rodelaDeHamburguer;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de sanduíches: ");
        quantidadeDeSanduiches = input.nextInt();
        input.close();

        fatiaDeQueijo = (2 * 0.05) * quantidadeDeSanduiches;
        fatiaDePresunto = 0.05 * quantidadeDeSanduiches;
        rodelaDeHamburguer = 0.12  * quantidadeDeSanduiches;

        System.out.println(" \nPara produzir " + quantidadeDeSanduiches + " serão necessários: ");
        System.out.println(df.format(fatiaDeQueijo) + " kgs de mussarela");
        System.out.println(df.format(fatiaDePresunto) + " kgs de presunto");
        System.out.println(df.format(rodelaDeHamburguer) + " kgs de hamburguer");


    }
}
