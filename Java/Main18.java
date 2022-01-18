package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

// 20220118
// 10951번 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class Main18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		// null값을 판별할 변수를 지정한다.	
		String str;
		while((str=br.readLine()) != null) {		
			// 값을 while문 안에서 받는 것이 아닌
			// while문을 시작하기 전 값을 계속해서 검사함.
			// 따라서 st = new StringTokenizer(str," ");에서
			// str에서 공백을 기준으로 값을 구별함.
			st = new StringTokenizer(str," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
}



// EOF라는 개념의 이해가 필요하다.
// 입력에서 더이상 읽을 수 있는 데이터가 존재하지 않을 때 반복문 종료
// hasNextInt()는 입력값이 정수일경우 true 정수가 아닐 경우 더이상 입력을 받지 않고 false를 반환.

// 작성해본 알고리즘
// 종료 시점이 없는줄 알았다.
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// StringTokenizer st;
// StringBuilder sb = new StringBuilder();
// while(true) {
// 	// st를 사용하여 테스트 케이스를 공백을 기준으로 구분한다.		
// 	st = new StringTokenizer(br.readLine()," ");
// 	int A = Integer.parseInt(st.nextToken());
// 	int B = Integer.parseInt(st.nextToken());
// 	// 만약 두 수에 0이 입력되면 저장해둔 sb를 출력한다.
// 	// 두 수가 0이 아닐시 A와 B를 더한 값을 저장하고 \n 한다.
// 	sb.append((A+B)).append('\n');
// }
// // !!! sb를 사용하면 배열에 저장하고 출력하는 것처럼 사용할 수 있는듯하다. !!!
// // !!! 즉, 한 번에 출력이 가능하다. !!!
// // 출력횟수를 줄이기 위해 사용하는듯하다.
// System.out.println(sb);


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