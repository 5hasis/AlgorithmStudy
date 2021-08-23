package sort;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if(N>=1 && N <=10000000) {
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			sc.close();
			//오름차순 정렬
			Arrays.sort(arr);
			for(int i=0; i<N; i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
