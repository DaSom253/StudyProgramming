package javaPack;

import java.io.*;

// 필요한 import
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.BufferedWriter;
// import java.io.OutputStreamWriter;
// import java.io.IOException;

// 20220114
// 2438번 문제
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

public class Main14 {

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
			for(int j = 1; j <= i; j++) {
				// 문자열에 " " 표시 안해서 컴파일 에러뜸
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


// 참고한 알고리즘
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