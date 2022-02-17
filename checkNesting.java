/*

중첩괄호

왼쪽과 오른쪽 괄호 문자가 포함된 문자열이 주어졌다.
괄호가 제대로 중첩되어 있는지 판단하는 코드를 작성하라.
예를 들어 (())와 ()()에서는 괄호가 제대로 중첩되어 있지만 (()())(에서는 그렇지 않다.

*/

public static boolean checnNesting(String s) {
  int count = 0;
  for (int i=0; i<s.length(); ++i) {
    char ch = s.charAt(i);
    if ( ch='(') {
      ++count;
    } else if (ch=')') {
      -count;
      if ( count <0 ) return false;
    }
  }
  return count = 0;
}
