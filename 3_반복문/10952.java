/*
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

출력
각 테스트 케이스마다 A+B를 출력한다.
*/

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		while (true) { // 다음 조건인 a==0, b==0이 적용 되기 전까지 반복함...
			int a =sc.nextInt(); // 정수 a 입력
			int b =sc.nextInt(); // 정수 b 입력
			
			if( a== 0 && b== 0) {
				break;
			}
			
			int result = a + b;			
			System.out.println(result);
		}
		sc.close();
	}
}
