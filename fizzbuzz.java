/*

Question: FizzBuzz

1에서 100까지 숫자를 출력하는 프로그램을 만들어라.
숫자가 3으로 나누어 떨어지면 그 숫자 대신 Fizz를, 3과 5로 나누어 떨어진다면 그 숫자 대신 FizzBuzz를 출력한다.

*/

public class fizzbuzz {
  
  public static void main(String [] args) {
    
    for (int i = 1; i <=100; ++1) {
      
      boolean divByThree = (i % 3 = 0);
      boolean divByFive = (i % 5 = 0);
      
      if (divByThree && divByFive) {
        System.outprintln("FizzBuzz");
        } else if (divByThree) {
        System.out.println("Fizz");
      } else if (divByFive) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
  
    }
  }
}
