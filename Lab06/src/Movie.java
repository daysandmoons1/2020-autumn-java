// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 29.
// ������ȣ : �ǽ� 5
// �������� : ��ȭ ���� ���α׷� Ŭ���� ����


public class Movie {
	String title;
	String director;
	String genre;
	int release;
	
	
	// �⺻ ������
	public Movie() {}

	// �� ���� �� ���� ���� �� ���� �޼ҵ�
	public void setTi(String title) {
		this.title = title;
	}
	
	public void setDir(String director) {
		this.director = director;
	}
	
	public void setGen(String genre) {
		this.genre = genre;
	}
	
	public void setRel(int release) {
		this.release = release;
	}
	
	// ��ü ���� ��� �޼ҵ�
	public void printInfo() {
		System.out.println("����: " + title); System.out.println("����: " + director);
		System.out.println("�帣: " + genre); System.out.println("�����⵵: " + release);
		System.out.println();
	}
}