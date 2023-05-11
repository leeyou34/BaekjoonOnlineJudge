/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
*/

public class Main {
  	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
				
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
		
			if(0 > A && A > 10) {
				System.out.println("A must be between 0 ~ 10");
			}
			
			if(0 > B && B > 10) {
				System.out.println("B must be between 0 ~ 10");
			}
			
			int result = A+B;
			System.out.println(result);
		}
	}  
}
