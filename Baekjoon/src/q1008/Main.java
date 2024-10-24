package q1008;

import java.util.Scanner;
//float: 4바이트(32비트) 소수점 이하 약 7자리까지 표현, double: 8바이트(64비트) 소수점 이하 약 15자리까지 표현
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		sc.close();
		
		double A = (double)N;
		double B = (double)M;
		
		System.out.print(A/B);

	}

}
