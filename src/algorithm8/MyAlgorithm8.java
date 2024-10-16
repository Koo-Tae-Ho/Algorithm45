package algorithm8;

import java.util.Scanner;

public class MyAlgorithm8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int answer = 1;

        for(int i = num; i > 0; i--){
            answer *= i;
        }

        System.out.println(answer);
    }
}
