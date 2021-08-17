package string;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String str = in.next();
        char c = in.next().charAt(0);

        System.out.println(FindCharacter.solution(str, c));

        return ;
    }

    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()) {
            if(x == t) answer++;
        }
        return answer;
    }
}
