package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 20220122
// 2577번 문제
// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
// 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

// ? : 숫자가 몇 번 쓰였는지 세는법
// ? : 나열하는 법

public class Main22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int ABC = A * B * C;
		// br.readLine은 한 줄씩 입력받기 때문에 이렇게 작성가능
		// == // int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
	}
}

// 참고한 알고리즘 (20220122 참고)
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// int[] arr = new int[10];
// int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
// String str = String.valueOf(val);
// for (int i = 0; i < str.length(); i++) {
// 	arr[(str.charAt(i) - 48)]++;
// }
// for (int v : arr) {
// 	System.out.println(v);
// }

// 알고리즘 해석
// 1. 0부터 9까지 분류할 배열 정의
// 2. A * B * C
// 3. val을 String으로 만들어준다.
// 4. String의 길이만큼 for문 반복, arr[(str.charAt(i) - 48)]++; == arr[(str.charAt(i) - '0')]++;
// 4-2. str.charAt(i)는 String(i)에 해당하는 문자를 뽑아옴. 즉 arry에 str.charAt(i)가 1이면 arr[1]에 +!을 해준다.
// 5. arr에 담긴 데이터를 차례대로 v에 넣어 한 줄씩 출력한다.

// 기초가 아직도 많이 부족하다..