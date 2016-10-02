package step2.hack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int e = sc.nextInt();
		int c = sc.nextInt();

		int e_c = e - c;

		System.out.println((r > e_c) ? "do not advertise" : (r < e_c) ? "advertise" : "does not matter");
	}
}
