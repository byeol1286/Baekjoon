package q2884;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if (M < 45) {
            M += 15; // 60 - 45 = 15
            H -= 1;
            if (H < 0) {
                H = 23;
            }
        } else {
            M -= 45;
        }

        System.out.printf("%d %d", H, M);
        sc.close();
    }
}