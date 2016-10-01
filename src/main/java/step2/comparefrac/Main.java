package step2.comparefrac;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();

		double d1 = (double) n1 / (double) n2;
		double d2 = (double) n3 / (double) n4;

		System.out.println((d1 < d2) ? -1 : (d1 > d2) ? 1 : 0);
	}
}
