/*

문제
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

입력
두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

출력
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

*/

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A,B;
        A=sc.nextInt();
        B=sc.nextInt();
        
        if(A >= 1 && B<= 10000) {
            int result1=A+B;
            System.out.println(result1);
        
            int result2=A-B;
            System.out.println(result2);
        
            int result3=A*B;
            System.out.println(result3);
        
            int result4=A/B;
            System.out.println(result4);
        
            int result5=A%B;
            System.out.println(result5);
        } else {
            System.out.println("put the number between 1~10000");
        }
    }
}
