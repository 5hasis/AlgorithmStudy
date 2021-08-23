package bruteForce;

import java.util.Scanner;

public class BulkRank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//��ü ��� �� �Է�
		int N = sc.nextInt(); 
		
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt(); //Ű
			arr[i][1] = sc.nextInt(); //������
		}
		sc.close();
		
		//���� ������ �迭 ����
		int[] rank = new int[N];
		for(int i=0; i<N; i++) {
			int cnt = 0;
			for(int j=0; j<N; j++) {
				//���� �ι��̶�� �н�
				if(i == j) {
					continue;
				}
				//Ű�� ������ ���ؼ� �Ѵ� ũ�� +1
				else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					cnt += 1;
				}
			}
			//�� ������ ������ ū����� �� +1
			rank[i] = cnt+1;
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(rank[i] +" ");
		}
		
	}
}
