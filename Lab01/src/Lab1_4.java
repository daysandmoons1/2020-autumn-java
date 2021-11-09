// 1812515 김선효
// 21. 06. 22.
// 2번째 문제
// 3개의 정수 입력 시, 중간값 출력

import java.util.Scanner;

public class Lab1_4 {
	public static void main(String[] args) {
		int mid = 0; 	//추후에 값을 입력받을 거라고 해도 쓰레기 값 주면 컴파일 때 오류 남 초기화 필요
		Scanner scanner = new Scanner(System.in);
		
		// 3개의 수 입력
		System.out.print("정수 3개 입력>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		// x가 중간값일 때
		if((x>y && x<z) || (x<y && x>z)) {
			mid = x;
		}
		
		// y가 중간값일 때
		else if((y>x && y<z) || (y<x && y>z)) {
			mid = y;
		}
		
		// z가 중간값일 때
		else if((z>x && z<y) || (z<x && z>y)) {
			mid = z;
		}
		
		System.out.print("중간 값은 " + mid);
		
		scanner.close();
	}

}
