import java.util.Locale;
import java.util.Scanner;

public class Uri_1080 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0, posicao = 0;
		
		for (int i = 1; i <= 100; i++) {
			int n = sc.nextInt();
			if (maior > n) {
				maior = maior;
				posicao = posicao;
			}else {
				posicao = i;
				maior = n;
			}
		}
		System.out.print(maior + "\n" + posicao + "\n");
		
	}

}
