package bruteForce;

import java.util.Scanner;

public class Decomposition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N�� ������ ���ϱ�
		int N = sc.nextInt();
		sc.close();
		
		//�����ڴ� N���� �۾ƾ���
		for(int i = 1; i<N; i++) {
			int decom = i;
			int num = i;
			while(num!=0) {
				decom += num%10;
				num /= 10;
			}
			if(decom == N) { //��ġ�ϸ� �ݺ��� ���������� = ���� ������ 
				System.out.println(i);
				break;
			}
		}
		
		
	}
}
