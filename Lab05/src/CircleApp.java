// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 28.
// ������ȣ : �ǽ� 1
// �������� : Circle Ŭ������ �ۼ�

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}
}
