package revisao;

import java.util.Scanner;

public class AreaDeUmCirculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		
		double area = 3.14159 * (raio * raio);
		
		System.out.printf("A=%.4f", area);
		sc.close();
		
	}

}
