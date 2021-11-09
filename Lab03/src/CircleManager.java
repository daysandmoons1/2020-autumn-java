// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 24.
// ������ȣ : �ǽ� 3
// �������� : Circle Ŭ������ CircleManager Ŭ������ �ϼ�

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	
	//x, y, radius �ʱ�ȭ
	public Circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	
	// ȭ�鿡 ���
	public void show() {
		System.out.println("(" + x + "," + y + ") " + radius);
	}
	
	// ���� ����ؼ� ��ȯ, PI ���� Math Ŭ������ PI ��� Ȱ�� 
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
}
public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0; i< c.length; i++) {
			System.out.print("x, y, radius>>");
			
			// x, y, ������ �б�
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			
			// Circle ��ü ����
			c[i] = new Circle(x, y, radius);
		}
		
		// ��� Circle ��ü ���(�ش� �޼ҵ� ���)
		for(int i=0; i<c.length; i++)
			c[i].show();
		
		int biggestIndex = 0;
		double max = 0;
		for(int i=0; i<c.length; i++) {
			
			 // ���� �Լ��� ���� ��
			if(c[i].getArea()>max) {
				max = c[i].getArea();
				// ���� ū ������ ���� Index ����
				biggestIndex = i;
			}
		}
		System.out.print("���� ������ ū ����");
		c[biggestIndex].show();
		scanner.close();
	}
}
