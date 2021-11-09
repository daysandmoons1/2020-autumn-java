// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 28.
// 문제번호 : 실습 3
// 문제설명 : Circle 클래스를 작성

import java.util.Scanner;

public class StringRotate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어와 한글, 특수문자 모두 가능합니다.");
		String string = scanner.nextLine();
		
		
		
		
		for(int i=0; i<string.length(); i++) {
			
			// i+1번째 인덱스부터 마지막 인덱스까지 출력
			System.out.print(string.substring(i+1));
			
			// 0번째 인덱스부터 i번째 인덱스까지 출력
			System.out.println(string.substring(0, i+1));
		}
		
		scanner.close();
	}
}