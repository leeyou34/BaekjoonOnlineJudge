/*
문제
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
*/

import java.util.Scanner;

public class baekjoon10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while (true) {
		// 정수의 개수 N 그리고 X 입력
//			System.out.println("정수의 개수 N을 입력하시요");
			int N = sc.nextInt();
			if (1 >= N && N >= 10000) {
				System.out.println("1~10,000 중에서 정수 하나를 입력하세요");
				return;
			}
			
//			System.out.println("정수 X를 입력하시요");
			int X = sc.nextInt();
			if (1 >= X && X >= 10000) {
				System.out.println("1~10,000 중에서 정수 하나를 입력하세요");
				return;
			}

			
//			System.out.println("수열 A를 입력하세요");
			// 수열 A 입력
			int [] A = new int[N];
			for(int i=0; i< N; i++) {
				A[i] = sc.nextInt();
				if(1 >=A[i] && A[i] >=10000) {
					System.out.println("수열 내에 있는 element는 1~ 10,000 숫자가 입력 되어야 합니다.");
				}
			}
		
		// X보다 작은 수 출력
		
		for(int i=0; i <N; i++) {
			if(A[i] <X) {
				System.out.print(A[i] + " ");
			}
		}
//		System.out.println();
		}
//	}

}		

/* 하기는 while 문을 적용한 코드 프로그램. 계속 연속적으로 사용 가능하다.
		
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		// 정수의 개수 N 그리고 X 입력
//			System.out.println("정수의 개수 N을 입력하시요");
			int N = sc.nextInt();
			if (1 >= N && N >= 10000) {
				System.out.println("1~10,000 중에서 정수 하나를 입력하세요");
				return;
			}
			
//			System.out.println("정수 X를 입력하시요");
			int X = sc.nextInt();
			if (1 >= X && X >= 10000) {
				System.out.println("1~10,000 중에서 정수 하나를 입력하세요");
				return;
			}

			
//			System.out.println("수열 A를 입력하세요");
			// 수열 A 입력
			int [] A = new int[N];
			for(int i=0; i< N; i++) {
				A[i] = sc.nextInt();
				if(1 >=A[i] && A[i] >=10000) {
					System.out.println("수열 내에 있는 element는 1~ 10,000 숫자가 입력 되어야 합니다.");
				}
			}
		
		// X보다 작은 수 출력
		
		for(int i=0; i <N; i++) {
			if(A[i] <X) {
				System.out.print(A[i] + " ");
			}
		}
//		System.out.println();
		}
	}

}
*/
