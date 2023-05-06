/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,T;
		
		T= sc.nextInt(); // 테스트 케이스 갯수
		
		
		for(int i = 1; i<= T; i++) {	
			A= sc.nextInt();
			B= sc.nextInt();		
			
			if(0<A && A<10) {
				if(0<B && B<10){
		
					int result = A+B;
					System.out.println(result);		
				
				} else {
					System.out.println("your B has to put number between 0~10");
				}
			} else {
				System.out.println("your A has to put number between 0~10");
			}
		}
	}
}
