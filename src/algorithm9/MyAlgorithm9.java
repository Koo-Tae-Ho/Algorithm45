package algorithm9;

import java.util.Scanner;

public class MyAlgorithm9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num = scan.next();

        int answer = 0;

        for(Character ch : num.toCharArray()){
            answer += (ch - '0');
        }

        System.out.println(answer);
    }
}
