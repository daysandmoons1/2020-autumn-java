// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 1
// 문제설명 : 고객 만들기


public class Person {
	private String name;
	private String address;
	private String phone;
	
	
	// 생성자 작성
	public Person() {
		name = "none"; address = "none"; phone = "none";
	}
	public Person(String name, String address, String phone) {
		this.name = name; this.address = address; this.phone = phone;
	}
	
	
	// 순서대로 전체필드, 이름, 주소, 전화번호에 대한 설정자
	public void setPerson(String name, String address, String phone) {
		this.name = name; this.address = address; this.phone = phone;
	}
	public void setPersonName(String name) {
		this.name = name;
	}
	public void setPersonAddr(String address) {
		this.address = address;
	}
	public void setPersonPhone(String phone) {
		this.phone = phone;
	}
	
	
	// 순서대로 전체필드, 이름, 주소, 전화번호에 대한 접근자
	public void getPerson() {
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		System.out.println("전화번호: " + phone);
	}
	public void getPersonName() {
		System.out.println("이름: " + name);
	}
	public void getPersonAddr() {
		System.out.println("주소: " + address);
	}
	public void getPersonPhone() {
		System.out.println("전화번호: " + phone);
	}
}
