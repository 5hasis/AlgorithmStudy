package bruteForce;

import java.util.Scanner;

//failed...
//8x8ũ�Ⱑ ���ü� �ִ� ����Ǽ� ã��
//m,m+7 n,n+7 
//white üũ���̶� blacküũ�� ���� �ٸ��� ���ؼ� ã��
public class Chessboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); //ü���� �� �Է�
		int N = sc.nextInt(); //ü���� �� �Է�
		
		//N�� M�� 8���� ũ�ų� ����, 50���� �۰ų� ���� �ڿ���(�׷��ٰ� ������)
		
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
