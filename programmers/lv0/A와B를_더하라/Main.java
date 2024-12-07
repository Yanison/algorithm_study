package programmers.lv0.A와B를_더하라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
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

