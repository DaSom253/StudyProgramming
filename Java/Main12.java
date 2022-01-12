package javaPack;

import java.io.*;

// 20220112
// 11021번 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class Main11 {

	public static void main(String[] args) throws IOException {
		//런타임 에러 나는 코드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			bw.write("case #" + i + ": " + (A+B) + "\n");
		}
		bw.flush();
		
	}

}

// 런타임 에러때문에, 찾아본 알고리즘 중 내 제출 답안과 비슷하면서도 더욱 최적인 알고리즘.
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