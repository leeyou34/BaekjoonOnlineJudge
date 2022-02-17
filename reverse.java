/*
문자열 뒤집기

라이브러리 함수를 쓰지 않고 문자열을 뒤집는 함수를 만들어라

*/

public class reverse {
  
  public static String reverse(String in) {
    String out = "";
    for( int = i = in.length() -1; i>=0; -i) {
      out += in.charAt(i);
    }
    return out;
  }
}
