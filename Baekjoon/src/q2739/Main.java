package q2739;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			int M = i;
			int multiplication = N*i;
			
			System.out.println(N +" "+"*"+" "+M+" "+"="+" "+ multiplication);
		}
sc.close();
	}

}