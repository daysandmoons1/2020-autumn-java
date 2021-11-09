// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 28.
// 문제번호 : 실습 1
// 문제설명 : Circle 클래스를 작성

public class Circle {
	int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	
	public String toString() {
		return "Circle(" + x + ", " + y + ") 반지름 " + radius;
	}
	
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(x == c.x && y == c.y && radius == c.radius) return true;
		else return false;
	}
}