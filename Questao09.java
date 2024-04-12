import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        
        // Calcula e imprime a tabuada do número fornecido pelo usuário
        for (int i = 1; i <= 10; i++) {
            // Calcula a soma
            int soma = numero + i;
            System.out.println(numero + " + " + i + " = " + soma);

        }
        for (int i = 1; i <= 10; i++) {
            // Calcula subtração
            int subtrai = numero - i;
            System.out.println(numero + " - " + i + " = " + subtrai);
            
        }
        for (int i = 1; i <= 10; i++) {
            // Calcula multiplicação 
            int multiplica = numero * i;
            System.out.println(numero + " * " + i + " = " + multiplica);

        }
        for (int i = 1; i <= 10; i++) {
            // Calcula divisão
            int divide = numero / i;
            System.out.println(numero + " / " + i + " = " + divide);

        }
        scanner.close();
    }
}
