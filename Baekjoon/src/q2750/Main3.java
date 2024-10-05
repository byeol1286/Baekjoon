package q2750;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: N개의 숫자를 받을 예정
        int N = sc.nextInt();
        int[] arr = new int[N];

        // N개의 숫자를 입력받음
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 버블 정렬 알고리즘을 사용한 정렬
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 두 값을 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 정렬된 결과를 출력
        for (int num : arr) {
            System.out.println(num);
        }

        sc.close();
    }
}