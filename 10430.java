/*
문제
(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

출력
첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.



*/


import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        
        if(2<=A && B <=10000 && C<=10000 ) {
            int result1 = (A+B)%C;
            int result2 = ((A%C)+(B%C))%C;
            int result3 = (A*B)%C;
            int result4 = ((A%C)*(B%C))%C;
            
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
        } else {
            System.out.println("please input the number between 1~10000");
        }
    }
}
