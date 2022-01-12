package javaPack;

import java.util.Scanner;

// 20220108
// 10950번 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class Main8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(A + B);
		}
		in.close();
	}

}