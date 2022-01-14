package javaPack;

import java.io.*;
import java.util.StringTokenizer;

// 20220113
// 11022번 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class Main13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// readLine()은 한 행을 전부 읽는 방식, 공백단위로 입력 및 분리해주어야함. -> st 사용
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
		// 변수 정의를 안해주어서 컴파일 에러가 났음
		// 잊지 않기..
		StringTokenizer st;
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			// 단독으로 int형 값만 넣을경우 아스키 코드값으로 인식
			// 문자열과 int형을 함께 넣어줘야함
			// case에서 c가 대문자가 아니어서 틀렸었음
			// 문제에서 요구하는 바를 만족할 것
			bw.write("case #" + i + ": ");
			bw.write(A + " + " + B + " = ");
			bw.write((A+B) + "\n");
		}
		// 입력스트림을 닫고 사용하던 자원들을 품
		br.close();
		// 남아있는 데이터를 모두 출력
		bw.flush();
		// 스트림을 닫음, bw.flush 필요
		bw.close();
		
	}

}

// BufferedReader, BufferedWriter, StringTokenizer에 대한 이해가 아직 많이 부족한 것 같다.
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 예시 : Integer.parseInt(br.readLine());
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// 예시 : bw.write("case #" + i + ": ");
// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
// 예시 : Integer.parseInt(st.nextToken());

// 런타임 에러때문에, 찾아본 알고리즘 중 내 제출 답안과 비슷하면서도 더욱 최적인 알고리즘. (202201013 참고)
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;
// import java.io.IOException;
// import java.io.BufferedWriter;
// import java.io.OutputStreamWriter;
 
// public class Main {
// 	public static void main(String args[]) throws IOException {
 
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
// 		int T = Integer.parseInt(br.readLine());
// 		int A;
// 		int B;
 
// 		StringTokenizer st;
// 		for (int i = 1; i <= T; i++) {
// 			st = new StringTokenizer(br.readLine()," ");
 
// 			A = Integer.parseInt(st.nextToken());
// 			B = Integer.parseInt(st.nextToken());
            
// 			bw.write("Case #"+i+": ");
// 			bw.write(A + " + " + B + " = ");
// 			bw.write((A+B) + "\n");
// 		}
// 		br.close();
// 		bw.flush();
// 		bw.close();
// 	}
 
// }

// 런타임 에러때문에, 찾아본 알고리즘 중 내 제출 답안과 비슷하면서도 더욱 최적인 알고리즘. (20220112 참고)
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer; import java.io.*; 이것만 해두어서 StringTokenizer을 불러오지 못했다.
// *을 썼다고 잊지말고 꼼꼼하게 import하자.
// import java.io.IOException;
// import java.io.BufferedWriter;
// import java.io.OutputStreamWriter;
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// int a = Integer.parseInt(br.readLine());

// StringTokenizer st;
// for (int i = 1; i <= a; i++) {
// 	st = new StringTokenizer(br.readLine()," ");
//!!!! StringTokenizer을 이용하면 (입력, "기준으로 값을 입력받음") 간편하게 입력받을 수 있다. !!!!
// 	bw.write("Case #"+i+": ");
// 	bw.write(Integer.parseInt(st.nextToken())
// 		+Integer.parseInt(st.nextToken())+"\n");
// }
// br.close();
// bw.flush();
// bw.close();