// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 28.
// 문제번호 : 실습 4
// 문제설명 : 각 사람이 자기 차례에서 <Enter> 키를 입력하면, 3개의 난수가 발생

import java.util.Scanner;

class Person {
	String name;
	int n1, n2, n3;
	
	// 생성자 작성
	public Person(String name) {
		this.name = name;
	}
	
	// 난수 발생 메소드
	public void random() {
		n1 = (int)(Math.random()*3 + 1);
		n2 = (int)(Math.random()*3 + 1);
		n3 = (int)(Math.random()*3 + 1);
	}
	
	// 이름 출력 메소드
	public void printName() {
		System.out.print("[" + this.name + "] : <Enter>");
	}
	
	// 난수 비교 및 출력 메소드
	// 참(세 수가 동일한 값)인 경우 1 반환
	// 거짓(세 수가 다른 값)인 경우 0 반환 
	public boolean compare() {
		System.out.print("\t\t" + n1 + "\t" + n2 + "\t" + n3 + "\t");
		if(n1 == n2 && n2 == n3) {
			System.out.println(name + "님이 이겼습니다!");
			return true;
		}
		else {
			System.out.println("아쉽군요!");
			return false;
		}
	}
	
}
public class GamblingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person player[] = new Person[2];
		String name, enter;
		
		// 선수 이름 입력
		System.out.print("1번째 선수 이름>>");
		name = scanner.next();
		player[0] = new Person(name);
		
		System.out.print("2번째 선수 이름>>");
		name = scanner.next();
		player[1] = new Person(name);
		
		
		// 게임 시작
		scanner.nextLine();
		while(true) {
			
			
			// 1번째 플레이어
			// 이름 출력
			player[0].printName();
			
			// 엔터 입력 시 난수 생성
			scanner.nextLine();
			player[0].random();
			
			// 난수 비교 후 결과 출력
			// 참(세 수가 동일 값)인 경우 반복문 탈출
			if(player[0].compare())
				break;
			
			
			// 1번째 플레이어와 동일
			player[1].printName();
			scanner.nextLine();
			player[1].random();
			if(player[1].compare())
					break;
		}
		
		scanner.close();
	}
}