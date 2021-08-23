package bruteForce;

import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //카드 개수
		int M = sc.nextInt(); //카드 합
		
		if(N<3 || N>100) {
			System.out.print("다시입력(N,M) : ");
			N = sc.nextInt();
			M = sc.nextInt();
		}
		if(M<10 || M>300000) {
			System.out.print("다시입력(M) : ");
			M = sc.nextInt();
		}
		
		int[] cardArr = new int[N];
		
		for(int i=0; i<N; i++) {
			cardArr[i] = sc.nextInt();
		}
		
		
//		System.out.println(N);
//		System.out.println(M);
//		
//		for(int i=0; i<N; i++) {
//			System.out.print(cardArr[i]+" ");
//		}		
		sc.close();
		
		//출력 결과 변수
		int res = 0;
		
		for (int i = 0; i < N - 2; i++) { //i,j,k -> N-2,N-1,N
			//두번째 카드는 첫번째 카드 다음부터 N-1까지
			for (int j = i + 1; j < N - 1; j++) {
				//세번째 카드는 두번째 카드 다음부터 N까지
				for (int k = j + 1; k < N; k++) {
					
					//3개 카드의 합
					int tmp = cardArr[i] + cardArr[j] + cardArr[k];
					
					//M과 세 카드의 합이 같다면 
					if (M == tmp) {	
						res = tmp;
						break;
					}
					
					//세 카드의 합이 이전보다 크면서 M보다 작을 경우 
					if(res < tmp && tmp < M) {
						res = tmp;
					}
				}
			}
		}
		
		System.out.println("결과 : " + res);
	}

}
