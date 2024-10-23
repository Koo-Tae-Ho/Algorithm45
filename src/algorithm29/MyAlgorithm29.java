package algorithm29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Algorithm29 {
    public static void main(String[] args) throws IOException {

        int[] asc = {1,2,3,4,5,6,7,8};
        int[] desc = {8,7,6,5,4,3,2,1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = br.readLine().split(" ");

        int[] temp = new int[inputArr.length];

        // 문자열을 정수로 변환하여 배열에 저장
        for (int i = 0; i < inputArr.length; i++) {
            temp[i] = Integer.parseInt(inputArr[i]);
        }

        if(Arrays.equals(temp, asc)){
            System.out.println("ascending");
        } else if(Arrays.equals(temp, desc)){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
