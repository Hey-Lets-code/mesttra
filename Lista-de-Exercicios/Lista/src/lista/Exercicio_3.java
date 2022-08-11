package lista;
import java.util.Scanner;
// Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida
// a distância total percorrida pelo automóvel e o total de combustível gasto;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a distância: ");
        double distancia = entrada.nextDouble();
        System.out.println("Digite a quantidade de litro que você gastou: ");
        double litro = entrada.nextDouble();
        System.out.println("Seu consumo médio foi de: " + distancia/litro);
        // distancia/litro === (distancia/litro);
    }
}
