package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 20220119
// 1110번 문제
// 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
// 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
// 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
// N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

// 내가 생각한 설계
// 1. N을 입력 받는다. | br.readline으로 입력 받음
// 2. 만약 N이 10보다 작으면 앞에 0을 붙여 두 자리 수로 만든다. | if (N < 10) {'0' + N} // String 상태에서 붙여준다.
// 3. 각 자리의 수를 더한다. (합) | 변수 P에 제외 integer.parseInt로 String을 int로 바꾼 다음 N0(십의 자리수) = N/10 + N1(일의 자리수) = N%10
// 5. while(N != F) { 원래 N값과 같아질 때까지 반복한다.
// 4. 주어진 수의 일의 자리수, 합의 일의 자리수를 이어붙인다. | F = N1(일의 자리수) = N%10 + P1(일의 자리수) = P%10 을 더해준다, Q++ 반복하는 횟수를 저장한다. }
// 6. N값과 같아지면, 그만큼 반복한 횟수를 출력한다. | System.out.println(Q);
// 필요한 변수 : 1. int N 2. String ifN = Integer.toString(N);, String = '0' 3. int P, N0, N1, P1 4. int F, int Q

public class Main19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 해석
		// 1. N 입력받음
		// 2. 반복한 횟수를 저장할 변수 cnt
		// 3. 기존 N을 통해 사이클 연산
		// 4. 기존 N값 copy로 저장 및 비교
		// 5. 반복문 종료 후 반복 횟수 출력
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int copy = N;
		do { // !!! 최초 1회 실행 후 while문이 true일 동안 반복!!!
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			// 사이클 해석
			// 1. 분해 
			// ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			//
			// 01. ((N % 10) * 10)
			// (N % 10) : 일의 자리 수
			// * 10 : 10의 자리 수로 바꿈, 기존 값의 일의 자리수를 의미함. (N1)
			//
			// 02. (((N / 10) + (N % 10)) % 10)
			// ((N / 10) + (N % 10))
			// % 10 : (십의 자리 수와 일의 자리 수 더한 수에서) 일의 자리 수
			// (기존값의 십의 자리 수와 일의 자리 수를 더한 값)에서 기존 값의 일의 자리수 뒤에 붙일 더한 값의 (일의 자리 수)를 구함 (P1)
			//
			// 01. 과 02. 을 while이 false가 될 때까지 반복, 반복하는 만큼 +1
			cnt++;
		} while (copy != N); // !!! true 시 반복 실행 !!!
		System.out.println(cnt);
	}
}
		// 답이 나오지 않는다.
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int N = Integer.parseInt(br.readLine()); // 1. N을 입력 받는다.
		// int P, P1, N0, N1;
		// int F = 0;
		// int Q = 0;
		// // if (N < 10) { // 2. 만약 N이 10보다 작으면 앞에 0을 붙여 두 자리 수로 만든다.
		// // 	String ifN = Integer.toString(N);
		// // 	ifN = "0" + N;
		// // 	N = integer.parseInt(ifN);
		// // }
		// // !!! 굳이 두 자리 수로 만들 필요성이 있는가 싶어서 제외했다. 0 + N = N이기 때문에 !!!
		// while(N != F) {		
		// 	N0 = N/10;
		// 	N1 = N%10;
		// 	P = N0 + N1;
		// 	P1 = P%10;
		// 	F = N1 + F1;
		// 	Q += 1;
		// }
		// System.out.println(Q);
//	}
//}
// !!! 불필요한 변수와 연산을 줄이는 연습이 필요하다. !!!


// 참고한 알고리즘
// import java.io.BufferedReader; (20220119 참고 20220121 풀이)
// import java.io.InputStreamReader;
// import java.io.IOException;
 
// public class Main {
 
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
// 		int N = Integer.parseInt(br.readLine());
		
// 		int cnt = 0;
// 		int copy = N;
        
// 		do {
// 			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
// 			cnt++;
// 		} while (copy != N);
		
// 		System.out.println(cnt);
// 	}
// }

// 정리하자면, 주어진 수 = "주어진 수의 일의 자리수(실제로는 string이 아니라 *10을 해서 십의 자리수로 만듦)" + "주어진 수의 십의 자리수 + 일의 자리수"로 사이클을 돌려서 (재정의?)
// 기존 주어진 수가 될 때 까지 반복하는 문제이다.