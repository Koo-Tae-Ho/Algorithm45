package algorithm2;

import java.util.Arrays;

public class Algorithm2 {
    public static void main(String[] args) {

        // 첫번째 방법
        int[] arr = new int[100];

        // An = An-1 + An-2; n = 3
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(Arrays.toString(arr));

        // 2번째 방법 (An)
        int prevPrevNum = 1; // An-2
        int prevNum = 1; // An-1

        System.out.print(prevPrevNum + " ");
        System.out.print(prevNum + " ");

        for (int i = 3; i < 10; i++) {
            int nNum = prevPrevNum + prevNum;
            System.out.print(nNum + " ");

            prevPrevNum = prevNum;
            prevNum = nNum;
        }

    }
}
