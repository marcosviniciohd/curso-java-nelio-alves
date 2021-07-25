import java.util.Locale;
import java.util.Scanner;

public class Uri_1158 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int count = 0, total = 0;
			while (y > count) {
				if (x % 2 != 0) {
					total += x;
					count++;
				}
				x++;
			}
			System.out.println(total);
		}

	}

}
