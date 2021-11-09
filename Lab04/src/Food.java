// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 4
// 문제설명 : 클래스 연습

public class Food extends Item {
	
	public Food(String name, int price) {
		this.price = price; this.name = name;
	}
	public String toString() {
		return "[FOOD] " + name;
	}
}