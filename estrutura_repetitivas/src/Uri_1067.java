import java.util.Locale;
import java.util.Scanner;

public class Uri_1067 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for (int i = 0; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
