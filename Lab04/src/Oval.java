
public class Oval implements Shape{
	int width, height;
	
	// ������
	public Oval(int width, int height) {
		this.width = width; this.height = height;
	}
	
	// draw �޼ҵ� ������
	@Override
	public void draw() {
		System.out.println("�ʺ�: " + width + ", ����: " + height + "�� �����ϴ� Ÿ���Դϴ�.");
	}
	
	// getArea �޼ҵ� ������
	@Override
	public double getArea() {
		return PI * width/2 * height/2;
	}
}
