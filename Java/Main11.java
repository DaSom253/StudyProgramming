package javaPack;

import java.io.*;

// 20220111
// 2742번 문제
// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

public class Main11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int Tr = T;
		
		for(int i = 0; i < T; i++) {
			bw.write(Tr + "\n");
			Tr -= 1;
		}
		bw.flush();
		
	}

}