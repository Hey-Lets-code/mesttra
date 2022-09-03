package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio01 {
    public static void main(String[] args) {
        double frenteDoTerreno,
                lateralDoTerreno,
                diferencaEntreFrenteELateral,
                valorPorMetroQuadrado,
                valorFinalDoTerreno,
                areaDoTerreno;
        String frase = "";

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);

        // Input
        System.out.print("Quantos metros o terreno possui de frente: ");
        frenteDoTerreno = entrada.nextDouble();

        System.out.print("Quantos metros o terreno possui de lateral: ");
        lateralDoTerreno = entrada.nextDouble();

        System.out.print("Informe o valor: R$ ");
        valorPorMetroQuadrado = entrada.nextDouble();

        // Cálculos
        areaDoTerreno = frenteDoTerreno * lateralDoTerreno;
        valorFinalDoTerreno = (areaDoTerreno * valorPorMetroQuadrado);
        diferencaEntreFrenteELateral = Math.abs(frenteDoTerreno - lateralDoTerreno);


        // Condições
        if (diferencaEntreFrenteELateral < (0.1 * frenteDoTerreno)) {
            frase = "acréscimo de 22%";
            valorFinalDoTerreno = valorFinalDoTerreno + (0.22 * valorFinalDoTerreno);
        } else if (frenteDoTerreno < (0.4 * lateralDoTerreno)) {
            frase = "decréscimo de 12%";
            valorFinalDoTerreno = valorFinalDoTerreno - (0.12 * valorFinalDoTerreno);
        } else if (frenteDoTerreno > (0.7 * frenteDoTerreno)) {
            frase = "descréscimo de 15%";
            valorFinalDoTerreno = valorFinalDoTerreno - (0.15 * valorFinalDoTerreno);
        } else {
            frase = "não recebeu nenhuma alteração";
        }

        // Output
        System.out.println("Área do terreno de "
                + df.format(frenteDoTerreno)
                + " mts de frente com " + df.format(lateralDoTerreno)
                + " mts de lateral é: "+ df.format(areaDoTerreno)+ " mts");

        System.out.println("O terreno recebeu um "
                + frase + " e custará R$ "
                + df.format(valorFinalDoTerreno));

        entrada.close();
    }
}
