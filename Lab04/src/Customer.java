// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 1
// 문제설명 : 고객 만들기

class Customer extends Person {
	private String number;
	private int mileage;
	
	// 생성자 작성
	public Customer() {
		number = "none"; mileage = 0;
	}
	public Customer(String number, int mileage) {
		this.number = number; this.mileage = mileage;
	}
	
	// 순서대로 전체 필드, 회원번호, 마일리지에 대한 설정자
	public void setCustomer(String number, int mileage) {
		this.number = number; this.mileage = mileage;
	}
	public void setCustomerNumber(String number) {
		this.number = number;
	}
	public void setCustomerMileage(int mileage) {
		this.mileage = mileage;
	}
	
	// 순서대로 전체 필드, 회원번호, 마일리지에 대한 접근자
	public void getCustomer() {
		System.out.println("회원번호: " + number);
		System.out.println("마일리지:  " + mileage);
	}
	public void getCustomerNumber() {
		System.out.println("회원번호: " + number);
	}
	public void getCustomerMileage() {
		System.out.println("마일리지:  " + mileage);
	}
}
