import java.util.Scanner;
import java.text.DecimalFormat;
/*
09. Faça um algoritmo que leia os dados necessários para calcular e exibir a área:
Pesquisa na Internet como calculcar a área de cada objeto abaixo:
a) de um trapézio.
b) de um quadrado.
c) de um retangulo.
d) de um círculo.
e) de um triangulo
*/
public class Exercicio9 {
    public static void main(String[] args) {
        double baseMaior, baseMenor, alturaTrapezio, areaTrapezio,
                ladoQuadrado, areaQuadrado, baseRetangulo, alturaRetangulo, areaRetangulo,
                raioDoCirculo, areaDoCirculo, baseDoTriangulo, alturaDoTriangulo, areaDoTriangulo;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");



        System.out.println("Área do trapézio:");
        System.out.print("Informe o valor da base maior: ");
        baseMaior = input.nextDouble();
        System.out.print("Informe o valor da base menor: ");
        baseMenor = input.nextDouble();
        System.out.print("Informe o valor da altura: ");
        alturaTrapezio = input.nextDouble();

        areaTrapezio = (baseMaior * baseMenor) * alturaTrapezio / 2;

        System.out.println("A área do trapézio é : " + df.format(areaTrapezio));

        System.out.println();

        System.out.println("Área do quadrado: ");
        System.out.print("Informe o valor de um dos lados: ");
        ladoQuadrado = input.nextDouble();

        areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.println("A área do quadrado é: " + df.format(areaQuadrado));

        System.out.println();

        System.out.println("Área do retângulo: ");
        System.out.print("Informe o valor da largura: ");
        baseRetangulo = input.nextDouble();
        System.out.print("Informe o valor da altura: ");
        alturaRetangulo = input.nextDouble();

        areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println("A área do quadrado é: " + df.format(areaRetangulo));

        System.out.println();

        System.out.println("Área do círculo: ");
        System.out.print("Informe o valor do raio: ");
        raioDoCirculo = input.nextDouble();

        areaDoCirculo = Math.pow(raioDoCirculo, 2) * 3.14;

        System.out.println("A área do quadrado é: " + df.format(areaDoCirculo));

        System.out.println();

        System.out.println("Área do triângulo: ");
        System.out.print("Informe o valor da base: ");
        baseDoTriangulo = input.nextDouble();
        System.out.print("Informe o valor da altura: ");
        alturaDoTriangulo = input.nextDouble();

        areaDoTriangulo = (baseDoTriangulo * alturaDoTriangulo) / 2;

        System.out.println("A área do quadrado é: " + df.format(areaDoTriangulo));

    }
}
