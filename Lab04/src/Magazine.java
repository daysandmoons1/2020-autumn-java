// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 2
// 문제설명 : Magazine 만들기

public class Magazine extends Book1 {
	String date;
	
	
	// 생성자 작성
	public Magazine () {
		this.date = "none";
	}
	public Magazine (String date) {
		super();
		this.date = date;
	}

	
	// 발매일에 대한 설정자
	public void setMagazine(String date) {
		this.date = date;
	}
	
	
	// 발매일에 대한 접근자
	public void getMagazine() {
		System.out.println("발매일: " + date);
	}
	
}
