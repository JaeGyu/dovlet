package step1.three;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String strB = String.valueOf(b);

		System.out.printf("%d\n%d\n%d\n%d", a * Integer.parseInt(strB.substring(2, 3)),
				a * Integer.parseInt(strB.substring(1, 2)), a * Integer.parseInt(strB.substring(0, 1)), a * b);
	}
}
