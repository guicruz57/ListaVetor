import java.util.Scanner;
import java.util.Arrays;
public class Exercicio4 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		int i, menor=100000, maior=0, aux;
		int a [];
		final int V = 10;
		
		
		a = new int [V];
		
		for(i=0;i<10;i++){
			
			System.out.println("Digite o "+(i+1)+"° valor: ");
			a[i] = ler.nextInt();
			aux= a[i];
			if(menor>aux){
				menor=a[i];
			}
			if(maior<aux){
				maior=a[i];
			}
			
		}
		
		System.out.println("O maior numero digitado é: "+maior);
		System.out.println("O menor numero digitado é: "+menor);
		
		
	
		ler.close();
	}
}

