package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		float[] vect = new float[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextFloat();
		}
		
		System.out.println();
		System.out.print("VALORES: ");
		
		float sum = 0;
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f ", vect[i]);
			sum += vect[i];
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		
		float avg = sum / n;
		System.out.printf("MEDIA = %.2f", avg);
		
		sc.close();
	}

}
