package bruteForce;

import java.util.Scanner;

public class Decomposition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N의 생성자 구하기
		int N = sc.nextInt();
		sc.close();
		
		//생성자는 N보다 작아야함
		for(int i = 1; i<N; i++) {
			int decom = i;
			int num = i;
			while(num!=0) {
				decom += num%10;
				num /= 10;
			}
			if(decom == N) { //일치하면 반복문 빠져나가기 = 가장 작은수 
				System.out.println(i);
				break;
			}
		}
		
		
	}
}
