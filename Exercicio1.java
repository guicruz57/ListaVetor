import java.util.*;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double  A[],B[];
		int i;
		A = new double [10];
		B = new double [10];
		
		for (i = 0; i<10; i++) {
			System.out.println("Digite o "+(i + 1)+"° Número");
			A[i] = ler.nextInt();
			B[i] = (double) Math.sqrt(A[i]);
			
			System.out.println("A raiz quadrada de "+A[i]+ " é  "+ (B[i]));
			
		}
		

	}

}
