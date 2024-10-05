package q11720;

import java.util.Scanner;
//가장 기본적인 풀이 주의! 두개를 따로 입력받을 필요 없음
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        String numbers = sc.next();
        
        sc.close();
        
        int sum = 0;
        
        // 문자열의 각 문자를 하나씩 추출하여 더함
        for (int i = 0; i < numbers.length(); i++) {
            sum += numbers.charAt(i) - '0';  // char를 int로 변환
        }
        
        System.out.println(sum);
    }
}