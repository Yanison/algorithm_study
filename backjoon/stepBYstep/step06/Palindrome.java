package backjoon.stepBYstep.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    /**
     * 팰린드롬은 앞으로 읽으나 뒤로 읽으나 같은 문자열을 말한다.
     * 팰린드롬이면 1을 출력 아니면 0을 출력하라
     */
}

//public class Palindrome {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String lines = br.readLine().trim();
//
//        char[] line = lines.toCharArray();
//        int len = line.length / 2;
//        int answer = 1;
//        for(int i = 0; i < len ; i++){
//            boolean isEven = line.length % 2 == 0;
//            int backward = isEven ? Math.abs((len-1) - i) : Math.abs(len-1 - i);
//            int forward  = isEven ? len+i             : len+1+i;
//            boolean e = line[backward] == line[forward];
//            if(!e){ answer=0; break; }
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String lines = br.readLine().trim();
//        char[] line = lines.toCharArray();
//
//        int answer = 1;
//        for(int i = 0; i < line.length / 2 ; i++){
//            boolean e = line[i] == line[(line.length-1)-i];
//            if(!e){ answer=0; break; }
//        }
//        System.out.println(answer);
//    }
//}