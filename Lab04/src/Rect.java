
public class Rect implements Shape{
	int width, height;
	
	// 생성자
	public Rect(int width, int height) {
		this.width = width; this.height = height;
	}
	
	// Shape의 draw 함수 재정의
	@Override
	public void draw() {
		System.out.println("너비: " + width + ", 높이: " + height + "의 사각형입니다.");
	}
	
	// Shape의 getArea 함수 재정의
	@Override
	public double getArea() {
		return width * height;
	}
}
