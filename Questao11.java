/*Escreva um código Java que simula o jogo da adivinhação.*/

import java.util.Random;
import java.util.Scanner;

public class Questao11
{
	public static void main(String[] args) {
	    Random random = new Random();
	    Scanner scanner = new Scanner(System.in);
	    int numero = random.nextInt(50);
	    int tentativa = 5;
	    
	    while(tentativa > 0){
	        System.out.println("Tente advinhar um numero de 0 a 50");
	        	    int resposta = scanner.nextInt();
	        	    
	        if (resposta == numero) {
            System.out.println("Parabens voce conseguiu!!");
            break;	    
	    
	   } else if (resposta < numero) {
            tentativa--; //ele so irá diminuir a tentativa se a condição do if for verdadeira
            System.out.println("O numero secreto é maior que seu chute, tente novamente. " + tentativa + "Tentativas Restantes");
        } else {
            tentativa--;
            System.out.println("O numero secreto é menor que seu chute, tente novamente. " + tentativa + "Tentativas Restantes");
        } 
	}
	    System.out.println("O numero secreto era: " + numero);
    }
}
