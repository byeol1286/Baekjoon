package q1330;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		sc.close();
		
		if(N<M) {
			System.out.print("<");
		}else if(N>M) {
			System.out.print(">");
		}else {
			System.out.print("==");
		}
	}
}
