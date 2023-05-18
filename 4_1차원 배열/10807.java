/*
  개스 세기
  문제
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
  
*/

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수의 갯수 N 입력
		int N = sc.nextInt();
		
		// 정수 배열 입력
		int [] arr = new int[N];
		
		for (int i =0; i< N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 찾으려는 정수 v 입력
		int v = sc.nextInt();
		
		// 정수의 v의 개수 계산
		int count = 0;
		for(int i =0; i<N; i++) {
			if(arr[i] == v) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
    }
}
