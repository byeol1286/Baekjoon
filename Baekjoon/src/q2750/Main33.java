package q2750;

import java.util.Arrays;

public class Main33 {
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 5, 6};

	        // 버블 정렬 실행
	        bubbleSort(arr);

	        // 정렬된 배열 출력
	        System.out.println("Sorted array: " + Arrays.toString(arr));
	    }

	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;

	        // 배열의 크기만큼 반복
	        for (int i = 0; i < n - 1; i++) {
	            // 이미 정렬된 부분을 제외한 나머지 요소들을 비교
	            for (int j = 0; j < n - 1 - i; j++) {
	                // 인접한 두 요소 비교
	                if (arr[j] > arr[j + 1]) {
	                    // 자리 바꾸기 (swap)
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	}