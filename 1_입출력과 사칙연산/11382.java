/*
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

입력
첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.

출력
A+B+C의 값을 출력한다.
*/



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(); // 첫 번째 수 입력 받기
        long b = sc.nextLong(); // 두 번째 수 입력 받기
        long c = sc.nextLong(); // 세 번째 수 입력 받기
        long result = a + b + c; // 입력받은 세 수의 합 계산

        System.out.println(result); // 합 출력
    }
}

// A, B, C에 각각 정수를 할당 할 것이며. 입력하는데로 새로운 값을 출력해야한다.
// 그래서 Scanner class가 필요하다.
// 첫번째 수를 입력 받아야 하는데... long 자료형을 사용하여 변수 a 를 선언하고
// 그 변수 a 는 sc 변수를 호출하여 long 자료 형의 정수를 입력 받는다.
// b도 마찬가지며 c 도 마찬가지다.
// 그리고 최종 값을 result로 선언하며. a + b + c ; 공식을 넣어 준뒤
// 최종적으로 값을 출력한다.
