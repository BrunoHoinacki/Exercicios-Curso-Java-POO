package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if((a % b == 0) || (b % a == 0)) {
			System.out.println("SÃO MULTIPLOS");
		}else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		sc.close();
	}
}
