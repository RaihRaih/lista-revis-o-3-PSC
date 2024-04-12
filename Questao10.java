/*Escreva um código Java que calcula a soma dos números pares de 1 a 100. Imprima esses números. */

public class Questao10
{
	public static void main(String[] args) {
	int[] numero = new int[100];
	
	for (int i = 1; i <= numero.length ;i++ ){
	    if(i % 2 == 0){
	       // System.out.println("numero: " + i);
	        i+=2;
	        System.out.println("Soma: " + i);
	    }
    	}	
	}
}
