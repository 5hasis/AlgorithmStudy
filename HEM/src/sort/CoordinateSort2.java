package sort;

import java.util.Arrays;
import java.util.Scanner;

//�ڹ� ���� �Լ� ��� ����
public class CoordinateSort2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[N][2];
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr, (n, m) -> { 
			//y�� ������
			if(n[1] == m[1]){
				//x������ ���ؼ� return
				return Integer.compare(n[0],m[0]); 
			}
			else{ 
				//y�� �ٸ��� �׳� y������ ���Ѱ� return
				return Integer.compare(n[1],m[1]); 
			} 
		});
		
		for(int i=0; i<N; i++) {
			System.out.print(arr[i][0] +" ");
			System.out.print(arr[i][1]);
			System.out.println();
		}
	}

}
