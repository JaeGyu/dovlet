package step1.business;

import java.util.Scanner;

/*
 * 4개의 정수 가 주어진다. 
 * 예를 들면 40 70 50 20
 * 
 * 순서대로 
 * 원가 40
 * 정가(판매가) 70
 * 손님이 지불하는 돈중 가짜돈 50
 * 주인이 손님에게 거스름 돈으로 지불 한 돈 20
 * 
 * 이러면 손님이 지불한 금액은 90이다. 
 * 그런데 이중 50이 가짜이므로 실제 받은 금액은 40에 해당한다. 그런데 거스름돈으로 20을 주었으니
 * 실제 받은금액은 20에 해당한다. 그런데 원가가 40원이라서 주인은 20을 손해 봤다. 
 * 
 * 이럴때 출력값은 20이다. 
 * 
 * 이익을보면 이익값에 - 곱하고
 * 본전이면 0
 * 손해면 +이다.
 * 
 * 공식 : 결과값 = 원가 - ((정가 + 거스름돈) - 가짜돈) - 거스름돈 
 * 
 * */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();

		int result = n1 - (n2 - n3);

		System.out.println(result);

	}

}
