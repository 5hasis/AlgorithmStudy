package sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N>=1 && N<=20000) {
			//단어 중복을 위해 HashSet으로 저장
			HashSet<String> hashWords = new HashSet<>();
			for(int i=0; i<N; i++) {
				hashWords.add(sc.next());
			}
			//HashSet 크기 만큼 배열 생성 
			String[] words = new String[hashWords.size()];
			hashWords.toArray(words);
			sc.close();
			
			//lambda식 이용하여 길이 비교
			Arrays.sort(words, (s1, s2)-> {
				return Integer.compare(s1.length(), s2.length());
			});
			
			int i,j;
			int hashSize = hashWords.size();
			for(i=0; i<hashSize; i++) {
				int len = words[i].length();
				
				//짧은 글자부터 시작
				for(j=i+1; j<hashSize; j++) {
					//더이상 같은 글자수가 아니면
					if(len<words[j].length()) {
						break;
					}
				}
				//같은 글자수인 i~j 사이만 정렬
				Arrays.sort(words, i, j);
				i = j-1;
			}
			
			for(i=0; i<hashSize; i++) {
				System.out.println(words[i]);
			}
		}
		
	}
}
