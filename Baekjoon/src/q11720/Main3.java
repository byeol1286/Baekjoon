package q11720;

import java.util.Scanner;
//IntStream은 Java 8에서 도입된 Stream API 중 하나임
//성능을 최적화하기 위해 원시 타입 int를 직접 처리할 수 있도록 지원하는 특수화된 스트림
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        String numbers = sc.next();
        
        sc.close();
        
        // 문자열을 IntStream으로 변환, 합계 계산
        int sum = numbers.chars()
                         .map(c -> c - '0')  // char를 int로 변환
                         .sum();
        
        System.out.println(sum);
    }
}
