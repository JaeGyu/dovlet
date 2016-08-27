package step1.average;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		System.out.printf("%.2f", (a + b + c + d) / 4.0d);
	}
}
