package step1.ctof;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.printf("%.1f", 9.0d / 5.0d * a + 32);
	}
}
