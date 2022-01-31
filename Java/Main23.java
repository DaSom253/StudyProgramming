package javaPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 20220131
// 3052번 문제
// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

// 내 생각
// 1. 10개를 입력 받음과 동시에 42로 나눈 나머지를 구한다.
// 2. 배열에 넣는다.
// 3. 중복 배열을 삭제한 후 length를 구한다.
// 4. 서로 다른 값이 몇 개 있는지 출력한다.

public class Main23 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1. 배열을 미리 만든다.
		int[] arr = new int[10];
		int size = arr.length;
		// 2. 10개를 입력 받음과 동시에 42로 나눈 나머지를 구한다.
		for(int i = 0; i<size; i++) {
			// 3. 배열에 넣는다.
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		// 4. 중복 배열을 삭제한 후 length를 구한다.
		// ??? set, hashset 등 많은 중복 배열에 관한 사용법이 있는데 잘 모르겠다. ???
		// HashSet<Stirng> hashSet = new HashSet<>(Arrays.asList(var));
		// String[] resultArr = hashSet.toArray(new Stirng[0]);
		// 5. 서로 다른 값이 몇 개 있는지 출력한다.
		System.out.println(resultArr.length);
	}
}


// 참고한 알고리즘 (20220131 참고)
// import java.util.HashSet;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
 
// public class Main {
 
// 	public static void main(String[] args) throws IOException {
		// !!! set의 성질을 그대로 상속 받은 set 인터페이스 구현 클래스 : HashSet !!!
		// !!! set : 객체를 중복해서 저장할 수 없고 하나의 null 값만 저장할 수 있다. 저장 순서 유지 되지 않음 (LinkedHashSet은 가능, TreeSet은 자동 정렬)!!!
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// HashSet 정의
// 		HashSet<Integer> h = new HashSet<Integer>();
 
		// HashSet에 숫자를 42로 나눈 나머지를 넣는다.
		// 그러면 자동으로 중복된 객체는 저장되지 않는다.
// 		for (int i = 0; i < 10; i++) {
// 			h.add(Integer.parseInt(br.readLine()) % 42);
// 		}
		// HashSet의 크기를 알기위해 .size()를 해준다. : 서로 다른 나머지 값의 수
// 		System.out.print(h.size());
// 	}
// }
// 1. 굳이 배열을 선언할 필요가 없었다.
// 2. for문으로 수를 집어넣는 것은 좋았다.
// 3. 크기를 출력한다는 것도 좋았다.
// 4. HashSet과 관련한 방법들을 더 익힐 필요성이 있다.


//20220131 풀이
		// String var = String.valueOf(Integer.parseInt(br.readLine())%42) 
		// + String.valueOf(Integer.parseInt(br.readLine())%42) + String.valueOf(Integer.parseInt(br.readLine())%42) 
		// + String.valueOf(Integer.parseInt(br.readLine())%42) + String.valueOf(Integer.parseInt(br.readLine())%42) 
		// + String.valueOf(Integer.parseInt(br.readLine())%42) + String.valueOf(Integer.parseInt(br.readLine())%42) 
		// + String.valueOf(Integer.parseInt(br.readLine())%42) + String.valueOf(Integer.parseInt(br.readLine())%42) 
		// + String.valueOf(Integer.parseInt(br.readLine())%42);
		// // 뭔가 잘못된 것 같다는 생각이 들었다.

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// int A = Integer.parseInt(br.readLine());
// int B = Integer.parseInt(br.readLine());
// int C = Integer.parseInt(br.readLine());
// int ABC = A * B * C;
// br.readLine은 한 줄씩 입력받기 때문에 이렇게 작성가능
// == // int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

// 참고한 알고리즘 (20220122 참고, 20220131 참고)
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// int[] arr = new int[10];
// int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
// String str = String.valueOf(val);
// for (int i = 0; i < str.length(); i++) {
// 	arr[(str.charAt(i) - 48)]++;
// }
// for (int v : arr) {
// 	System.out.println(v);
// }

// 알고리즘 해석
// 1. 0부터 9까지 분류할 배열 정의
// 2. A * B * C
// 3. val을 String으로 만들어준다.
// 4. String의 길이만큼 for문 반복, arr[(str.charAt(i) - 48)]++; == arr[(str.charAt(i) - '0')]++;
// 4-2. str.charAt(i)는 String(i)에 해당하는 문자를 뽑아옴. 즉 arry에 str.charAt(i)가 1이면 arr[1]에 +!을 해준다.
// 5. arr에 담긴 데이터를 차례대로 v에 넣어 한 줄씩 출력한다.

// 기초가 아직도 많이 부족하다..