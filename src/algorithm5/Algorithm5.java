package algorithm5;

import java.sql.SQLOutput;

public class Algorithm5 {
    public static void main(String[] args) {

        String input = "helloWorlD";

        char[] arr =  input.toCharArray();

        System.out.println(arr);

        // 아스키 코드 (대문자 소문자 차이 32)
        // 'A' ~ 'Z' = 65 ~ 90
        // 'a' ~ 'z' = 97 ~ 122
        for(int i = 0; i<arr.length; i++){

            if(arr[i] >= 'a' && arr[i] <= 'z') { // 소문자인 경우
                arr[i] = (char) (arr[i] + 'A' - 'a'); // 'A' = 65, 'a' = 97 -> 65 - 97 = -32, 소문자를 -32해서 대문자로 변환
            } else if(arr[i] >= 'A' && arr[i] <= 'Z') { // 대문자인 경우
                arr[i] = (char) (arr[i] + 'a' - 'A');
            }
        }

        System.out.println(arr);
    }
}
