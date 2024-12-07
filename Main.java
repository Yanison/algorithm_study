import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String lines = br.readLine().trim().toUpperCase();
//        char[] l = lines.toCharArray();
//        Arrays.sort(l);
//        char c = '?';
//        int n = 0;
//        System.out.println(l);
//        for(int i = 1 ; i < l.length ; i++){
//
//            char p = l[i - 1];
//            int t = i - n;
//
//            if(l[i - 1] != l[i] || i == l.length - 1) {
//                int w = i - 1; //직전문자 위치
//                System.out.println("현재문자 : "+l[i]+" 직전문자: " + p + " 직전문자 갯수: " + t + " 가장많은 문자수 : " + n + " 가장 많은 문자: " + c);
//                if (t > n) {
//                    n = t;
//                    c = p;
//                }else if(t == n){
//                    c = '?';
//                }
//            }
//        }
//        System.out.println(c);
//    }
//}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine().trim().toUpperCase();
        char[] l = lines.toCharArray();
        Arrays.sort(l);
        char c = '?';
        int idx = 0;
        int n = 0;
        System.out.println(l);
        for(int i = 1 ; i < l.length ; i++){
            idx ++;

            if(l[i - 1] != l[i] || i == l.length - 1) {
                if(i == l.length - 1){idx++;}
                System.out.println("현재문자 : "+l[i]+" 직전문자: " + l[i - 1] + " 직전문자 갯수: " + idx + " 가장많은 문자수 : " + n + " 가장 많은 문자: " + c);
                if(idx > n){
                    n = idx;
                    c = l[i - 1];
                }else if(idx == n){
                    c = '?';
                    break;
                }
                idx = 0;
            }
        }
        System.out.println(c);
    }
}