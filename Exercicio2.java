import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i,c=1, divi = 0, soma = 0;
		final int P = 10;
		int a [];
		
		a = new int [P];
		
		for(i=0;i<10;i++){
			
			System.out.println("Digite o "+(i+1)+"° valor: ");
			a[i] = ler.nextInt();	 
		}
		
					
		for(i=0;i<10;i++){
			divi=0;
			for(c=1;c<=a[i];c++){
					if(a[i] % c == 0){
						divi = divi + 1;
					}		
			}
			
			
			if(divi == 2){
				System.out.println(a[i]+" este numero é primo");
				soma = soma + 1;
			}
		}
		System.out.println("A quantidade de numeros primos é "+soma);
		ler.close();
	}
	}
