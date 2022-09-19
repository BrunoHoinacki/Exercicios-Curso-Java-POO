package ex06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posMaior;
		double maior;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		posMaior = 0;
		maior = vect[0];
		
		for(int i=1; i<n; i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posMaior = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posMaior);
		
		sc.close();
	}

}
