// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 28.
// ������ȣ : �ǽ� 1
// �������� : Circle Ŭ������ �ۼ�

public class Circle {
	int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	
	public String toString() {
		return "Circle(" + x + ", " + y + ") ������ " + radius;
	}
	
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(x == c.x && y == c.y && radius == c.radius) return true;
		else return false;
	}
}