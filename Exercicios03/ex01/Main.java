package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if (n < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}

}
