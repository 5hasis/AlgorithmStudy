package bruteForce;

import java.util.Scanner;

public class BulkRank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//전체 사람 수 입력
		int N = sc.nextInt(); 
		
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt(); //키
			arr[i][1] = sc.nextInt(); //몸무게
		}
		sc.close();
		
		//순위 저장할 배열 선언
		int[] rank = new int[N];
		for(int i=0; i<N; i++) {
			int cnt = 0;
			for(int j=0; j<N; j++) {
				//같은 인물이라면 패스
				if(i == j) {
					continue;
				}
				//키와 몸무게 비교해서 둘다 크면 +1
				else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					cnt += 1;
				}
			}
			//내 순위는 나보다 큰사람들 수 +1
			rank[i] = cnt+1;
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(rank[i] +" ");
		}
		
	}
}
