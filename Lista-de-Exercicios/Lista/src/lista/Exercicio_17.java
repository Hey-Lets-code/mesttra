package lista;
import java.util.Random; // acessando a localização da classe Random
/*
* Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre
* 10 (inclusive) e 150 ve(inclusi);
* */
public class Exercicio_17 {
    public static void main(String[] args) {
        Random randomNumber = new Random(); // Instanciando o objeto da classe Random
        // e armazenando numa variável

        int count = 0; // declarado fora do escopo for

        for (int i = 1; i <= 80; i += 1) {
            int numbers = randomNumber.nextInt(300); // 0 até 300

            if (numbers >= 10 && numbers <= 150) {
                count += 1;
            }
        }
        System.out.println("Existem " + count + " números que estão entre o intervalo de 10 e 150.");
    }
}
