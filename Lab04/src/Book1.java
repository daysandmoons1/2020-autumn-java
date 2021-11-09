// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 2
// 문제설명 : Magazine 만들기

public class Book1 {
	private String title;
	private int pages;
	private String author;
	private static int count = 0;
	
	
	// 생성자 작성
	public Book1() {
		title = "none"; pages = 0; author = "none"; count += 1;
	}
	public Book1(String title, int pages, String author) {
		this.title = title; this.pages = pages; this.author = author; count += 1;
	}
	
	
	// 순서대로 전체 필드, 제목, 페이지 수, 저자에 대한 설정자
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
	
	
	// 순서대로 전체 필드, 제목, 페이지 수, 저자, 책의 개수에 대한 접근자
	public void getBook1() {
		System.out.println("제목: " + title);
		System.out.println("페이지수: " + pages);
		System.out.println("저자: " + author);
		System.out.println("책의 개수: " + count);
	}
	public void getBook1Title() {
		System.out.println("제목: " + title);
	}
	public void getBook1Pages() {
		System.out.println("페이지수: " + pages);
	}
	public void getBook1Author() {
		System.out.println("저자: " + author);
	}
	public void getBook1Count() {
		System.out.println("책의 개수: " + count);
	}
	
}
