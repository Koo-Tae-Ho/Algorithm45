package algorithm4;

import java.util.Scanner;
import java.util.Stack;

public class MyAlgorithm4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        Stack<Integer> stack = new Stack<Integer>();

//        while (num / 2 > 0){
//
//            int remain = num % 2;
//            stack.push(remain);
//
//            num = num / 2;
//            if (num == 1){
//                stack.push(1);
//            }
//        }

        // 이진수 변환을 위해 스택에 나머지를 저장
        while (num > 0) {
            int remain = num % 2;
            stack.push(remain);
            num = num / 2;
        }

        // 스택의 모든 요소를 pop하여 결과 문자열로 만듦
        StringBuilder answer = new StringBuilder();  // 문자열을 효율적으로 생성하기 위해 StringBuilder 사용
        while (!stack.isEmpty()) {
            answer.append(stack.pop());  // 스택에서 요소를 꺼내 문자열에 추가
        }

        // 결과 출력
        System.out.println(answer.toString());
    }
}
