package string;

import java.util.Scanner;

public class ConvertCase {
    /**
     * 설명
     * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
     * 문자열은 영어 알파벳으로만 구성되어 있습니다.
     *
     * 출력
     * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(ConvertCase.solution(str));

    }

    public static String solution(String str) {
        String answer = "";

        /**
         * Character 클래스의 메소드를 사용하였으나 아스키코드값 32를 더하고 빼줘도 된다.
         */
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
            else answer+= Character.toLowerCase(x);
        }

        return answer;
    }
}
