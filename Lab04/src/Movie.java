// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 4
// �������� : Ŭ���� ����

public class Movie extends Item {
	String director;
	
	public Movie(String name, int price, String director) {
		this.name = name; this.price = price; this.director = director;
	}
	
	public String toString() {
		return "[MOVIE] " + name + ", ����: " + director;
	}
}
