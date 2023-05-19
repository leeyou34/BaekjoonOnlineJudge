/*
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if (N < 1 || N > 1000000) {
			System.out.println("정수 1~1,000,000 중 하나를 선택하세요");
			return;
		}
		
		int[] arr = new int[N];
		for(int i=0; i< N; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < -1000000 || arr[i] > 1000000) {
				System.out.println("수열 내에 숫자들은 1~1,000,000로 입력 하셔야합니다.");
				return;
			}
		}
		// 최솟 값과 최댓값 초기화
		int min = arr[0];
		int max = arr[0];
		
		for(int i =1; i< N; i++) { // 증감 연산자가 배열을 센다 
			if(arr[i] < min) { // 만약 배열에 있는 숫자가 하나씩 검사하면서 초기화된 최솟값 보다 작으면 그 배열에 있는 숫자는 곧 최솟 값이다.
				min = arr[i];
			}
			if(arr[i] > max) { // 만약 배열에 있는 숫자가 하나씩 검사하면서 초기화된 최대값 보다 크면 그 배열에 있는 숫자는 곧 최댓 값이다.
				max = arr[i];
			}
		}
		
		System.out.println(min +" "+ max);
		
		sc.close();
		}
		

	}
