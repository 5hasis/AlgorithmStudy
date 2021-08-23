package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberSort2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//시간 단축을 위해 Scanner 대신 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		if(N>=1 && N <=10000000) {
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(arr);
			for(int i=0; i<N; i++) {
				sb.append(arr[i]).append('\n');
			}
			System.out.println(sb);
		}
	}

}
