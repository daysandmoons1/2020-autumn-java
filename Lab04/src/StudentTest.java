// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 3
// 문제설명 : 학생 만들기

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 배열 선언 및 생성
		Human human[] = new Human[3];
		Student student[] = new Student[3];
		
		
		//Human 값 입력
		for(int i=0; i<3; i++) {
			System.out.print("[" + (i+1) + "] Human 입력: ");
			human[i] = new Human(scanner.next(), scanner.nextInt());
		}
		
		//Student 값 입력
		for(int i=0; i<3; i++) {
			System.out.print("[" + (i+1) + "] Student 입력: ");
			student[i] = new Student(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt());
		}
		
		// human.getHuman 호출해서 정보 출력
		for(int i=0; i<3; i++) {
			human[i].getHuman();
		}
		
		// student.toString 호출해서 정보 출력
		for(int i=0; i<3; i++) {
			System.out.print("[학생 정보]" + student[i].toString());
		}
		scanner.close();

	}

}
