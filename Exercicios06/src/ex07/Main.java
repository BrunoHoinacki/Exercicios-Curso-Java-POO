package ex07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, soma;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vectA = new int[n];
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0; i<n; i++) {
			vectA[i] = sc.nextInt();
		}
		
		int[] vectB = new int[n];
		System.out.println("Digite os valores do vetor B: ");
		for(int i=0; i<n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		soma=0;
		for(int i=0; i<n; i++) {
			soma = vectA[i] + vectB[i];
			System.out.println(soma);
		}
		
		sc.close();
	}

}
