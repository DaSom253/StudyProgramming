package javaPack;

import java.util.Scanner;

// 20220109
// 8393번 문제
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

public class Main9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		int B = 0;
		
		for(int i = 1; i <= N; i++) {
			int A = i;
			B = B + A;
		}
		System.out.println(B);
	}

}