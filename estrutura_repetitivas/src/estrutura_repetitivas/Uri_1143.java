package estrutura_repetitivas;

import java.util.Scanner;

public class Uri_1143 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            for (int i = 1; i <= n; i++) {
                int seq = (int) Math.pow(i, 2);
                int multi = i * seq;
                System.out.println(i + " " + seq + " " + multi);
            }
        }
		
	}

}
