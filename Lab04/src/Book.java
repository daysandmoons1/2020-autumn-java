// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 4
// �������� : Ŭ���� ����

public class Book extends Item{
	String author;
	
	public Book(String name, int price, String author) {
		this.name = name; this.price = price; this.author = author;
	}
	
	public String toString() {
		return "[BOOK] " + name + ", ����: " + author;
	}
}
