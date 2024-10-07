package q1546;

import java.util.Arrays;
import java.util.Scanner;
//Arrays 사용
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        
        // 배열의 최대값 찾기
        int max = Arrays.stream(A).max().getAsInt();
        
        // 배열의 합계
        long sum = Arrays.stream(A).sum();
        
        System.out.println(sum * 100.0 / max / N);
        sc.close();
    }
}