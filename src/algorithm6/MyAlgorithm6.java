package algorithm6;

import java.util.Scanner;

public class MyAlgorithm6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int small;
        int big;

        if (n1 > n2) {
            big = n1;
            small = n2;
        } else {
            big = n2;
            small = n1;
        }

        int gcd = 1; // 어떤 두 수의 최대공약수는 항상 1부터 시작

        for(int i = 1; i <= small; i++){
            if(small % i == 0 && big % i == 0){
                gcd = i;
            }
        }

        System.out.println("두수의 최대 공약수: " + gcd);

    }
}
