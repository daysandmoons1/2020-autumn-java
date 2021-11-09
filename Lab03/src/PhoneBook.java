// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 24.
// 문제번호 : 실습 4
// 문제설명 : Phone 클래스 작성

import java.util.Scanner;

class Phone {
	String name;
	String tel;
	
	// 생성자 작성
	public Phone (String name, String tel) {
		this.name = name; this.tel = tel;
	}
}
public class PhoneBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		String name, tel, target = "";
		
		// 배열 선언
		System.out.print("인원수>>>");
		num = scanner.nextInt();
		Phone p[] = new Phone[num];
		
		// 이름, 전화번호 읽기 및 Phone 객체 생성
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>>");
			name = scanner.next();
			tel = scanner.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		// "그만" 입력되기 전까지 검색 대상 입력 반복
		while(!("그만".equals(target))) {
			System.out.print("검색할 이름>>>");
			target = scanner.next();
			
			// 이름 비교 및 전화번호 출력
			for(int i=0; i<p.length; i++) {
				if((target).equals(p[i].name))
					System.out.println(target + "의 번호는 " + p[i].tel + " 입니다.");
			}
		}
		scanner.close();
	}
}
