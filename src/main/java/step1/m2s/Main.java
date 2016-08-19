package step1.m2s;

import java.util.Scanner;

/*
 * 2 minutes is 120 seconds.
 * */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.printf("%d minutes is %d seconds.\n", a, a * 60);

	}
}
