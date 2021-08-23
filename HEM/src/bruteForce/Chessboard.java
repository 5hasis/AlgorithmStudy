package bruteForce;

import java.util.Scanner;

//failed...
//8x8크기가 나올수 있는 경우의수 찾기
//m,m+7 n,n+7 
//white 체크판이랑 black체크판 만들어서 다른거 비교해서 찾기
public class Chessboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); //체스판 행 입력
		int N = sc.nextInt(); //체스판 열 입력
		
		//N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수(그렇다고 가정해)
		
		char[][] chess = new char[M][N];
		for(int i=0; i<M; i++) {
			String c = sc.next();
			for(int j=0; j<c.length(); j++) {
				chess[i][j] = c.charAt(j);
			}
		}
		sc.close();
	
		int cnt = 0;
		
//		for(int i=0; i<M-1; i++) {
//			for(int j=0; j<N-1; j++) {
//				if(chess[i][j] == chess[i][j+1] || chess[i][j] == chess[i+1][j]) {
//					cnt += 1;
//				}
//			}
//		}
		System.out.println(cnt);
	}
}
