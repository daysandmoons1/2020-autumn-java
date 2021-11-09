// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 3
// 문제설명 : 학생 만들기

public class Human {
	String name;
	int age;
	
	// 생성자 작성
	public Human() {
		name = "none"; age = 0;
	}
	public Human(String name, int age) {
		this.name = name; this.age = age;
	}
	
	// 접근자
	void getHuman() {
		System.out.print("이름: " + name);
		System.out.println(", 나이: " + age);
	}
	
	// 변경자 메소드
	void setHuman(String name, int age) {
		this.name = name; this.age = age;
	}
	
	// toString 메소드
	public String toString() {
		return "이름: " + name + ", 나이: "+ age + ", ";
	}
}
