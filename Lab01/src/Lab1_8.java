// 1812515 김선효
// 21. 06. 22.
// 4번째 문제
// 사용자가 입력한 사각형이 꼭짓점이 (100, 100), (200, 200)인 사각형과 충돌하는지 판별

import java.util.Scanner;

public class Lab1_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 왼쪽 하단
		System.out.print("x1, y1 입력>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		// 오른쪽 상단
		System.out.print("x2, y2 입력>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(x1>200 || y1>200 || x2<100 || y2<100) {
			System.out.print("충돌 없음");
		}
		else
			System.out.print("충돌 발생");
		
		scanner.close();
	}
}
