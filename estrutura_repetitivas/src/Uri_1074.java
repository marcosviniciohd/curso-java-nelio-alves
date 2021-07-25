import java.util.Locale;
import java.util.Scanner;

public class Uri_1074 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 10000) {
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				if (x > -10000000 && x < 10000000) {
					if (x == 0) {
						System.out.println("NULL");
					} else if (x % 2 == 0) {
						if (x > 0) {
							System.out.println("EVEN POSITIVE");
						} else {
							System.out.println("EVEN NEGATIVE");
						}
					} else if (x > 0) {
						System.out.println("ODD POSITIVE");
					} else {
						System.out.println("ODD NEGATIVE");
					}
				}
			}
		}

	}

}
