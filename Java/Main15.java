package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

// 20220115
// 2439번 문제
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
// 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

public class Main15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		//br.readLine()을 사용하고 나면 닫아주자.
		br.close();

		// for(int i = 1; i <= N; i++) {
		// *은 string이기 때문에 int 연산자인 곱하기를 사용할 수 없는듯
		// 	bw.write("*"*i); 
		// }
		
		// 따라서 행과 열을 나누어 for문을 작성함.
		// 행
		for(int i = 1; i <= N; i++) {
			//열
			// !!! 03. 따라서 forj문 안에 넣는 것이 아닌 fori문 안에 넣어야한다. !!!
			for(int k = 1; k <= N-i; k++) {
				bw.write(" ");
			}
			// !!! 04. 이 문제에서 반복문은 5를 넣었을 시 N-1에서 N-2, N-3, N-4, N-5으로 줄어든다.
			// 이때 줄어드는 수는 fori문에서 ++씩 늘어나는 i와 같기 때문에 N-i로 표현될 수 있다.!!!
			for(int j = 1; j <= i; j++) {
				// 문자열에 " " 표시 안해서 컴파일 에러뜸
				// 1. 공백은 N-1에서 한 칸씩 줄어드니까
				// for문을 사용해서 규칙적으로 출력하면 되지 않을까?
				// for(int a = N; a >= N-1; a++) {
				// 	bw.write(" ");
				// }
				// !!! 01. forj 안에 for문을 작성하지 않으면
				// 같은 줄에 출력되지 않을 것이라고 생각했는데,
				// bw.newLine을 사용하기 전까지 같은 줄에 출력된다.
				// 02. for문은 조건에 해당할 때까지 계속해서 반복 출력한다. !!!
				bw.write("*");
			}
			// \n과 같은 효과
			// bw.newline(); 이 아니라 bw.newLine();이다
			// 컴파일 에러가 뜬 두 번째 이유
			bw.newLine();
			}
		// 남아있는 데이터를 모두 출력
		bw.flush();
		// 스트림을 닫음, bw.flush 필요
		bw.close();
		
	}

}


// 참고한 알고리즘 (20220115 참고)
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.BufferedWriter;
// import java.io.OutputStreamWriter;
// import java.io.IOException;
 
// public class Main {
 
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// 		int N = Integer.parseInt(br.readLine());
// 		br.close();
 
// 		for (int i = 1; i <= N; i++) {
// 			for (int j = 1; j <= N - i; j++) {
// 				bw.write(' ');
// 			}
// 			for (int k = 1; k <= i; k++) {
// 				bw.write('*');
// 			}
// 			bw.newLine();
// 		}
// 		bw.flush();
// 		bw.close();
// 	}
// }

// 참고한 알고리즘 (20220114 참고)
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.BufferedWriter;
// import java.io.OutputStreamWriter;
// import java.io.IOException;
 
// public class Main {
 
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// 		int N = Integer.parseInt(br.readLine());
// 		br.close();
 
// 		for (int i = 1; i <= N; i++) {
// 			for (int j = 1; j <= i; j++) {
// 				bw.write('*');
// 			}
// 			bw.newLine();
// 		}
// 		bw.flush();
// 		bw.close();
// 	}
// }