// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 4
// �������� : Ŭ���� ����

public class Food extends Item {
	
	public Food(String name, int price) {
		this.price = price; this.name = name;
	}
	public String toString() {
		return "[FOOD] " + name;
	}
}