// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 4
// 문제설명 : 클래스 연습

public class Book extends Item{
	String author;
	
	public Book(String name, int price, String author) {
		this.name = name; this.price = price; this.author = author;
	}
	
	public String toString() {
		return "[BOOK] " + name + ", 저자: " + author;
	}
}
