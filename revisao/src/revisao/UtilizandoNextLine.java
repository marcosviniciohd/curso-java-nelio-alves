package revisao;

import java.util.Locale;
import java.util.Scanner;

public class UtilizandoNextLine {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		System.out.println("Digite sua idade ");
		int idade = sc.nextInt();
		System.out.println("Digite seus dados ");
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(idade);
		
	}

}
