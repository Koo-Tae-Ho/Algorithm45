package algorithm5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyAlgorithm5 {
    public static void main(String[] args) {

        // helloWorlD -> HELLOwORLd

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        StringBuilder result = new StringBuilder();

        List<Character> wordList = new ArrayList<>();

        System.out.println(word.toCharArray());

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            wordList.add(ch);
        }

        for (Character ch : wordList) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
