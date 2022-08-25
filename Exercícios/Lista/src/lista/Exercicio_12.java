package lista;
import java.util.Scanner;
/*
*O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do
* distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre
* o custo de fábrica, e depois o percentual do distribuidor sobre o resultado).
* Supondo que o percentual do distribuidor seja de 28% e os impostos 45%,
* escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao
* consumidor do mesmo;
* */
public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica: R$ ");
        double custoDeFabrica = entrada.nextDouble();

        double impostoDosCustos = custoDeFabrica + ((custoDeFabrica/100) * 45);
        double impostoDoDistribuidor = impostoDosCustos + (impostoDosCustos/100 * 28);

        System.out.println("O custo do carro é R$ " + impostoDoDistribuidor);
    }
}
