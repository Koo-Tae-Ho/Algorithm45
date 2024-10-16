package algorithm7;

public class Algorithm7 {

    public static void main(String[] args) {

        int num = 13;

        // 1과 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가 아님

        boolean isPrimeNumber = true;

         for(int i = 2; i <= num/2; i++){
             if(num % i == 0) {
                 isPrimeNumber = false;
             }
         }

         if(isPrimeNumber){
             System.out.println(num + "은 소수 입니다.");
         }else {
             System.out.println(num + "은 소수가 아닙니다.");
         }
    }
}
