package revisao;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome ");
		String x = sc.next();
		
		System.out.println("Digite sua idade ");
		int y = sc.nextInt();
		
		System.out.println("Digite seu peso ");
		double peso = sc.nextDouble();
		
		System.out.println("Digite seu sexo ");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Seu nome é " + x + " sua idade é " + y + " seu peso é " + peso + " seu sexo é " + sexo + ".");
		sc.close();
	}

}
