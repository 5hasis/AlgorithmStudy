package bruteForce;

import java.util.Scanner;

public class MovieDirector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //몇번째 영화
		sc.close();
		
		int cnt = 1;
		int dooms = 666;
		
		while(cnt != N) {
			dooms += 1;
			if(String.valueOf(dooms).contains("666")) {
				cnt += 1;
			}
		}
		System.out.println(dooms);
	}
}
