package condicionaisIF.desafios;

import java.util.Scanner;

public class DesafioNumeroMultiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número:");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}

		}

		sc.close();
	}
}
