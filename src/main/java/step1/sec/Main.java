package step1.sec;

import java.util.Scanner;

public class Main {
	private static final int min = 60;
	private static final int hour = 60 * min;
	private static final int day = 24 * hour;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int d = a / day;
		int h = (a % day) / hour;
		int m = ((a % day) % hour) / min;
		int s = ((a % day) % hour) % min;

		System.out.printf("%d %d %d %d\n", d, h, m, s);
	}
}
