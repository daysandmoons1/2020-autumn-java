// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 23.
// 문제번호 : 실습 6
// 문제설명 : 과목 입력 시 점수 출력

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// 값 선언
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		int key=0;
		
		while(true) {
			System.out.print("과목 이름>>");
			String name = scanner.next();
			
			// "그만" 입력 시
			if("그만".equals(name)) {
				break;
			}
			
			// 과목 별 점수 출력
			for(int i=0; i<5; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					key = 1;
				}
			}
			
			// 존재하지 않는 과목을 입력했을 경우
			if(key == 0) {
				System.out.println("없는 과목입니다.");
			}
			key = 0;
		}
		scanner.close();
	}
}
