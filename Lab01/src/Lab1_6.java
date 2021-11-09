// 1812515 김선효
// 21. 06. 22.
// 3번째 문제
// 369 게임

import java.util.Scanner;

public class Lab1_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int a = scanner.nextInt();
		
		// 10의 자리에 369 존재
		if(a/10 == 3 || a/10 == 6 || a/10 == 9) {
			
			// 1의 자리에 369 존재
			if(a%10 == 3 || a%10 == 6 || a%10 == 9) {
				System.out.print("박수짝짝");
			}
			
			// 1의 자리에 369 존재하지 않음
			else
				System.out.print("박수짝");
		}
		
		// 한자리 수 일 때
		else if(a/10 == 0){
			
			// 369 존재
			if(a%10 == 3 || a%10 == 6 || a%10 == 9) {
				System.out.print("박수짝");
			}
			
			// 369 존재하지 않음
			else
				System.out.print("박수없음");
		}
		
		// 입력된 수가 2자리 이상이고 10의 자리에 369가 없을 때
		else
			System.out.print("박수없음");
		
		scanner.close();
	}

}
