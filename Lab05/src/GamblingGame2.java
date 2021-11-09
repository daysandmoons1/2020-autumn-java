// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 28.
// 문제번호 : 실습 5
// 문제설명 : 실습 4의 갬블링 게임을 n명이 하도록 수정

import java.util.Scanner;

public class GamblingGame2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, enter;
		int num, flag = 0;
		
		// 참여 인원 입력
		System.out.print("갬블링 게임에 참여 할 선수 인원>>");
		num = scanner.nextInt();
		Person player[] = new Person[num];
		
		// 선수 이름 입력
		for(int i=0; i<num; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			name = scanner.next();
			player[i] = new Person(name);
		}
		
		
		// 게임 시작
		// while문 탈출을 위해 flag 변수 사용
		// person 객체의 세 수가 동일한 값(참)인 경우 flag = 1 됨
		scanner.nextLine();
		while(flag!=1) {
			
			for(int i=0; i<num; i++) {
				player[i].printName();
				scanner.nextLine();
				player[i].random();
				if(player[i].compare()) {
					flag = 1;			// while문 탈출 조건
					break;
				}
			}
		}
		
		scanner.close();
	}
}