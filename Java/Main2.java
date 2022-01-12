package javaPack;

import java.util.Scanner;

// 20220102
// 1330번 문제
// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
		
		if(A==B) {
			System.out.println("==");
		}else {
			if(A<B) {
				System.out.println("<");
			}
			if(A>B) {
				System.out.println(">");
			}
		}
	}

}
