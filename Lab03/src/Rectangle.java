// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 24.
// ������ȣ : �ǽ� 2
// �������� : Rectangle Ŭ������ �ۼ�

public class Rectangle {
	
	// ��� ���� ����
	int x, y, width, height;
	
	// x, y, width, height ���� �Ű� ������ �޾� �ʵ带 �ʱ�ȭ�ϴ� ������
	public Rectangle(int x, int y, int width, int height) {
		this.x = x; this.y = y; this.width = width; this.height = height;
	}
	
	// �簢�� ���� ����
	public int square() {
		return width * height;
	}
	
	// �簢���� ��ǥ�� ���̸� ȭ�鿡 ���
	public void show() {
		System.out.println("(" + x + ", " + y + ")" + "���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	
	// �Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����, ������� �����ص� true ����
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
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
