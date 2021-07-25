package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1142 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0;
		for (int i = 0; i < n; i++) {
			System.out.println((p + 1) + " " + (p + 2) + " " + (p + 3) + " PUM");
			p += 4;
		}

	}

}
