package bruteForce;

import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //ī�� ����
		int M = sc.nextInt(); //ī�� ��
		
		if(N<3 || N>100) {
			System.out.print("�ٽ��Է�(N,M) : ");
			N = sc.nextInt();
			M = sc.nextInt();
		}
		if(M<10 || M>300000) {
			System.out.print("�ٽ��Է�(M) : ");
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
		
		//��� ��� ����
		int res = 0;
		
		for (int i = 0; i < N - 2; i++) { //i,j,k -> N-2,N-1,N
			//�ι�° ī��� ù��° ī�� �������� N-1����
			for (int j = i + 1; j < N - 1; j++) {
				//����° ī��� �ι�° ī�� �������� N����
				for (int k = j + 1; k < N; k++) {
					
					//3�� ī���� ��
					int tmp = cardArr[i] + cardArr[j] + cardArr[k];
					
					//M�� �� ī���� ���� ���ٸ� 
					if (M == tmp) {	
						res = tmp;
						break;
					}
					
					//�� ī���� ���� �������� ũ�鼭 M���� ���� ��� 
					if(res < tmp && tmp < M) {
						res = tmp;
					}
				}
			}
		}
		
		System.out.println("��� : " + res);
	}

}
