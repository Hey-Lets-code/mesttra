import java.util.Scanner;
import java.text.DecimalFormat;
/*
7. Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado
*/
public class Exercicio7 {
    public static void main(String[] args) {
        double peso, pesoEngordar, pesoEmagrecer;

        Scanner input = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        peso = input.nextDouble();
        pesoEngordar = peso + (peso * 0.15);
        pesoEmagrecer = peso - (peso * 0.20);
        System.out.println("Informe o peso em kg:" + peso);
        System.out.println("Caso a pessoa engorde 15% ficará com: " + df.format(pesoEngordar));
        System.out.println("Caso a pessoa emagreça 20% ficará com: " + df.format(pesoEmagrecer));
    }
}
