package coding_quiz;

public class StrToInt {
    public int getStrToInt(String str) {
            boolean Sign = true;
            int result = 0;

      for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '-')
                    Sign = false;
                else if(ch !='+')
                    result = result * 10 + (ch - '0');
            }
            return Sign?1:-1 * result;
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}

/*

class Solution {
    public int solution(String s) {
        // 절대값으로 변환, 문자열 부호에 따라 -1, 1 
        int sign = (s.charAt(0) == '-') ? -1 : 1;

        // 부호가 있는 경우 부호 제거 하여 절대값 만들기
        if(s.charAt(0) == '-' || s.charAt(0) =='-'){
            s = s.substring(1);
        }
        // 문자열을 숫자로 변환하여 반환
        return Integer.parseInt(s) * sign;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
    }
}


 */