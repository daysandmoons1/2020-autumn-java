
public class Rect implements Shape{
	int width, height;
	
	// ������
	public Rect(int width, int height) {
		this.width = width; this.height = height;
	}
	
	// Shape�� draw �Լ� ������
	@Override
	public void draw() {
		System.out.println("�ʺ�: " + width + ", ����: " + height + "�� �簢���Դϴ�.");
	}
	
	// Shape�� getArea �Լ� ������
	@Override
	public double getArea() {
		return width * height;
	}
}
