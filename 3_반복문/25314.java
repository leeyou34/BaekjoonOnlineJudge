/*
오늘은 혜아의 면접 날이다. 면접 준비를 열심히 해서 앞선 질문들을 잘 대답한 혜아는 이제 마지막으로 칠판에 직접 코딩하는 문제를 받았다. 혜아가 받은 문제는 두 수를 더하는 문제였다. C++ 책을 열심히 읽었던 혜아는 간단히 두 수를 더하는 코드를 칠판에 적었다. 코드를 본 면접관은 다음 질문을 했다. “만약, 입출력이 N바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?”

혜아는 책에 있는 정수 자료형과 관련된 내용을 기억해 냈다. 책에는 long int는 
4바이트 정수까지 저장할 수 있는 정수 자료형이고 long long int는 
8바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다. 혜아는 이런 생각이 들었다. “int 앞에 long을 하나씩 더 붙일 때마다 
4바이트씩 저장할 수 있는 공간이 늘어나는 걸까? 분명 long long long int는 
12바이트, long long long long int는 
16바이트까지 저장할 수 있는 정수 자료형일 거야!” 그렇게 혜아는 당황하는 면접관의 얼굴을 뒤로한 채 칠판에 정수 자료형을 써 내려가기 시작했다.

혜아가 N바이트 정수까지 저장할 수 있다고 생각해서 칠판에 쓴 정수 자료형의 이름은무엇일까?

입력
첫 번째 줄에는 문제의 정수 N이 주어진다. 
(4<= N <= 1000;  N은 4의 배수)

출력
혜아가  N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 4 != 0) {
            System.out.println("N must be a multiple of 4.");
            return;
        }

        if (n < 4 || n > 1000) {
            System.out.println("N must be between 4 and 1000 (inclusive).");
            return;
        }
        
        int bytes= n/4;
		
		String dataType = "int";
		
		for (int i = 1; i<= bytes; i++) {
            dataType = "long " + dataType;
        }
        System.out.println(dataType);
		sc.close();
	}
}
