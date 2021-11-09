// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 4
// 문제설명 : 클래스 연습

public class Movie extends Item {
	String director;
	
	public Movie(String name, int price, String director) {
		this.name = name; this.price = price; this.director = director;
	}
	
	public String toString() {
		return "[MOVIE] " + name + ", 감독: " + director;
	}
}
