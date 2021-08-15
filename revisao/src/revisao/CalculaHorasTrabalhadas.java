package revisao;

import java.util.Locale;
import java.util.Scanner;

public class CalculaHorasTrabalhadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero do funcion�rio ");
		int numero = sc.nextInt();
		
		System.out.printf("Digite o n�mero de horas trabalhadas ");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.print("Digite o valor da hora trabalhada do funcion�rio " + numero + " ");
		double valorHoraTrabalhada = sc.nextDouble();
		
		double salario = (horasTrabalhadas * valorHoraTrabalhada);
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
		
	}

}
