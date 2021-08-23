package sort;

import java.util.Scanner;

public class CoordinateSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[N][2];
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				//y�� ���Ͽ� �� ũ�� �ڸ� �ٲٱ�
				if(arr[i][1] < arr[j][1]) {
					int tmpX = arr[i][0];
					int tmpY = arr[i][1];
					
					arr[i][0]=arr[j][0];
					arr[i][1]=arr[j][1];
					arr[j][0] = tmpX;
					arr[j][1] = tmpY;
				}
				//y�� ������ 
				else if(arr[i][1] == arr[j][1]) {
					//x�� ���Ͽ� �ڸ� �ٲٱ�
					if(arr[i][0] < arr[j][0]) {
						int tmpX = arr[i][0];
						int tmpY = arr[i][1];
						
						arr[i][0]=arr[j][0];
						arr[i][1]=arr[j][1];
						arr[j][0] = tmpX;
						arr[j][1] = tmpY;
					}
				}
			}
		}
		for(int i=0; i<N; i++) {
			System.out.print(arr[i][0] +" ");
			System.out.print(arr[i][1]);
			System.out.println();
		}
	}

}
