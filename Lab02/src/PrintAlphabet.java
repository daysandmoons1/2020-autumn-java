// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 23.
// 문제번호 : 실습 2
// 문제설명 : a부터 입력한 알파벳까지 출력

import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 알파벳 입력
		System.out.print("소문자 알파벳 하나를 입력하세요>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		// 알파벳 출력
		for(char i=c;i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		scanner.close();
	}
}
