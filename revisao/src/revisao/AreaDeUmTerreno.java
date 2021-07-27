package revisao;

import java.util.Locale;
import java.util.Scanner;

public class AreaDeUmTerreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado do terreno ");
		double valorDoMetroQuadrado = sc.nextDouble();
		
		double areaDoTerreno = largura * comprimento;
		double preco = areaDoTerreno * valorDoMetroQuadrado;
		
		System.out.printf("AREA = %.2f%n", areaDoTerreno);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}
