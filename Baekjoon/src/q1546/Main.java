package q1546;

import java.util.Scanner;

public class Main {
//풀이방법: (과목1+과목2+과목3)*100/M/N
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i=0; i<N; i++) {
            if(A[i] > max) max = A[i];
            sum = sum + A[i];
        }
        System.out.println(sum * 100.0 / max / N);
        sc.close();
    }
}