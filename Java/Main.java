package javaPack;

import java.util.Scanner;

// 20220101
// 2588번 문제
// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int firstNum = in.nextInt();
		String secondNum = in.next();
		
		in.close();
		
		System.out.println(firstNum * (secondNum.charAt(2) - '0'));
		System.out.println(firstNum * (secondNum.charAt(1) - '0'));
		System.out.println(firstNum * (secondNum.charAt(0) - '0'));
		System.out.println(firstNum * Integer.parseInt(secondNum));
	}

}
