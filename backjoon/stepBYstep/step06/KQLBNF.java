package backjoon.stepBYstep.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KQLBNF {
    public static void main1(String[] args) throws IOException { // 메모리 14372 KM 시간 100 ms
        int[] arr = {1,1,2,2,2,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i : arr){
            sb.append(i - Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.println(sb);
    }

    public static void main2(String[] args) throws IOException { // 메모리 15860 KM 시간 116 ms
        int[] arr = {1,1,2,2,2,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i : arr){
            System.out.print((i - Integer.parseInt(st.nextToken())) + " ");
        }
    }

    public static void main3(String[] args) throws IOException { // 메모리 16860 KM 시간 156 ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l = br.readLine().trim();
        String[] nums = l.split(" ");
        System.out.println(
                (1-Integer.parseInt(nums[0])) + " "
                        + (1-Integer.parseInt(nums[1])) + " "
                        + (2-Integer.parseInt(nums[2]))+ " "
                        + (2-Integer.parseInt(nums[3]))+ " "
                        + (2-Integer.parseInt(nums[4])) + " "
                        + (8-Integer.parseInt(nums[5]))
        );
    }
}
