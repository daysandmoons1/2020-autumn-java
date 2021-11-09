
public class Circle implements Shape{
	int radius;
	
	// ������
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// Shape�� draw �޼ҵ� ������
	@Override
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}
	
	// Shape�� getArea �޼ҵ� ������
	@Override
	public double getArea() {
		return PI * radius * radius;
	}
}
