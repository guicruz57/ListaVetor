import java.util.Arrays;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 0,a[],b[],c[];
		int j = 0;
		int l = 0;
		a = new int [10];
		b = new int [10];
		c = new int [10];
		
		for (i = 0;i <a.length; i++){
			System.out.print("Insira o " + (i+ 1) + "� N�mero: ");
			a[i] = (ler.nextInt());
			b[i] = a[i];
		}
		System.out.print("Ordem Crescente: ");
		for (j = 0; j <b.length; j++){
			System.out.print(b[j] + " ");
			c[j] = b[j];
			}
		
		System.out.println("");
		System.out.print("Ordem Decrescente: ");
		for ( l = 9; l>-1; l--){
			System.out.print(c[l] + " ");
		}
				
		
		}
				
		
		
		
	}

	



