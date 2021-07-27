package revisao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_estrutura_sequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
	}

}
