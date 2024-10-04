package q2750;

import java.util.Arrays;
import java.util.Scanner;

//오름차순, 중복은 안됨, 정렬문제
//임포트는 컨트롤+시프트+O
//Arrays.sort()메서드 사용
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N개의 숫자를 받을 수 있도록 칸을 만들어줌(정렬준비)
        int N = sc.nextInt();
        int[] arr = new int[N];

        // N개의 숫자를 입력받음
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        // 정렬된 결과를 출력
        for (int num : arr) {
            System.out.println(num);
        }

        sc.close();
    }
}
