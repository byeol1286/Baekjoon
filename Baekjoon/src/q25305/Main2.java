package q25305;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int k = sc.nextInt();
        
        Integer[] arr = new Integer[N];  // 내림차순 정렬을 위해 Integer 배열 사용
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(arr, Collections.reverseOrder());  // 내림차순 정렬
        int cut = arr[k - 1];
        
        System.out.println(cut);
    }
}