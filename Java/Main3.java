package javaPack;

import java.util.Scanner;

// 20220103
// 9498번 문제
// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		in.close();
		
		if (score >= 90)
			System.out.println("A");
		else { 
			if (score >= 80)
				System.out.println("B");
			else
				if (score >= 70)
					System.out.println("C");
				else
					if (score >= 60)
						System.out.println("D");
					else
						System.out.println("F");
		}
	}

}
