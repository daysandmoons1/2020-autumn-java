// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 24.
// 문제번호 : 실습 2
// 문제설명 : Rectangle 클래스를 작성

public class Rectangle {
	
	// 멤버 변수 선언
	int x, y, width, height;
	
	// x, y, width, height 값을 매개 변수로 받아 필드를 초기화하는 생성자
	public Rectangle(int x, int y, int width, int height) {
		this.x = x; this.y = y; this.width = width; this.height = height;
	}
	
	// 사각형 넓이 리턴
	public int square() {
		return width * height;
	}
	
	// 사각형의 좌표와 넓이를 화면에 출력
	public void show() {
		System.out.println("(" + x + ", " + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	// 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴, 사격형이 동일해도 true 리턴
	public boolean contains(Rectangle r) {
		if((this.x <= r.x && this.y <= r.y) 
				&& ((this.x + this.width) >= (r.x + r.width)) 
				&& ((this.y + this.height) >= (r.y + r.height)))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}
