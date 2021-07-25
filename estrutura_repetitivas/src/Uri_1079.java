import java.util.Locale;
import java.util.Scanner;

public class Uri_1079 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int i;
	        int numero = sc.nextInt();
	        for (i = 1; i <= numero; i = i + 1) {
	            float n1 = sc.nextFloat();
	            float n2 = sc.nextFloat();
	            float n3 = sc.nextFloat();
	            float resultado = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
	            System.out.printf("%.1f\n", resultado);

	        }
		
	}

}
