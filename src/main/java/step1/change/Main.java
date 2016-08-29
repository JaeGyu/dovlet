package step1.change;

import java.util.Scanner;

public class Main {

	private static final int pay = 1000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int changes = pay - a;

		int n100 = changes / 100;
		int n50 = (changes % 100) / 50;
		int n10 = ((changes % 100) % 50) / 10;

		System.out.printf("%d %d %d\n", n100, n50, n10);

	}
}
