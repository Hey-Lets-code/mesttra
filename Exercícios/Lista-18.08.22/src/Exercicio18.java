import java.util.Scanner;
/*
8. Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar.
Faça um algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar,
mas faça com que Carlos e André não paguem centavos. Ex: uma conta de R$101,53
resulta em R$33,00 para Carlos, R$33,00 para André e R$35,53 para Felipe.
*/
public class Exercicio18 {
    public static void main(String[] args) {
        int parteInteira;
    	float conta, divisao, colegaRestante;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor da conta: R$ ");
        
        conta = input.nextFloat();
        divisao = conta / 3;
        parteInteira = (int) divisao;
        colegaRestante = (conta - (2 * parteInteira));

        System.out.println("Carlos pagará: R$ " + parteInteira);
        System.out.println("André pagará: R$ " + parteInteira);
        System.out.println("Felipe pagará: R$ " + colegaRestante);
    }
}
