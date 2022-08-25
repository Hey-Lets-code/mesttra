import java.util.Scanner;
/*
5. Faça um algoritmo que receba dois números inteiros, calcule e mostre a divisão do
primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero,
portanto não é necessário se preocupar com validações.
Resultado esperado:
OBS: Para forçar uma divisão de dois números inteiro produzir um resultado fracionário,
utilizamos a palavra float entre parênteses. Exemplo: (a/(float)b). Neste caso, forçamos o
compilador entender que a variavel b apesar de ser inteira deve ser convertida para float
*/
public class Exercicio5 {
    public static void main(String[] args) {
    int number1, number2;

    Scanner input = new Scanner(System.in);

    number1 = input.nextInt();
    number2 = input.nextInt();

    System.out.println((number1/(float)number2));

    }
}
