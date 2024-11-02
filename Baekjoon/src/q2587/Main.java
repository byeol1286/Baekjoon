package q2587;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        
        sc.close();
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        int average = sum / 5;
        
        Arrays.sort(numbers);
        int median = numbers[2];
        
        System.out.println(average);
        System.out.println(median);
    }
}
