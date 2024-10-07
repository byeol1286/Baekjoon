package q1546;

import java.util.Scanner;
//for-each 반복문
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 최대값 찾기
        int max = 0;
        for (int score : A) {
            if (score > max) {
                max = score;
            }
        }

        // 합계
        long sum = 0;
        for (int score : A) {
            sum += score;
        }

        System.out.println(sum * 100.0 / max / N);
        sc.close();
    }
}