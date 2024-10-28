package q10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // T를 입력
        int T = sc.nextInt();
        
        // N M를 입력받고 합 출력
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(N + M);
        }
        
        sc.close();
    }
}
