package q1000;

import java.util.Scanner;
//try-with-resources을 사용함으로써 Scanner를 자동으로 닫을 수 있음
public class Main2 {

    public static void main(String[] args) {
        // try-with-resources
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.print(N + M);
        }
    }
}
