// 1812515 김선효
// 21. 06. 22.
// 5번째 문제
// 사용자가 입력한 두 개의 원이 서로 충돌하는지 판별

import java.util.Scanner;

public class Lab1_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// x1, y1, radius1
		System.out.print("원의 중심 x1, y1, 반지름 radius1>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		double radius1 = scanner.nextDouble();
		
		// x2, y2, radius2
		System.out.print("원의 중심 x2, y2, 반지름 radius2>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		double radius2 = scanner.nextDouble();
		
		double distance = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
		
		if(distance <= radius1 + radius2) {
			System.out.print("두 원은 서로 겹친다.");
		}
		else
			System.out.print("두 원은 서로 겹치지 않는다.");
		
		scanner.close();
	}
}
