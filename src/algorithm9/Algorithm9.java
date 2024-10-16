package algorithm9;

public class Algorithm9 {

    public static void main(String[] args) {

        int inputNum = 1232;
        int accSum = 0;

        // 1232 => 123 => 12 => 1
        // 2    => 3   => 2  => 1 => 합: 8

        while(inputNum > 0){
            accSum += inputNum % 10;
            inputNum /= 10;
        }

        System.out.println(accSum);
    }
}
