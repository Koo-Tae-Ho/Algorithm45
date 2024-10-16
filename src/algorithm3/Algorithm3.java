package algorithm3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Algorithm3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] inputNum = new int[10];
        for(int i = 0; i < inputNum.length; i++){
            inputNum[i] = scan.nextInt();
        }

        // 사용자 input

        // 1 2 2 3 1 4 2 2 4 3

        // 1: 2회
        // 2: 4회 -> 최빈수
        // 3: 2회
        // 4: 2회

        int[] mode = new int[10];

        // 인덱스 -> 출현한 수
        // index 값 -> index(출현한 수)가 몇번나왔는지 저장하는 용도
        // "mode[3] = 5, => 3번숫자가 5번 출현했다"

        // inputNum 1 2 2 3 1 4 2 2 4 3
        for(int i = 0; i < mode.length; i++){
            mode[inputNum[i]]++;
        }

        int max = 0; // 최빈수가 나온 횟수

        for(int i = 0; i < mode.length; i++){
            if(mode[i] > max){
                max = mode[i];
            }
        }

        // 최빈수를 모두 저장할 리스트
        List<Integer> modeList = new ArrayList<>();
        for (int i = 0; i < mode.length; i++) {
            if (mode[i] == max) {
                modeList.add(i); // 최빈수 추가
            }
        }

        System.out.println(Arrays.toString(mode));
        System.out.println("최빈수: " + modeList);
        System.out.println("최빈수가 나온 횟수: " + max);

//        for(int i = 0; i < inputNum.length; i++){
//            for(int j = 0; j < mode.length; j++){
//                if(inputNum[i] == j){
//                    mode[j]++;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(mode));
    }
}
