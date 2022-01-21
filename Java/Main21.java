package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 20220121
// 2562번 문제
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
// 예를 들어, 서로 다른 9개의 자연수
// 3, 29, 38, 12, 57, 74, 40, 85, 61
// 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

public class Main21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 9;
		int[] arry = new int[N];
		for (int i = 0; i < N; i++) {
			arry[i] = Integer.parseInt(br.readLine());
			}
		// 이 방법은 최댓값을 간편하게 구하는 방법이다.
		// Arrays.sort(arry);
		// int max = arry[arry.length-1];

		// 참고한 알고리즘 해석
		int max = 0;
 		int index = 0;
		int count = 0;
		// for(A : B)의 의미 : B에서 차례대로 객체를 꺼내서 A에 넣겠다는 의미
 		for(int value : arry) {
			// 인덱스 번호를 카운트하는 변수 (arry 안 데이터 수 만큼 카운트하게 됨)
			// 또한 for문 시작과 동시에 1을 추가하기 때문에 1, 2, 3, 4 ..., 이런 식으로 인덱스 번호가 아닌 1부터 시작하는 번호로 시작한다.
 			count++;
			// arry 안에 있는 데이터보다 max가 더 작다면 max의 값을 arry 안의 데이터로 변경한다. (최댓값)
 			if(value > max) {
 				max = value;
				// 최댓값의 인덱스 번호 또한 변경 및 저장한다.
 				index = count;	
		 	}
			// 만일 이 자리에 count++를 작성했다면 index에는 0부터 시작하는 인덱스 번호가 저장되었을 것이다.
		 }
		System.out.println(max);
		System.out.println(index);
	}
}

// 20220120 문제에서 최댓값 최솟값을 구하는 방식과는 다르게 해야하는 것 같은데 잘 모르겠다.
// 최댓값 구하는 방법만 알았다.


// 참고한 알고리즘 (20220121 참고)
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
// int[] arr = new int[9];

// for(int i = 0 ; i < 9 ; i++) {
// 	arr[i] = Integer.parseInt(br.readLine());
// }

// int max = 0;
// int index = 0;

// int count = 0;

// for(int value : arr) {
// 	count++;
// 	if(value > max) {
// 		max = value;
// 		index = count;
// 	}
// }

// System.out.println(max);
// System.out.println(index);