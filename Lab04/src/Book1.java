// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 25.
// ������ȣ : �ǽ� 2
// �������� : Magazine �����

public class Book1 {
	private String title;
	private int pages;
	private String author;
	private static int count = 0;
	
	
	// ������ �ۼ�
	public Book1() {
		title = "none"; pages = 0; author = "none"; count += 1;
	}
	public Book1(String title, int pages, String author) {
		this.title = title; this.pages = pages; this.author = author; count += 1;
	}
	
	
	// ������� ��ü �ʵ�, ����, ������ ��, ���ڿ� ���� ������
	public void setBook1(String title, int pages, String author) {
		this.title = title; this.pages = pages; this.author = author;
	}
	public void setBook1Title(String title) {
		this.title = title;
	}
	public void setBook1Pages(int pages) {
		this.pages = pages;
	}
	public void setBook1Author(String author) {
		this.author = author;
	}
	
	
	// ������� ��ü �ʵ�, ����, ������ ��, ����, å�� ������ ���� ������
	public void getBook1() {
		System.out.println("����: " + title);
		System.out.println("��������: " + pages);
		System.out.println("����: " + author);
		System.out.println("å�� ����: " + count);
	}
	public void getBook1Title() {
		System.out.println("����: " + title);
	}
	public void getBook1Pages() {
		System.out.println("��������: " + pages);
	}
	public void getBook1Author() {
		System.out.println("����: " + author);
	}
	public void getBook1Count() {
		System.out.println("å�� ����: " + count);
	}
	
}
