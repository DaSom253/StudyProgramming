package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 20220120
// 10818번 문제
// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

public class Main20 {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			int N = Integer.parseInt(br.readLine());
			int[] arry = new int[N];
			st = new StringTokenizer(br.readLine()," ");
			for (int i = 0; i < N; i++) {
				arry[i] = Integer.parseInt(st.nextToken());
				}
			Arrays.sort(arry);
			System.out.println(arry[0] + " " + arry[arry.length-1]);
		}
	}