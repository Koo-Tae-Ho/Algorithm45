package algorithm7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyAlgorithm7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }

            if(list.size() > 2) {
                break;
            }
        }

        if(list.size() == 2) {
            System.out.println("입력하신 " + n + "은 소수입니다.");
            System.out.println("소수: " + list.get(0) + ", " + list.get(1));
        } else {
            System.out.println("입력하신 수는 소수가 아닙니다.");
        }

    }
}
