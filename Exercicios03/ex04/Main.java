package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextDouble();
		horaFinal = sc.nextDouble();
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %.0f HORA(S)", duracao);
			
		sc.close();
	}

}
