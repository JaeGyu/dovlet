package step2.swimming;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n == 1 || n == 3 || n == 5) {
			System.out.println("enjoy");
		} else {
			System.out.println("oops");
		}
	}
}
