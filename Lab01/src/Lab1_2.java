// 1812515 김선효
// 21. 06. 22.
// 1번째 문제
// 2자리 정수 입력 시, 10의 자리와 1의 자리 비교 후 결과 출력

import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("2자리수 정수 입력(10~99)>>");
		int a = scanner.nextInt();
		
		// 입력한 수가 10에서 99 사이가 아닐 때
		if(a < 10 || a > 99) {
			System.out.print("Error! 10에서 99 사이의 숫자를 입력해주세요.");
			
		}
		
		// 입력한 수의 10의 자리와 1의 자리가 같을 때
		else if(a/10 == a%10){
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		
		// 입력한 수의 10의 자리와 1의 자리가 다를 때
		else {
			System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		scanner.close();
	}
}
