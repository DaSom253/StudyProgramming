package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 20220116
// 10871번 문제
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

public class Main16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 다음으로 받을 한 줄을 문자열로 읽어들인 뒤 공백을 기준으로 분리한다.
		// BufferedReader가 필요한 이유는 StringTokenizer에 br.readLine()가 필요해서가 아닌가 추측한다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// st.nextToken()을 사용시에 StringTokenizer st;를 활용하여 공백을 기준으로 분리해주세요. 라는 빠른 명령이라고 생각한다.
		// st.nextToken()대신에 br.readLine()을 넣었더니 런타임에러가 생겼었다.
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		// StringBuilder는 string을 더하는 역할을 하는듯하다. 긴 문자열을 더해야할 경우 효과적이라고한다.
		StringBuilder sb = new StringBuilder();
		// 다음으로 받을 한 줄을 문자열로 읽어들인 뒤 공백을 기준으로 분리한다.
		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (value < X)
			// value 즉 X보다 작은 수를 문자열에 공백과 함께 차례대로 합친다.
				sb.append(value).append(' ');
		}
		// sb를 출력한다.
		System.out.println(sb);
	}

}



	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	// 01. 입력받을 정수의 개수인 N을 입력받고
	// int N = Integer.parseInt(br.readLine());
	// 02. X를 입력받아 if문으로 출력 숫자를 정하는 것이 계획이었다.
	// int X = Integer.parseInt(br.readLine());
	// 03. 입력받을 정수의 개수만큼 배열에 저장하기 위해 배열 변수를 설정했다.
	// int[] A = new int[N];
	// StringTokenizer st;
	// br.close();

	// 04. 나름 계획대로 N만큼 반복하는 for문을 만들었다.
	// for(int i = 0; i < N; i++) {
	// 05. st로 숫자를 입력 받으면,
	// 	st = new StringTokenizer(br.readLine(), " ");
	// A[] 라는 배열에 저장하는 것이 계획이었다.
	// 	A[i] = Integer.parseInt(st.nextToken());
	// 	}
	// 06. 배열에 따라 조건 X와 비교하고 TRUE일 시 출력한다.
	// for(int i = 0; i < N; i++) {
	// 	if(A[i] < X) {
	// 		bw.write(A[i]);
	// 		bw.newLine();
	// 	}
	// }
	// bw.flush();
	// bw.close();
	// !!! 라는 계획이었으나 무언가 단단히 잘못된 코드를 작성했다. !!!
	// !!! bw가 아닌 StringBuilder sb = new StringBuilder();를 사용하여 출력해주었다. !!!
	// !!! 앞으로 더 많은 문제들을 풀어보아야 익숙해질 것 같다.. !!!

// 찰고한 알고리즘 (20220116 참고)
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// import java.util.StringTokenizer;
 
// public class Main {
 
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
// 		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
// 		int N = Integer.parseInt(st.nextToken());
// 		int X = Integer.parseInt(st.nextToken());
 
// 		StringBuilder sb = new StringBuilder();
 
// 		st = new StringTokenizer(br.readLine(), " ");
		
// 		for (int i = 0; i < N; i++) {
// 			int value = Integer.parseInt(st.nextToken());
 
// 			if (value < X)
// 				sb.append(value).append(' ');
// 		}
// 		System.out.println(sb);
// 	}
// }