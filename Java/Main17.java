package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

// 20220117
// 10952번 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class Main17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(true) {
			// st를 사용하여 테스트 케이스를 공백을 기준으로 구분한다.		
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			// 만약 두 수에 0이 입력되면 저장해둔 sb를 출력한다.
			if(A==0 && B==0) {
				break;
			}
			// 두 수가 0이 아닐시 A와 B를 더한 값을 저장하고 \n 한다.
			sb.append((A+B)).append('\n');
		}
		// !!! sb를 사용하면 배열에 저장하고 출력하는 것처럼 사용할 수 있는듯하다. !!!
		// !!! 즉, 한 번에 출력이 가능하다. !!!
		// 출력횟수를 줄이기 위해 사용하는듯하다.
		System.out.println(sb);
	}
}

	// 작성해본 알고리즘
	// 각 테스트 케이스마다 A+B를 출력한다. 인데 모든 테스트 케이스를 받아들인 후 출력인지 테스트 케이스 하나 당 즉시 출력인지 헷갈렸다.
	// 전자로 문제를 받아들이고 고민했다.
	// while문이 종료되고 나면 배열에 저장하여 한 번에 한 줄씩 출력하려했다.
	// 하지만 변수를 입력받는 것 외에 생각이 멈추었다.
	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	// int A;
	// int B;
	// while(A != 0 && B != 0) {
	// 	A = Integer.parseInt(st.nextToken());
	// 	B = Integer.parseInt(st.nextToken());
	// }

// 참고한 알고리즘 (20220117 참고)
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// import java.util.StringTokenizer;
 
// public class Main {
 
// 	public static void main(String[] args) throws IOException {
 
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
// 		StringTokenizer st;
// 		StringBuilder sb = new StringBuilder();
		
// 		while(true) {
			
// 			st = new StringTokenizer(br.readLine()," ");
// 			int A = Integer.parseInt(st.nextToken());
// 			int B = Integer.parseInt(st.nextToken());
			
// 			if(A==0 && B==0) {
// 				break;
// 			}
// 			sb.append((A+B)).append('\n');
// 		}
// 		System.out.println(sb);
// 	}
// }