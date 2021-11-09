
public class Oval implements Shape{
	int width, height;
	
	// 생성자
	public Oval(int width, int height) {
		this.width = width; this.height = height;
	}
	
	// draw 메소드 재정의
	@Override
	public void draw() {
		System.out.println("너비: " + width + ", 높이: " + height + "에 내접하는 타원입니다.");
	}
	
	// getArea 메소드 재정의
	@Override
	public double getArea() {
		return PI * width/2 * height/2;
	}
}
