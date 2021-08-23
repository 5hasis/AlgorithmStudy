package sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N>=1 && N<=20000) {
			//�ܾ� �ߺ��� ���� HashSet���� ����
			HashSet<String> hashWords = new HashSet<>();
			for(int i=0; i<N; i++) {
				hashWords.add(sc.next());
			}
			//HashSet ũ�� ��ŭ �迭 ���� 
			String[] words = new String[hashWords.size()];
			hashWords.toArray(words);
			sc.close();
			
			//lambda�� �̿��Ͽ� ���� ��
			Arrays.sort(words, (s1, s2)-> {
				return Integer.compare(s1.length(), s2.length());
			});
			
			int i,j;
			int hashSize = hashWords.size();
			for(i=0; i<hashSize; i++) {
				int len = words[i].length();
				
				//ª�� ���ں��� ����
				for(j=i+1; j<hashSize; j++) {
					//���̻� ���� ���ڼ��� �ƴϸ�
					if(len<words[j].length()) {
						break;
					}
				}
				//���� ���ڼ��� i~j ���̸� ����
				Arrays.sort(words, i, j);
				i = j-1;
			}
			
			for(i=0; i<hashSize; i++) {
				System.out.println(words[i]);
			}
		}
		
	}
}
