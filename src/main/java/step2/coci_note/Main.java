package step2.coci_note;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		int n7 = sc.nextInt();
		int n8 = sc.nextInt();

		if ((n1 < n2) && (n2 < n3) && (n3 < n4) && (n4 < n5) && (n5 < n6) && (n6 < n7) && (n7 < n8)) {
			System.out.println("ascending");
		} else if ((n1 > n2) && (n2 > n3) && (n3 > n4) && (n4 > n5) && (n5 > n6) && (n6 > n7) && (n7 > n8)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
