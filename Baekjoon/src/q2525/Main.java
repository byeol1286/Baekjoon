package q2525;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();  // 현재 시
        int M = sc.nextInt();  // 현재 분
        int Cook = sc.nextInt();  // 조리 시간
        
        // 분 단위 합산
        M += Cook;
        
        // 시와 분 보정
        H += M / 60;  // 분이 60 이상이면 시간을 증가
        M %= 60;      // 남은 분
        
        // 24시간 형식으로 보정
        H %= 24;      // 시간이 24 이상이면 0으로 돌아감

        System.out.printf("%d %d", H, M);
        sc.close();
    }
}