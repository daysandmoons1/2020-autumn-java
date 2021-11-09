// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 23.
// 문제번호 : 실습 4
// 문제설명 : 배열의 크기를 입력 받고 생성된 배열에 랜덤으로 숫자 삽입

import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int key = 0;
		
		// 입력
		System.out.print("정수 몇 개? ");
		int n = scanner.nextInt();
		while(n > 100 || n < 0) {
			System.out.print("1~100의 수를 입력해주세요: ");
			n = scanner.nextInt();
		}
		
		// 배열 생성
		int intArray[] = new int[n];
		
		// 생성된 배열에 랜덤으로 정수 삽입
		for(int i=0;i<intArray.length;i++) {
			int random = (int)(Math.random()*100 + 1);
			for(int j=0;j<intArray.length;j++) {
				if(intArray[j] == random) {
					key = 1;
				}
			}
			
			// 랜덤 값이 기존에 존재 하지 않는다면 배열에 삽입
			if(key != 1) {
				intArray[i] = random;
			}
			
			// 기존에 존재한다면  삽입하지 않고 카운트를 1 줄임
			else {
				key = 0;
				i--;
			}
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i] + " ");
		}
		
		scanner.close();
	}
}
