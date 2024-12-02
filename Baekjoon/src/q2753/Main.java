package q2753;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print("1"); // 윤년일 경우
        } else {
            System.out.print("0"); // 윤년이 아닐 경우
        }
        
        sc.close();
    }
}