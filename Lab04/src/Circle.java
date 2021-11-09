
public class Circle implements Shape{
	int radius;
	
	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// Shape의 draw 메소드 재정의
	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	
	// Shape의 getArea 메소드 재정의
	@Override
	public double getArea() {
		return PI * radius * radius;
	}
}
