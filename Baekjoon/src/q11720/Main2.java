package q11720;

import java.math.BigInteger;
import java.util.Scanner;
//BigInteger 사용 int, long보다 높은 값을 받을 수 있음
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt();

        String numbers = sc.next();
        
        sc.close();
        
        BigInteger sum = BigInteger.ZERO;
        

        for (int i = 0; i < numbers.length(); i++) {
            // 문자를 BigInteger로 변환
            BigInteger num = new BigInteger(numbers.substring(i, i + 1));
            sum = sum.add(num);
        }
        
        System.out.println(sum);
    }
}